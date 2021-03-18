package com.warehouse.warehousespringboot.models;

public class Product {
    private int id;
    private String name;
    private int commodityGroupId;
    private double freeBalance;
    private double reserved;
    private double totalBalance;

    public Product(int id, String name, int commodityGroupId, double freeBalance, double reserved, double totalBalance) {
        this.id = id;
        this.name = name;
        this.commodityGroupId = commodityGroupId;
        this.freeBalance = freeBalance;
        this.reserved = reserved;
        this.totalBalance = totalBalance;
    }

    public Product() {
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

    public int getCommodityGroupId() {
        return commodityGroupId;
    }

    public void setCommodityGroupId(int commodityGroupId) {
        this.commodityGroupId = commodityGroupId;
    }

    public double getFreeBalance() {
        return freeBalance;
    }

    public void setFreeBalance(double freeBalance) {
        this.freeBalance = freeBalance;
    }

    public double getReserved() {
        return reserved;
    }

    public void setReserved(double reserved) {
        this.reserved = reserved;
    }

    public double getTotalBalance() {
        return totalBalance;
    }

    public void setTotalBalance(double totalBalance) {
        this.totalBalance = totalBalance;
    }
}
