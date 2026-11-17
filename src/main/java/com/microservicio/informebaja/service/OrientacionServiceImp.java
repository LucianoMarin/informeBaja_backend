package com.microservicio.informebaja.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservicio.informebaja.models.Orientacion;
import com.microservicio.informebaja.repository.OrientacionRepository;


@Service 
public class OrientacionServiceImp implements OrientacionService {
    

    @Autowired 
    private OrientacionRepository orientacionRepository;


    @Override
    public Orientacion crearOrientacion(Orientacion orientacion) {
        return null;
    }

    @Override
    public Orientacion editarOrientacion(Long id, Orientacion orientacion) {
        return null;
    }

    @Override
    public void eliminarOrientacion(Long id) {
        
    }
    

    @Override
    public Orientacion mostrarOrientacion(Long id) {
        return null;
    }

    @Override
    public List<Orientacion> mostrarOrientaciones() {
        return null;
    }


}
