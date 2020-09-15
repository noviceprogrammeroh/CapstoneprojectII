package com.example.ecomerceapp.controller;


import com.example.ecomerceapp.model.Car;
import com.example.ecomerceapp.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class CarController {

    @Autowired
    CarService carService;

    @GetMapping
    public Iterable<Car> listAllCars() {
        return carService.listCars();
    }

    @PostMapping
    public Car createCar(@RequestBody Car car) {
        return carService.createCar(car);

    }


    @GetMapping("/{id}")
    public Car getCarById(@PathVariable Long id) {
        return carService.getCarById(id);

    }

    @DeleteMapping("/{id}")
    public HttpStatus deleteCar(@PathVariable Long id) {
        return carService.deleteCarById(id);

    }
}