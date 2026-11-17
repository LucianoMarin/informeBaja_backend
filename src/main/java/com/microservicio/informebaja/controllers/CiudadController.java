package com.microservicio.informebaja.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.microservicio.informebaja.models.Ciudad;
import com.microservicio.informebaja.service.CiudadServiceImp;


@Controller 
@RequestMapping ("/ciudad")
public class CiudadController {
    

@Autowired
private CiudadServiceImp ciudadServiceImp; 


@PostMapping
public Ciudad crearCiudad(@RequestBody Ciudad ciudad){

    return ciudadServiceImp.crearCiudad(ciudad);

}



}
