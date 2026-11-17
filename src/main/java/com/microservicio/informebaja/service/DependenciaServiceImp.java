package com.microservicio.informebaja.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservicio.informebaja.models.Dependencia;
import com.microservicio.informebaja.repository.DependenciaRepository;


@Service 
public class DependenciaServiceImp implements DependenciaService{

@Autowired 
private DependenciaRepository dependenciaRepository;


    @Override
    public Dependencia crearDependencia(Dependencia dependencia) {
        return null;
    }

    @Override
    public Dependencia editarDependencia(Long id, Dependencia dependencia) {
        return null;
    }

    @Override
    public void eliminarDependencia(Long id) {
        
    }

    @Override
    public Dependencia mostrarDependencia(Long id) {
        return null;
    }

    @Override
    public List<Dependencia> mostrarDependencias() {
        return null;
    }
}
