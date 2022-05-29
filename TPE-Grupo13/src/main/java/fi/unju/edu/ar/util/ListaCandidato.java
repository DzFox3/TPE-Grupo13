package fi.unju.edu.ar.util;

import java.util.ArrayList;

import fi.unju.edu.ar.model.Candidato;

public class ListaCandidato {

    private ArrayList<Candidato> candidato;
    
    
	public ListaCandidato(){
        candidato = new ArrayList<Candidato>();

        candidato.add(new Candidato(1010,"Freddy Duki", "Rock", "Canta Autor", 0));
        candidato.add(new Candidato(1010,"Freddy Mercury", "Rock", "Canta Autor", 0));
        candidato.add(new Candidato(1010,"Freddy Mercury", "Rock", "Canta Autor", 0));
        candidato.add(new Candidato(1010,"Freddy Mercury", "Rock", "Canta Autor", 0));
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
