package com.microservicio.informebaja.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microservicio.informebaja.models.PieFirma;

public interface PieFirmaRepository extends JpaRepository <PieFirma, Long> {}
