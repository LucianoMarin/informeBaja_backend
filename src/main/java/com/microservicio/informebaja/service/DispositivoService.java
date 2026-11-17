package com.microservicio.informebaja.service;

import java.util.List;

import com.microservicio.informebaja.models.Dispositivo;

public interface DispositivoService {
    

    List <Dispositivo> mostrarDispositivos();

    Dispositivo mostrarDispositivo(Long id);

    void eliminarDispositivo(Long id);

    Dispositivo crearDispositivo(Dispositivo dispositivo);

    Dispositivo editarDispositivo(Long id, Dispositivo dispositivo);

}
