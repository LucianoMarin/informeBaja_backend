package com.microservicio.informebaja.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservicio.informebaja.models.TipoDispositivo;
import com.microservicio.informebaja.repository.TipoDispositivoRepository;


@Service 
public class TipoDispositivoServiceImp implements TipoDispositivoService{

    @Autowired 
    private TipoDispositivoRepository tipoDispositivoRepository;
    
    @Override
    public TipoDispositivo crearTipoDispositivo(TipoDispositivo tipoDispositivo) {
        return null;
    }

    @Override
    public TipoDispositivo editarTipoDispositivo(Long id, TipoDispositivo tipoDispositivo) {
        return null;
    }

    @Override
    public void eliminarTipoDispositivo(Long id) {
        
    }


    @Override
    public TipoDispositivo mostrarTipoDispositivo(Long id) {
        return null;
    }

    @Override
    public List<TipoDispositivo> mostrarTipoDispositivos() {
        return null;
    }


}
