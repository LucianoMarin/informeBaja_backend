package com.microservicio.informebaja.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity 
@Getter 
@Setter 
public class Orientacion {

    @Id 
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column (name="nombre", unique=true)
    private String nombre;


    public Orientacion(){}


    public Orientacion(Long id, String nombre){
        this.id=id;
        this.nombre=nombre;
    }



    
}
