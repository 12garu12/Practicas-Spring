package com.spring.spring_clase_validacionyformato_de_fecha.app.domain.model;

import org.apache.tomcat.util.security.PrivilegedSetTccl;

import javax.validation.constraints.NotNull;
import java.util.Date;

public class Customer {

    private String firstname;

    private String password;

    @NotNull
    private Date birthday;

    /*******************************************************************************************************************/
    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}
