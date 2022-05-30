package fi.unju.edu.ar.model;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import org.springframework.stereotype.Component;

@Component
public class Candidato {
	
	private int Codigo;
	@Size(min=3, max=30, message="El nombre debe tener entre 3 a 30 caracteres")
	@NotEmpty(message="El nombre del candidato no puede ser vacio")
	private String Nombre;
	@Size(min=3, max=30, message="El genero debe tener entre 3 a 30 caracteres")
	@NotEmpty(message="El genero no puede ser vacio")
	private String Genero;
	@NotEmpty(message="La descripcion no puede estar vacia")
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
