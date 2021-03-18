package com.warehouse.warehousespringboot.models;

public class RequestType {
    private int id;
    private String name;

    public RequestType(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public RequestType() {
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
}
