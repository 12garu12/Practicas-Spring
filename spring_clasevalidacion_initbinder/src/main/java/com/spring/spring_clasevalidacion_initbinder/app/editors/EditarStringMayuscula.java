package com.spring.spring_clasevalidacion_initbinder.app.editors;

import java.beans.PropertyEditorSupport;

public class EditarStringMayuscula extends PropertyEditorSupport {

    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        setValue(text.toUpperCase().trim());
    }
}
