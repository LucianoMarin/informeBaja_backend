package com.microservicio.informebaja.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microservicio.informebaja.models.TipoDispositivo;

public interface TipoDispositivoRepository extends JpaRepository <TipoDispositivo, Long>  {}
