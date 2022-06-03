package fi.unju.edu.ar.service;

import fi.unju.edu.ar.model.Candidato;
import fi.unju.edu.ar.util.ListaCandidato;

public interface ICandidatoService {

    public Boolean saveCandidato(Candidato candidato);

    public void modifyCandidato(Candidato candidato);

    public void deleteCandidato(int codigo);

    public ListaCandidato getListaCandidato();

    public Candidato findCandidato(int codigo);
}
