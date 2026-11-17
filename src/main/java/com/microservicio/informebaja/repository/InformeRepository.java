package com.microservicio.informebaja.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microservicio.informebaja.models.Informe;

public interface InformeRepository extends JpaRepository <Informe, Long>{}
