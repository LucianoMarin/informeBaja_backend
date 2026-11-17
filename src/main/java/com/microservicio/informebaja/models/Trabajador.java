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
public class Trabajador {

@Id 
@GeneratedValue (strategy = GenerationType.IDENTITY)
private Long id;

@Column (name="rut", unique=true)
private String rut;

@Column (name="primerNombre")
private String primerNombre;

@Column (name="segundoNombre")
private String segundoNombre;

@Column (name="apellidoPaterno")
private String apellidoPaterno;

@Column (name="apellidoMaterno")
private String apellidoMaterno;

@Column (name="escalafon")
private String escalafon;

@Column (name="contrato")
private String contrato;

@Column (name="funcion")
private String funcion;


public Trabajador(){
}



public Trabajador(Long id, String rut, String primerNombre, String segundoNombre,String apellidoPaterno,
     String apellidoMaterno, String escalafon, String contrato, String funcion){


        this.id=id;
        this.rut=rut;
        this.primerNombre=primerNombre;
        this.segundoNombre=segundoNombre;
        this.apellidoPaterno=apellidoPaterno;
        this.apellidoMaterno=apellidoMaterno;
        this.escalafon=escalafon;
        this.contrato=contrato;
        this.funcion=funcion;

}



public static Trabajador conEscalafon(Long id, String rut, String primerNombre, String segundoNombre,String apellidoPaterno,
     String apellidoMaterno,String escalafon,String funcion){


        return new Trabajador(id,rut,primerNombre,segundoNombre,apellidoPaterno,apellidoMaterno,escalafon,null,funcion);

}

public static Trabajador conContrato(Long id, String rut, String primerNombre, String segundoNombre,String apellidoPaterno,
     String apellidoMaterno,String contrato,String funcion){


        return new Trabajador(id,rut,primerNombre,segundoNombre,apellidoPaterno,apellidoMaterno,null,contrato,funcion);

}




}
