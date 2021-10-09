package com.example.livesports;

public class Position {
    private String resource;
    private String name;

    public Position(String resource, String name) {
        this.resource = resource;
        this.name = name;
    }

    public String getResource() {
        return resource;
    }

    public void setResource(String resource) {
        this.resource = resource;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
