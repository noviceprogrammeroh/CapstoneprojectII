package com.example.ecomerceapp.model;


import javax.persistence.*;


@Entity
@Table(name = "Motorcycle")
public class Motorcycle {

@Id
@Column
@GeneratedValue(strategy = GenerationType.IDENTITY )
private Long Id;

@Column
private String model;

@Column
private String manufacturer;

@Column
private double price;

    public Motorcycle() {
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
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
