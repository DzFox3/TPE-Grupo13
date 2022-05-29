package fi.unju.edu.ar.model;

import java.time.LocalDate;

public class Usuario {
    
    private String nombre;
    private String email;
    private LocalDate fechaNac;
    private int dni;
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
