package com.microservicio.informebaja.service;

import java.util.List;

import com.microservicio.informebaja.models.Orientacion;

public interface OrientacionService {
    
        
  List <Orientacion> mostrarOrientaciones();
    
    Orientacion mostrarOrientacion(Long id);

    void eliminarOrientacion(Long id);

    Orientacion crearOrientacion(Orientacion orientacion);

    Orientacion editarOrientacion(Long id, Orientacion orientacion);



}
