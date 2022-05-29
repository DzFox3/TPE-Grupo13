package fi.unju.edu.ar.util;

import java.util.ArrayList;

import fi.unju.edu.ar.model.Candidato;

public class ListaCandidatos {

    private ArrayList<Candidato> candidato;
    
	public ListaCandidatos(){
        candidato = new ArrayList<Candidato>();

        candidato.add(new Candidato(1010,"Freddy Mercury", "Rock", "Canta Autor", 4));
    }

	public ListaCandidatos(ArrayList<Candidato> candidatos) {
		this.candidato = candidatos;
	}
	public ArrayList<Candidato> getCandidatos() {
		return candidato;
	}

	public void setCandidatos(ArrayList<ListaCandidatos> candidatos) {
		this.candidato = candidato;
	}
}
