package fi.unju.edu.ar.model;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Candidato {
	@Min(value=1, message="El valor mínimo es 1") @Max(value=9999,message="El valor máximo permitido es 9999")
	private int Codigo;
	@Size(min=3, max=20, message="El nombre debe tener entre 3 a 20 caracteres")
	@NotEmpty(message="El nombre del alumno no puede ser vacio")
	private String Nombre;
	@NotNull(message="Esta Vacio")
	private String Genero;
	  @NotEmpty(message="Esta Vacio")
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
