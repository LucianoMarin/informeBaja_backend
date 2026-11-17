package com.microservicio.informebaja.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microservicio.informebaja.models.MotivoBaja;

public interface MotivoBajaRepository extends JpaRepository <MotivoBaja, Long> {}
