package com.microservicio.informebaja.service;

import java.util.List;

import com.microservicio.informebaja.models.PieFirma;

public interface PieDeFirmaService {
    
    List <PieFirma> mostrarPiesDeFirmas();
    
    PieFirma MostrarPieFirma(Long id);

    void eliminarPieFirma(Long id);

    PieFirma crearPieFirma(PieFirma pieFirma);

    PieFirma editarPieFirma(Long id, PieFirma pieFirma);

    
}
