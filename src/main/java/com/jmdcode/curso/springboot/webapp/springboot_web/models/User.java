package com.jmdcode.curso.springboot.webapp.springboot_web.models;

public class User {
    private String name;
    private String lastName;
    private Boolean active;

    public User(String name, String lastName) {
        this(name, lastName, true);
    }

    public User(String name, String lastName, Boolean active) {
        this.name = name;
        this.lastName = lastName;
        this.active = active;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

}
