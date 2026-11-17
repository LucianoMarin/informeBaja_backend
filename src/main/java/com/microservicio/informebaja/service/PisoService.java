package com.microservicio.informebaja.service;

import java.util.List;

import com.microservicio.informebaja.models.Piso;

public interface PisoService {


    List <Piso> mostrarPisos();
    
    Piso mostrarPiso(Long id);

    void eliminarPiso(Long id);

    Piso crearPiso(Piso piso);

    Piso editarPiso(Long id, Piso piso);
    
}
