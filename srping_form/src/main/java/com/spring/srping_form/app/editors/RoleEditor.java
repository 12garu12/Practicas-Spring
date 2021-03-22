package com.spring.srping_form.app.editors;

import com.spring.srping_form.app.services.IRoleServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.beans.PropertyEditorSupport;

@Component
public class RoleEditor extends PropertyEditorSupport {

    @Autowired
    private IRoleServices roleServices;

    @Override
    public void setAsText(String idString) throws IllegalArgumentException {
        try {
            Integer id = Integer.parseInt(idString);
            setValue(roleServices.obtenerPorId(id));
        } catch (NumberFormatException e) {
            setValue(null);
        }
    }
}
