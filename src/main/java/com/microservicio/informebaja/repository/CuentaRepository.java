package com.microservicio.informebaja.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microservicio.informebaja.models.Cuenta;

public interface CuentaRepository extends JpaRepository <Cuenta, Long> {}
