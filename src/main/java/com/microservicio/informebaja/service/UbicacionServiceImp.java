package com.microservicio.informebaja.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservicio.informebaja.models.Ubicacion;
import com.microservicio.informebaja.repository.UbicacionRepository;

@Service 
public class UbicacionServiceImp implements UbicacionService {
    


    @Autowired 
    private UbicacionRepository ubicacionRepository;


    @Override
    public Ubicacion crearUbicacion(Ubicacion piso) {
        return null;
    }

    @Override
    public Ubicacion editarUbicacion(Long id, Ubicacion piso) {
        return null;
    }

    @Override
    public void eliminarUbicacion(Long id) {
        
    }

    @Override
    public Ubicacion mostrarUbicacion(Long id) {
        return null;
    }


    @Override
    public List<Ubicacion> mostrarUbicaciones() {
        return null;
    }

}
