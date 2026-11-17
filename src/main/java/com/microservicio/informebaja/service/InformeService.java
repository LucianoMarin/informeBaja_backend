package com.microservicio.informebaja.service;


import java.util.List;

import com.microservicio.informebaja.models.Informe;



public interface InformeService {

    List <Informe> mostarInformes();
    
    Informe mostrarInforme(Long id);

    void eliminarInforme(Long id);

    Informe crearInforme(Informe informe);

    Informe editarInforme(Long id, Informe informe);

}
