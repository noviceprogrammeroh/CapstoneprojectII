package com.example.ecomerceapp.service;

import com.example.ecomerceapp.model.Car;
import org.springframework.http.HttpStatus;

public interface CarService {

    Iterable<Car> listCars();
    Car createCar(Car car);
    Car getCarById(Long id);
    HttpStatus deleteCarById(Long id);


}
