package com.warehouse.warehousespringboot.models;

public class Request {
    private int id;
    private int productId;
    private int quantity;
    private int creatorId;
    private int typeId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(int creatorId) {
        this.creatorId = creatorId;
    }

    public int getTypeId() {
        return typeId;
    }

    public void setTypeId(int typeId) {
        this.typeId = typeId;
    }

    public Request(int id, int productId, int quantity, int creatorId, int typeId) {
        this.id = id;
        this.productId = productId;
        this.quantity = quantity;
        this.creatorId = creatorId;
        this.typeId = typeId;
    }

    public Request() {
    }

    @Override
    public String toString() {
        return "Request{" +
                "id=" + id +
                ", productId=" + productId +
                ", quantity=" + quantity +
                ", creatorId=" + creatorId +
                ", typeId=" + typeId +
                '}';
    }
}
