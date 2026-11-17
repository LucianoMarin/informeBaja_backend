package com.microservicio.informebaja.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservicio.informebaja.models.Piso;
import com.microservicio.informebaja.repository.PisoRepository;


@Service 
public class PisoServiceImp implements PisoService {


    @Autowired 
    private PisoRepository pisoRepository;

    @Override
    public Piso crearPiso(Piso piso) {
        return null;
    }


    @Override
    public Piso editarPiso(Long id, Piso piso) {
        return null;
    }

    @Override
    public void eliminarPiso(Long id) {
        
    }

    @Override
    public Piso mostrarPiso(Long id) {
        return null;
    }

    @Override
    public List<Piso> mostrarPisos() {
        return null;
    }
    
}
