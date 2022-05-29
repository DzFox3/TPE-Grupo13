package fi.unju.edu.ar.model;

import java.time.LocalDate;

public class Usuario {
    
    private String nombre;
    private String email;
    private LocalDate fechaNac;

    
    public Usuario() {
    }


    public Usuario(String nombre, String email, LocalDate fechaNac) {
        this.nombre = nombre;
        this.email = email;
        this.fechaNac = fechaNac;
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


    
}
