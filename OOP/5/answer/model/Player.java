package com.model.service;

public class Player extends BaseEntity {
    private String name;
    private Shrit shrit; //relationship

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Shrit getShrit() {
        return shrit;
    }

    public void setShrit(Shrit shrit) {
        this.shrit = shrit;
    }
}
