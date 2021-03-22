package com.spring.springpasswordlistaselectpaisclase_pais.services;

import com.spring.springpasswordlistaselectpaisclase_pais.model.Pais;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class PaisServiceImpl implements IPaisService {

    private List<Pais> list;

    public PaisServiceImpl() {
        this.list = Arrays.asList(
                new Pais(1, "ES", "España"),
                new Pais(2, "CO", "Colombia"),
                new Pais(3, "Cl", "Chile"),
                new Pais(4, "AR", "Argentina"),
                new Pais(5, "PE", "Peru"),
                new Pais(6, "VE", "Venezuela"),
                new Pais(7, "UR", "Uruguay")
        );
    }

    @Override
    public List<Pais> listarTodos() {
        return list;
    }

    @Override
    public Pais obtenerPorPais(Integer id) {
        Pais result = null;
        for (Pais pais : list) {
            if (id == pais.getId()) {
                result = pais;
                break;
            }
        }
        return result;
    }
}
