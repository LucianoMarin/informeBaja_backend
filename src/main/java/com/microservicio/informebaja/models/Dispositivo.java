package com.microservicio.informebaja.models;

import jakarta.persistence.Column;
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
public class Dispositivo {

    @Id 
    @GeneratedValue (strategy = GenerationType.IDENTITY )
    private Long id;

    @ManyToOne 
    @JoinColumn (name="tipoDispositivo_id")
    private TipoDispositivo tipoDispositivo;

    @Column (name="marca")
    private String marca;

    @Column(name="modelo")
    private String modelo;

    @Column (name="serie", unique = true)
    private String serie;

    @Column (name="cgu", unique = true)
    private String cgu;

  
    @ManyToOne 
    @JoinColumn (name="dependencia_id")
    private Dependencia dependencia;

    @Column (name="estado")
    private String estado;


    public Dispositivo(){}

    public Dispositivo(Long id,  String serie, String cgu, TipoDispositivo tipoDispositivo, String marca, String modelo,Dependencia dependencia){

        this.id=id;
        this.serie=serie;
        this.cgu=cgu;
        this.tipoDispositivo=tipoDispositivo;
        this.marca=marca;
        this.modelo=modelo;
        this.dependencia=dependencia;


    }
    

        public Dispositivo(Long id,  String cgu, TipoDispositivo tipoDispositivo, String marca, String modelo,Dependencia dependencia){

        this.id=id;
        this.cgu=cgu;
        this.tipoDispositivo=tipoDispositivo;
        this.marca=marca;
        this.modelo=modelo;
        this.dependencia=dependencia;
    }


    
        public Dispositivo(Long id, String serie, TipoDispositivo tipoDispositivo, String marca, String modelo, String cgu){

        this.id=id;
        this.cgu=cgu;
        this.serie=serie;
        this.tipoDispositivo=tipoDispositivo;
        this.marca=marca;
        this.modelo=modelo;
     

    }
    
}
