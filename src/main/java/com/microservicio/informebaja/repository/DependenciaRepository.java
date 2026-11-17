package com.microservicio.informebaja.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microservicio.informebaja.models.Dependencia;

public interface DependenciaRepository extends JpaRepository <Dependencia, Long> {}
