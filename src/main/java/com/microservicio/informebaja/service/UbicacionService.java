package com.microservicio.informebaja.service;

import java.util.List;

import com.microservicio.informebaja.models.Ubicacion;

public interface UbicacionService {

    List<Ubicacion> mostrarUbicaciones();

    Ubicacion mostrarUbicacion(Long id);

    void eliminarUbicacion(Long id);

    Ubicacion crearUbicacion(Ubicacion ubicacion);

    Ubicacion editarUbicacion(Long id, Ubicacion ubicacion);

}
