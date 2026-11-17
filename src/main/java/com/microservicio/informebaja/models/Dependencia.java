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
public class Dependencia {
    

    @Id 
    @GeneratedValue  (strategy = GenerationType.IDENTITY )
    private Long id;

    @Column (name="nombre")
    private String nombre;
    
    @ManyToOne 
    @JoinColumn (name="ubicacion_id")
    private Ubicacion ubicacion;




    public Dependencia(){}

    public Dependencia(Long id, String nombre, Ubicacion ubicacion){
        
        this.id=id;
        this.nombre=nombre;
        this.ubicacion=ubicacion;


    }


}
