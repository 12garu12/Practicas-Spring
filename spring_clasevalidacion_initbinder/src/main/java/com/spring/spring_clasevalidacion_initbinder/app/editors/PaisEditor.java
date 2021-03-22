package com.spring.spring_clasevalidacion_initbinder.app.editors;

import com.spring.spring_clasevalidacion_initbinder.app.services.IPaisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.beans.PropertyEditorSupport;

@Component
public class PaisEditor extends PropertyEditorSupport {

    private final IPaisService paisService;

    public PaisEditor(IPaisService paisService) {
        this.paisService = paisService;
    }

    @Override
    public void setAsText(String idString) throws IllegalArgumentException {
        try {
            Integer id = Integer.parseInt(idString);
            setValue(paisService.obtenerPorId(id));
        } catch (NumberFormatException e) {
            setValue(null);
        }
    }
}
