package com.microservicio.informebaja.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservicio.informebaja.models.Ciudad;
import com.microservicio.informebaja.repository.CiudadRepository;

@Service 
public class CiudadServiceImp implements CiudadService{
    
@Autowired 
private CiudadRepository ciudadRepository;


@Override
public List<Ciudad> mostrarCiudades() {

    return ciudadRepository.findAll();
}


@Override
public Ciudad crearCiudad(Ciudad ciudad) {
    // TODO Auto-generated method stub
    return null;
}


@Override
public Ciudad editarCiudad(Long id, Ciudad ciudad) {
    // TODO Auto-generated method stub
    return null;
}


@Override
public void eliminarCiudad(Long id) {
    // TODO Auto-generated method stub
    
}

@Override
public Ciudad mostrarCiudad(Long id) {
    // TODO Auto-generated method stub
    return null;
}



}

