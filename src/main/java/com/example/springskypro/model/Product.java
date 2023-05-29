package com.example.springskypro.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Product {
    private int id;
    @JsonProperty
    private String itemName;

    public Product(int id, String itemName) {
        this.id = id;
        this.itemName = itemName;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Product() {
    }
}
