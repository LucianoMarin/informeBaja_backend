package com.microservicio.informebaja.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microservicio.informebaja.models.Ubicacion;

public interface  UbicacionRepository extends JpaRepository <Ubicacion, Long> {}
