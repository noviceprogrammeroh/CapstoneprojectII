package com.example.ecomerceapp.repository;

import com.example.ecomerceapp.model.Car;
import org.springframework.data.repository.CrudRepository;

public interface CarRepository extends CrudRepository<Car, Long> {
}
