package com.qajungle.domain;

public class Item {

    Long id;
    String name;
    int stock;
    Double price;

    public Item() {
    }

    public Item(String name, int stock, Double price) {
        this.name = name;
        this.stock = stock;
        this.price = price;
    }

    public Item(Long id, String name, int stock, Double price) {
        this.id = id;
        this.name = name;
        this.stock = stock;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getStock() {
        return stock;
    }

    public Double getPrice() {
        return price;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
