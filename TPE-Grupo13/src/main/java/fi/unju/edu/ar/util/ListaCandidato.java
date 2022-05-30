package fi.unju.edu.ar.util;

import java.util.ArrayList;

import fi.unju.edu.ar.model.Candidato;

public class ListaCandidato {

    private ArrayList<Candidato> candidato;
    
    
	public ListaCandidato(){
        candidato = new ArrayList<Candidato>();

        candidato.add(new Candidato(1010,"Duki", "Trap", "Canta Autor", 0));
        candidato.add(new Candidato(1011,"Nicky Nicole", "Trap", "Canta Autor", 0));
        candidato.add(new Candidato(1012,"Paulo Londra", "Trap", "Canta Autor", 0));
        candidato.add(new Candidato(1013,"Lit Killah", "Trap", "Canta Autor", 0));
    }

	public ListaCandidato(ArrayList<Candidato> candidato) {
		this.candidato = candidato;
	}
	public ArrayList<Candidato> getCandidato() {
		return candidato;
	}

	public void setCandidato(ArrayList<Candidato> candidato) {
		this.candidato = candidato;
	}
}
