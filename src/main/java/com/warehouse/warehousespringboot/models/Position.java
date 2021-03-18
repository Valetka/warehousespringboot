package com.warehouse.warehousespringboot.models;

public class Position {
    private int id;
    private String name;

    public Position(int id, String value) {
        this.id = id;
        this.name = value;
    }

    public Position() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getValue() {
        return name;
    }

    public void setValue(String value) {
        this.name = value;
    }

    @Override
    public String toString() {
        return "Position{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
