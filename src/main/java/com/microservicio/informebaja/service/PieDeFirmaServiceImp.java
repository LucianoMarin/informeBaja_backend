package com.microservicio.informebaja.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservicio.informebaja.models.PieFirma;
import com.microservicio.informebaja.repository.PieFirmaRepository;


@Service 
public class PieDeFirmaServiceImp implements PieDeFirmaService{


    @Autowired 
    private PieFirmaRepository pieFirmaRepository;



    @Override
    public PieFirma MostrarPieFirma(Long id) {
        return null;
    }
    

    @Override
    public PieFirma crearPieFirma(PieFirma pieFirma) {
        return null;
    }

    @Override
    public PieFirma editarPieFirma(Long id, PieFirma pieFirma) {
        return null;
    }

    @Override
    public void eliminarPieFirma(Long id) {
        
    }

    @Override
    public List<PieFirma> mostrarPiesDeFirmas() {
        return null;
    }


    
}
