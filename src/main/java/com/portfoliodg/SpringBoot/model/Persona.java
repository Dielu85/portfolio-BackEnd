package com.portfoliodg.SpringBoot.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.io.Serializable;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Persona implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nombre;
    private String backimg;
    private String foto;
    private String titulo;
    private String resumen;
    private String ubicacion;
    private String email;
    private String telefono;


    public Persona() {

    }

    public Persona(Long id, String nombre, String backimg, String foto, String titulo, String resumen,
                   String ubicacion, String email, String telefono) {
        this.id = id;
        this.nombre = nombre;
        this.backimg = backimg;
        this.foto = foto;
        this.titulo = titulo;
        this.resumen = resumen;
        this.ubicacion = ubicacion;
        this.email = email;
        this.telefono = telefono;        
    }

    // Add other constructors, getters, and setters
}

