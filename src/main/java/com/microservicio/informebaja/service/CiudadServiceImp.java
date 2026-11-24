package com.microservicio.informebaja.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservicio.informebaja.models.Ciudad;
import com.microservicio.informebaja.repository.CiudadRepository;

@Service
public class CiudadServiceImp implements CiudadService {

    @Autowired
    private CiudadRepository ciudadRepository;

    @Override
    public List<Ciudad> mostrarCiudades() {
        List<Ciudad> ciudades = ciudadRepository.findAll();

        if (ciudades.isEmpty()) {

            throw new IllegalArgumentException("Sin registros de localidades");

        }
        return ciudades;
    }

    @Override
    public Ciudad crearCiudad(Ciudad ciudad) {

        boolean validarIngreso = ciudadRepository.existsByNombreAndLocalidad(ciudad.getNombre(), ciudad.getLocalidad());

        if (validarIngreso == true) {

            throw new IllegalArgumentException("Localidad Duplicada, Intente con otra opcion");

        }

        if (ciudad.getNombre() == null) {

            throw new IllegalArgumentException("Nombre Ciudad no puede ser vacio.");

        }

        if (ciudad.getLocalidad() == null) {

            return ciudadRepository.save(Ciudad.sinLocalidad(ciudad.getId(), ciudad.getNombre()));
        }

        return ciudadRepository.save(ciudad);

    }

    @Override
    public Ciudad editarCiudad(Long id, Ciudad ciudad) {

        Ciudad validarCuidad = ciudadRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("ID que busca no existe"));


        boolean validarIngreso = ciudadRepository.existsByNombreAndLocalidad(ciudad.getNombre(), ciudad.getLocalidad());


        if (validarCuidad != null && !validarIngreso) {

            if (ciudad.getNombre() != null) {

                validarCuidad.setNombre(ciudad.getNombre());
            }

            if (ciudad.getLocalidad() != null) {

                validarCuidad.setLocalidad(ciudad.getLocalidad());
            }

        }

        return ciudadRepository.save(validarCuidad);

    }

    @Override
    public void eliminarCiudad(Long id) {

        boolean existe = ciudadRepository.existsById(id);

        if (!existe) {

            throw new IllegalArgumentException("ID que desea eliminar no existe!");
        }

        ciudadRepository.deleteById(id);

    }

    @Override
    public Ciudad mostrarCiudad(Long id) {

        return ciudadRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("ID que busca no existe"));
    }

}
