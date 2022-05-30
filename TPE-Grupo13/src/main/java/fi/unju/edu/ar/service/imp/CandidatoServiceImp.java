package fi.unju.edu.ar.service.imp;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fi.unju.edu.ar.model.Candidato;
import fi.unju.edu.ar.service.ICadidatoService;
import fi.unju.edu.ar.util.ListaCandidato;

@Service("CandidatoServiceImpList")
public class CandidatoServiceImp implements ICadidatoService {

	@Autowired
	private ListaCandidato listaCandidato;

	@Override
	public void modifyCandidato(Candidato candidato) {
		for (Candidato can : listaCandidato.getCandidato()) {
			if (can.getCodigo() == candidato.getCodigo()) {
				can.setNombre(candidato.getNombre());
				can.setGenero(candidato.getGenero());
				can.setDescripcion(candidato.getDescripcion());
				can.setVotos(candidato.getVotos());
			}
		}
	}

	@Override
	public void deleteCandidato(int codigo) {

	}

	@Override
	public ListaCandidato getListaCandidato() {

		return listaCandidato;
	}

	@Override
	public Candidato findCandidato(int codigo) {
		Optional<Candidato> candidato = listaCandidato.getCandidato().stream().filter(c -> c.getCodigo() == codigo)
				.findFirst();
		return candidato.get();
	}

}
