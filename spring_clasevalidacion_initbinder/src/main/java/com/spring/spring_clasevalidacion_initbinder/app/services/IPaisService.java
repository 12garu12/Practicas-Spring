package com.spring.spring_clasevalidacion_initbinder.app.services;

import com.spring.spring_clasevalidacion_initbinder.app.domain.models.Pais;

import java.util.List;

public interface IPaisService {

    List<Pais> listaPaises();

    Pais obtenerPorId(Integer id);

}
