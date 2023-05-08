package com.portfoliodg.SpringBoot.model;

import java.io.Serializable;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Persona implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nombre;
    private String apellido;
    private String email;
    
    public Persona() {
        
    }
    
    public Persona(Long id, String nombre, String apellido, String email){
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
    }
}
