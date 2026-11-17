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
public class Ubicacion {
    
    @Id 
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    @Column (name="edificio")
    private String edificio; 

    @ManyToOne  
    @JoinColumn(name="ciudad_id")
    private Ciudad ciudad;

    @ManyToOne 
    @JoinColumn (name="piso_id")
    private Piso piso;

    @ManyToOne 
    @JoinColumn (name="orientacion_id")
    private Orientacion orientacion;



    public Ubicacion(){}


    public Ubicacion(Long id, String edificio ,Ciudad ciudad, Piso piso, Orientacion orientacion){

        this.id=id;
        this.edificio=edificio;
        this.ciudad=ciudad;
        this.piso=piso;
        this.orientacion=orientacion;

    }


    public static Ubicacion sinEdificio(Long id,Ciudad ciudad,Piso piso, Orientacion orientacion){

        return new Ubicacion(id,null,ciudad,piso,orientacion);
    }


}
