package com.microservicio.informebaja.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservicio.informebaja.models.Ciudad;
import com.microservicio.informebaja.service.CiudadServiceImp;

@RestController
@RequestMapping("/ciudad")
public class CiudadController {

    @Autowired
    private CiudadServiceImp ciudadServiceImp;

    @PostMapping
    public Ciudad crearCiudad(@RequestBody Ciudad ciudad) {

        return ciudadServiceImp.crearCiudad(ciudad);

    }

    @GetMapping
    public List<Ciudad> mostrarCiudades() {

        return ciudadServiceImp.mostrarCiudades();

    }

    @DeleteMapping("{id}")
    public ResponseEntity eliminarCiudad(@PathVariable Long id) {

        ciudadServiceImp.eliminarCiudad(id);

        return ResponseEntity.ok("Ciudad Eliminada Correctamente!");
    }



    @GetMapping ("{id}")
    public Ciudad buscarCiudad(@PathVariable Long id){

        return ciudadServiceImp.mostrarCiudad(id);
    }

    @PutMapping ("{id}")
    public ResponseEntity modificarCiudad(@PathVariable Long id, @RequestBody Ciudad ciudad){

        ciudadServiceImp.editarCiudad(id,ciudad);
        
        return ResponseEntity.ok("Ciudad modificada correctamente");
    }

}
