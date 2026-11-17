package com.microservicio.informebaja.service;

import java.util.List;

import com.microservicio.informebaja.models.Ciudad;

public interface CiudadService{
    

    List <Ciudad> mostrarCiudades();
    
    Ciudad mostrarCiudad(Long id);

    void eliminarCiudad(Long id);

    Ciudad crearCiudad(Ciudad ciudad);

    Ciudad editarCiudad(Long id, Ciudad ciudad);


}
