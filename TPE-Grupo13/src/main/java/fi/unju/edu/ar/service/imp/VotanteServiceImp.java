package fi.unju.edu.ar.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fi.unju.edu.ar.util.ListaUsuario;
import fi.unju.edu.ar.model.Usuario;
import fi.unju.edu.ar.service.IVotanteService;

@Service("VotanteServiceImpList")
public class VotanteServiceImp implements IVotanteService{

	@Autowired
	private ListaUsuario listaVotante;
	
	@Override
	public ListaUsuario getListaUsuario() {

		return listaVotante;
	}
	
	@Override
	public Boolean saveVotante(Usuario usuario) {
		
		return listaVotante.getUsuario().add(usuario);
	}
}
