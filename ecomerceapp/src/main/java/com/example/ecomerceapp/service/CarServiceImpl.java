package com.example.ecomerceapp.service;


import com.example.ecomerceapp.model.Car;
import com.example.ecomerceapp.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
public class CarServiceImpl implements CarService {
  @Autowired
    CarRepository carRepository;

    @Override
    public Iterable<Car> listCars() {
        return carRepository.findAll();
    }

    @Override
    public Car createCar(Car car) {
        return carRepository.save(car);
    }

    @Override
    public Car getCarById(Long id) {
        return carRepository.findById(id).get();
    }

    @Override
    public HttpStatus deleteCarById(Long id) {
        carRepository.deleteById(id);
        return HttpStatus.OK;
    }
}
