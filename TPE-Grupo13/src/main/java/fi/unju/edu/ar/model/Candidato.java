package fi.unju.edu.ar.model;

public class Candidato {
	
	
	private int Codigo;
	private String Nombre;
	private String Genero;
	private String Descripcion;
	private int Votos;
	
	public Candidato() {
		
	}
	
	public Candidato(int codigo, String nombre, String genero, String descripcion, int votos) {
		this.Codigo  = codigo;
		this.Nombre = nombre;
		this.Genero = genero;
		this.Descripcion = descripcion;
		this.Votos = votos;
	}
	
	public int getCodigo() {
		return Codigo;
	}
	public void setCodigo(int codigo) {
		Codigo = codigo;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getGenero() {
		return Genero;
	}
	public void setGenero(String genero) {
		Genero = genero;
	}
	public String getDescripcion() {
		return Descripcion;
	}
	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}
	public int getVotos() {
		return Votos;
	}
	public void setVotos(int votos) {
		Votos = votos;
	}
}
