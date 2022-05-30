package fi.unju.edu.ar.model;

import java.time.LocalDate;

import javax.validation.constraints.Email;
import javax.validation.constraints.FutureOrPresent;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;


@Component
public class Usuario {
	@Size(min=3, max=20, message="El nombre debe tener entre 3 a 20 caracteres")
	@NotEmpty(message="El nombre del alumno no puede ser vacio")
    private String nombre;
	@NotEmpty @Email
    private String email;
    private LocalDate fechaNac;
    @Min(value=1000000,message="El DNI debe ser mayor a 1.000.000")
    private int dni;
    @NotNull(message="Debe seleccionar un candidato")
    private Candidato candidato;

    
    public Usuario() {
    }


    public Usuario(String nombre, String email, LocalDate fechaNac, int dni, Candidato candidato) {
        this.nombre = nombre;
        this.email = email;
        this.fechaNac = fechaNac;
        this.dni = dni;
        this.candidato = candidato;
    }


    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
    }


    public LocalDate getFechaNac() {
        return fechaNac;
    }


    public void setFechaNac(LocalDate fechaNac) {
        this.fechaNac = fechaNac;
    }


    public int getDni() {
        return dni;
    }


    public void setDni(int dni) {
        this.dni = dni;
    }


    public Candidato getCandidato() {
        return candidato;
    }


    public void setCandidato(Candidato candidato) {
        this.candidato = candidato;
    }
    
    
    
    

    
}
