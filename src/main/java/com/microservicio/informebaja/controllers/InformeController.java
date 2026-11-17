package com.microservicio.informebaja.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.microservicio.informebaja.models.Informe;
import com.microservicio.informebaja.service.InformeServiceImp;

@Controller
@RequestMapping("/informe")
public class InformeController {

    @Autowired
    InformeServiceImp informeServiceImp;

    @GetMapping
    public List<Informe> mostrarInformes() {

        return informeServiceImp.mostarInformes();

    }

}
