package fi.unju.edu.ar.model;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotEmpty;

import org.springframework.stereotype.Component;

@Component
public class Candidato {

	private int codigo;
	@NotEmpty(message = "El nombre del candidato no puede ser vacio")
	private String nombre;
	@NotEmpty(message = "El genero no puede ser vacio")
	private String genero;
	@NotEmpty(message = "La descripcion no puede estar vacia")
	private String descripcion;
	private int votos;

	public Candidato() {

	}

	public Candidato(int codigo, String nombre, String genero, String descripcion, int votos) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.genero = genero;
		this.descripcion = descripcion;
		this.votos = votos;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getVotos() {
		return votos;
	}

	public void setVotos(int votos) {
		this.votos = votos;
	}

}
