package com.microservicio.informebaja.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservicio.informebaja.models.Cuenta;
import com.microservicio.informebaja.repository.CuentaRepository;

@Service 
public class CuentaServiceImp implements CuentaService {
    

    @Autowired  
    private CuentaRepository usuarioRepository;


    @Override
    public Cuenta crearUsuario(Cuenta usuario) {
        return null;
    }

    @Override
    public Cuenta editarUsuario(Long id, Cuenta usuario) {
        return null;
    }

    @Override
    public void eliminarUsuario(Long id) {
        
    }

    @Override
    public Cuenta mostrarUsuario(Long id) {
        return null;
    }

    @Override
    public List<Cuenta> mostrarUsuarios() {
        return null;
    }


}
