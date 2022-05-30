package fi.unju.edu.ar.service;

import fi.unju.edu.ar.model.Usuario;
import fi.unju.edu.ar.util.ListaUsuario;

public interface IVotanteService {

	public ListaUsuario getListaUsuario();
	public Boolean saveVotante(Usuario usuario);
	
}
