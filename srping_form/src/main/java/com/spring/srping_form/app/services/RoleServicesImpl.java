package com.spring.srping_form.app.services;

import com.spring.srping_form.app.models.Role;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RoleServicesImpl implements IRoleServices {

    private List<Role> roles;

    /* CONSTRUCTOR ----------------------------------------------------------------------------------------------------*/
    public RoleServicesImpl() {
        this.roles = new ArrayList<>();
        roles.add(new Role(1, "Administrdor", "ROLE_ADMIN"));
        roles.add(new Role(2, "Usuario", "ROLE_USER"));
        roles.add(new Role(3, "Moderador", "ROLE_MODERATOR"));
    }

    /* METODS --------------------------------------------------------------------------------------------------------*/

    @Override
    public List<Role> ListarRoles() {
        return roles;
    }

    @Override
    public Role obtenerPorId(Integer id) {
        Role role = null;
        for (Role rol : this.roles) {
            if (rol.getId() == id) {
                role = rol;
                break;
            }
        }
        return role;
    }
}
