package com.microservicio.informebaja.service;

import java.util.List;

import com.microservicio.informebaja.models.TipoDispositivo;

public interface TipoDispositivoService {
    
    List <TipoDispositivo> mostrarTipoDispositivos();
    
    TipoDispositivo mostrarTipoDispositivo(Long id);

    void eliminarTipoDispositivo(Long id);

    TipoDispositivo crearTipoDispositivo(TipoDispositivo tipoDispositivo);

    TipoDispositivo editarTipoDispositivo(Long id, TipoDispositivo tipoDispositivo);



}
