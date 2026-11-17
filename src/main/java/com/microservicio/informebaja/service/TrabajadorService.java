package com.microservicio.informebaja.service;

import java.util.List;

import com.microservicio.informebaja.models.Trabajador;

public interface TrabajadorService {
    

    List <Trabajador> mostrarTrabajadores();
    
    Trabajador mostrarTrabajador(Long id);

    void eliminarTrabajador(Long id);

    Trabajador crearTrabajador(Trabajador piso);

    Trabajador editarTrabajador(Long id, Trabajador piso);
    

}
