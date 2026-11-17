package com.microservicio.informebaja.service;

import java.util.List;

import com.microservicio.informebaja.models.Dependencia;

public interface DependenciaService {
    
    List <Dependencia> mostrarDependencias();
    
    Dependencia mostrarDependencia(Long id);

    void eliminarDependencia(Long id);

    Dependencia crearDependencia(Dependencia dependencia);

    Dependencia editarDependencia(Long id, Dependencia dependencia);


}
