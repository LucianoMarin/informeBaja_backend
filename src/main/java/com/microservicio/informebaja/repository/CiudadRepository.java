package com.microservicio.informebaja.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microservicio.informebaja.models.Ciudad;

public interface CiudadRepository extends JpaRepository<Ciudad, Long> {

    boolean existsByNombreAndLocalidad(String nombre, String localidad);

}
