package com.warehouse.warehousespringboot.models;

public class CommodityGroup {
    private int id;
    private String name;
    private String measure;

    public CommodityGroup() {
    }

    public CommodityGroup(int id, String name, String measure) {
        this.id = id;
        this.name = name;
        this.measure = measure;
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

    public String getMeasure() {
        return measure;
    }

    public void setMeasure(String measure) {
        this.measure = measure;
    }

    @Override
    public String toString() {
        return "CommodityGroup{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", measure='" + measure + '\'' +
                '}';
    }
}
