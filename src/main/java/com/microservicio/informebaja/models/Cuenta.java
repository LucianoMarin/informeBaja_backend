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
public class Cuenta {


    @Id 
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    @Column (name="usuario", unique=true)
    private String usuario;
    
    @Column (name="clave")
    private String clave;

    @Column(name="rol")
    private String rol;

    @Column (name="estado")
    private Integer estado;



    public Cuenta(){}

    public Cuenta (Long id, String usuario, String clave, String rol, Integer estado){

        this.id=id;
        this.usuario=usuario;
        this.clave=clave;
        this.rol=rol;
        this.estado=estado;
    }


    public static Cuenta usuarioNormal(Long id, String usuario,String clave, String rol, Integer estado){
        return new Cuenta(id,usuario,clave,"rol_comun",0);

    }



}
