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
public class Ciudad {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "localidad")
    private String localidad;

    public Ciudad() {
    }

    public Ciudad(Long id, String nombre, String localidad) {

        this.id = id;
        this.nombre = nombre;
        this.localidad = localidad;

    }

    public static Ciudad sinLocalidad(Long id, String ciudad) {

        return new Ciudad(id, ciudad, null);

    }

}
