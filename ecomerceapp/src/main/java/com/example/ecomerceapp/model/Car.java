package com.example.ecomerceapp.model;


import javax.persistence.*;


@Entity
@Table(name = "Car")
public class Car {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long id;

    @Column
    private String model;

    @Column
    private String manufacturer;

    @Column
    private double price;

    public Car() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
