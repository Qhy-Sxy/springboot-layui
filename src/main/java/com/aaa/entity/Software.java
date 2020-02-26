package com.aaa.entity;

import java.io.Serializable;

public class Software implements Serializable {
    private Integer id;
    private String name;
    private double version;
    private String publisher;
    private double price;

    public Software() {
    }

    public Software(Integer id, String name, double version, String publisher, double price) {
        this.id = id;
        this.name = name;
        this.version = version;
        this.publisher = publisher;
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getVersion() {
        return version;
    }

    public void setVersion(double version) {
        this.version = version;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
