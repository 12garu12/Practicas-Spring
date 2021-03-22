package com.spring.springpasswordlistaselectpaisclase_pais.services;

import com.spring.springpasswordlistaselectpaisclase_pais.model.Pais;

import java.util.List;

public interface IPaisService {

    List<Pais> listarTodos();

    Pais obtenerPorPais(Integer id);

}
