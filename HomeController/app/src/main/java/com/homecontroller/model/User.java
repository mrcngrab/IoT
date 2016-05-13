package com.homecontroller.model;

import javax.inject.Inject;

/**
 * Created by gmra on 2016-05-05.
 */
public class User {

    private String name;
    private String surname;

    public User (String firstName) {
        name  = firstName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
}
