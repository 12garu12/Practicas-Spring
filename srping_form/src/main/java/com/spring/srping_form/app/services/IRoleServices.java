package com.spring.srping_form.app.services;

import com.spring.srping_form.app.models.Role;

import java.util.List;

public interface IRoleServices {

    List<Role> ListarRoles();

    Role obtenerPorId(Integer id);

}
