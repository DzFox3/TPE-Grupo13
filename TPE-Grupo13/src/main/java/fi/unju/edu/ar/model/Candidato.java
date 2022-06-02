package fi.unju.edu.ar.model;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import org.springframework.stereotype.Component;

@Component
public class Candidato {
	
	private int codigo;
	@Size(min=4, max=6, message="El nombre debe tener entre 3 a 30 caracteres")
	@NotEmpty(message="El nombre del candidato no puede ser vacio")
	private String nombre;
	@Size(min=3, max=30, message="El genero debe tener entre 3 a 30 caracteres")
	@NotEmpty(message="El genero no puede ser vacio")
	private String genero;
	@NotEmpty(message="La descripcion no puede estar vacia")
	private String descripcion;
	private int votos;
	
	public Candidato() {
		
	}
	
	public Candidato(int codigo, String nombre, String genero, String descripcion, int votos) {
		this.codigo  = codigo;
		this.nombre = nombre;
		this.genero = genero;
		this.descripcion = descripcion;
		this.votos = votos;
	}
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		nombre = nombre;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		genero = genero;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		descripcion = descripcion;
	}
	public int getVotos() {
		return votos;
	}
	public void setVotos(int votos) {
		votos = votos;
	}
}
