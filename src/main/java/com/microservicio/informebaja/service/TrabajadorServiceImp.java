package com.microservicio.informebaja.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservicio.informebaja.models.Trabajador;
import com.microservicio.informebaja.repository.TrabajadorRepository;

@Service 
public class TrabajadorServiceImp implements TrabajadorService {

    

    @Autowired 
    private TrabajadorRepository trabajadorRepository;


    @Override
    public Trabajador crearTrabajador(Trabajador piso) {
        return null;
    }

    @Override
    public Trabajador editarTrabajador(Long id, Trabajador piso) {
        return null;
    }

    @Override
    public void eliminarTrabajador(Long id) {
        
    }

    @Override
    public Trabajador mostrarTrabajador(Long id) {
        return null;
    }


    @Override
    public List<Trabajador> mostrarTrabajadores() {
        return null;
    }




}
