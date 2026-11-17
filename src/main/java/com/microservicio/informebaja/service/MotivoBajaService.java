package com.microservicio.informebaja.service;

import java.util.List;

import com.microservicio.informebaja.models.MotivoBaja;

public interface MotivoBajaService {
    
  List <MotivoBaja> mostrarMotivosBaja();
    
    MotivoBaja mostrarMotivoBaja(Long id);

    void eliminarMotivoBaja(Long id);

    MotivoBaja crearMotivoBaja(MotivoBaja motivoBaja);

    MotivoBaja editarMotivoBaja(Long id, MotivoBaja motivoBaja);


    
}
