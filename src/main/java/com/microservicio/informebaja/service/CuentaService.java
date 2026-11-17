package com.microservicio.informebaja.service;

import java.util.List;

import com.microservicio.informebaja.models.Cuenta;

public interface CuentaService {


    List <Cuenta> mostrarUsuarios();
    
    Cuenta mostrarUsuario(Long id);

    void eliminarUsuario(Long id);

    Cuenta crearUsuario(Cuenta usuario);

    Cuenta editarUsuario(Long id, Cuenta usuario);

    
}
