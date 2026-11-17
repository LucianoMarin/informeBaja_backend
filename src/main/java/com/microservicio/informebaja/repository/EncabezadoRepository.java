package com.microservicio.informebaja.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microservicio.informebaja.models.Encabezado;

public interface EncabezadoRepository extends JpaRepository <Encabezado, Long>{}
