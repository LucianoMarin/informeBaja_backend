package com.microservicio.informebaja.service;

import java.util.List;

import com.microservicio.informebaja.models.Encabezado;

public interface EncabezadoService {
    
    
    List <Encabezado> mostrarEncabezados();
    
    Encabezado mostrarEncabezado(Long id);

    void eliminarEncabezado(Long id);

    Encabezado crearEncabezado(Encabezado encabezado);

    Encabezado editarEncabezado(Long id, Encabezado encabezado);



}
