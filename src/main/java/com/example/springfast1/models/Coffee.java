package com.example.springfast1.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.UUID;

public class Coffee {
    private String id;
    private String name;

    public Coffee() {};

    public Coffee(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Coffee(String name) {
        this(UUID.randomUUID().toString(), name);
    }

    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}