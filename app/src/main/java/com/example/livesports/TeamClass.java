package com.example.livesports;

public class TeamClass {

    private int id;
    private  String name;
    private  int country_id;


    public TeamClass(int id, String name, int country_id) {
        this.id = id;
        this.name = name;
        this.country_id = country_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCountry_id() {
        return country_id;
    }

    public void setCountry_id(int country_id) {
        this.country_id = country_id;
    }
}
