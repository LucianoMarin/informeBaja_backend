package com.microservicio.informebaja.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservicio.informebaja.models.Encabezado;
import com.microservicio.informebaja.repository.EncabezadoRepository;

@Service
public class EncabezadoServiceImp implements EncabezadoService {


    @Autowired 
    private EncabezadoRepository encabezadoRepository;


    @Override
    public Encabezado crearEncabezado(Encabezado encabezado) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Encabezado editarEncabezado(Long id, Encabezado encabezado) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void eliminarEncabezado(Long id) {
        // TODO Auto-generated method stub

    }

    @Override
    public Encabezado mostrarEncabezado(Long id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Encabezado> mostrarEncabezados() {
        // TODO Auto-generated method stub
        return null;
    }

}
