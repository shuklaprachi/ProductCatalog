package com.example.productcatalog.entity;

import javax.persistence.*;

@Entity
//@Table(name="ProductInfo")
public class Product {

    @Id
    /*@Column(name="prodId")
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long prodId;*/

    private long prodId;
    private String name;
    private String description;
    private float price;
    private boolean inStock;

    public Product() {
    }

    public Product(Long prodId, String name, String description, float price, boolean inStock) {
        this.prodId = prodId;
        this.name = name;
        this.description = description;
        this.price = price;
        this.inStock = inStock;
    }

    public Long get_id() {
        return prodId;
    }

    public void set_id(Long _id) {
        this.prodId = _id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public boolean isInStock() {
        return inStock;
    }

    public void setInStock(boolean inStock) {
        this.inStock = inStock;
    }
}
