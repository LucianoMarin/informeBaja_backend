package com.microservicio.informebaja.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservicio.informebaja.models.Informe;
import com.microservicio.informebaja.repository.InformeRepository;


@Service 
public class InformeServiceImp implements InformeService {

@Autowired 
private InformeRepository informeRepository;

    
@Override
public Informe crearInforme(Informe informe) {
    // TODO Auto-generated method stub
    return null;
}


@Override
public Informe editarInforme(Long id, Informe informe) {
    // TODO Auto-generated method stub
    return null;
}


@Override
public void eliminarInforme(Long id) {
    // TODO Auto-generated method stub
    
}


@Override
public List<Informe> mostarInformes() {
    // TODO Auto-generated method stub
    return null;
}


@Override
public Informe mostrarInforme(Long id) {
    // TODO Auto-generated method stub
    return null;
}

}
