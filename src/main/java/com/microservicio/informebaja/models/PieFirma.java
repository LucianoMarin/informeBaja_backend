package com.microservicio.informebaja.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Entity 
@Getter 
@Setter 
public class PieFirma {

    @Id 
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    
    @ManyToOne 
    @JoinColumn (name="trabajador_id")
    private Trabajador trabajador;



    public PieFirma(){}


    public PieFirma(Long id, Trabajador trabajador){
        
        this.id=id;
        this.trabajador=trabajador;

    }



}
