package com.microservicio.informebaja.models;

import java.time.LocalDate;
import java.util.List;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Entity 
@Getter 
@Setter 
public class Informe {

    @Id 
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    
    @ManyToOne 
    @JoinColumn (name="encabezado_id")
    private Encabezado encabezado;

    @Column (name="correlativo")
    private Integer correlativo;

    @Column(name="anno")
    private LocalDate anno;

    @ManyToOne 
    @JoinColumn (name="trabajador_id")
    private Trabajador trabajador;


    @ManyToOne 
    @JoinColumn (name="dispositivo_id")
    private Dispositivo dispositivo;

    @ManyToOne 
    @JoinColumn (name="motivoBaja_id")
    private MotivoBaja motivoBaja;

    @ManyToMany 
    @JoinTable(
        name = "informe_pie_firmas", // Nombre de la tabla intermedia que se creará en la BD
        joinColumns = @JoinColumn(name = "informe_id"),
        inverseJoinColumns = @JoinColumn(name = "pie_firma_id")
    )
    private List <PieFirma> pieFirmas;



    public Informe(){}



    public Informe(Long id,Encabezado encabezado, Integer correlativo, LocalDate anno,Dispositivo dispositivo,MotivoBaja motivoBaja ,Trabajador trabajador ){
        
        this.id=id;
        this.encabezado=encabezado;
        this.correlativo=correlativo;
        this.anno=anno;
        this.dispositivo=dispositivo;
        this.motivoBaja=motivoBaja;
        this.trabajador=trabajador;

    }

    
}
