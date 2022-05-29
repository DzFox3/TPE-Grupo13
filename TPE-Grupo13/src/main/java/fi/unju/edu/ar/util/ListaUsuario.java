package fi.unju.edu.ar.util;

import java.time.LocalDate;
import java.util.ArrayList;

import fi.unju.edu.ar.model.Candidato;
import fi.unju.edu.ar.model.Usuario;

public class ListaUsuario {
    
    private ArrayList<Usuario> usuario;

    public ListaUsuario(){

        usuario = new ArrayList<Usuario>();

        Candidato canditato1 = new Candidato(1, "duki", "trap", "gordito fachero", 0);

        usuario.add(new Usuario("gustavo", "cari", LocalDate.of(1999, 12, 21), 41789824,canditato1));
    }


    public ArrayList<Usuario> getUsuario() {
        return usuario;
    }

    public void setUsuario(ArrayList<Usuario> usuario) {
        this.usuario = usuario;
    }

    
}
