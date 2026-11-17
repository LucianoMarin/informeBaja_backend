package com.microservicio.informebaja.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microservicio.informebaja.models.Trabajador;

public interface TrabajadorRepository extends JpaRepository <Trabajador, Long> {}
