package com.microservicio.informebaja.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservicio.informebaja.models.Dispositivo;
import com.microservicio.informebaja.repository.DispositivoRepository;


@Service 
public class DispositivoServiceImp implements DispositivoService{
    
    @Autowired 
    private DispositivoRepository dispositivoRepository;


    @Override
    public Dispositivo crearDispositivo(Dispositivo dispositivo) {
        // TODO Auto-generated method stub
        return null;
    }


    @Override
    public Dispositivo editarDispositivo(Long id, Dispositivo dispositivo) {
        // TODO Auto-generated method stub
        return null;
    }


    @Override
    public void eliminarDispositivo(Long id) {
        // TODO Auto-generated method stub
        
    }


    @Override
    public Dispositivo mostrarDispositivo(Long id) {
        // TODO Auto-generated method stub
        return null;
    }


    @Override
    public List<Dispositivo> mostrarDispositivos() {
        // TODO Auto-generated method stub
        return null;
    }
}
