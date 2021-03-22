package com.spring.spring_clasevalidacion_initbinder.app.services;

import com.spring.spring_clasevalidacion_initbinder.app.domain.models.Pais;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;


@Service
public class PaisServiceImpl implements IPaisService {

    private final List<Pais> listaPaises;

    /*  Constructor  ---------------------------------------------------------------------------------------------------*/

    public PaisServiceImpl() {
        this.listaPaises = Arrays.asList(
                new Pais(1, "Es", "España"),
                new Pais(2, "MX", "Mexico"),
                new Pais(3, "CL", "Chile"),
                new Pais(4, "AR", "Argentina"),
                new Pais(5, "PE", "Perú"),
                new Pais(6, "CO", "Colombia"),
                new Pais(7, "VE", "Venezuela"),
                new Pais(8, "BZ", "Brazil"),
                new Pais(9, "UR", "Uruguay"),
                new Pais(10, "BO", "Bolivia"),
                new Pais(11, "EC", "Ecuador")
        );
    }

    @Override
    public List<Pais> listaPaises() {
        return listaPaises;
    }

    @Override
    public Pais obtenerPorId(Integer id) {
        Pais result = null;
        for (Pais pais : listaPaises) {
            if (pais.getId().equals(id)) {
                result = pais;
                break;
            }
        }
        return result;
    }
}
