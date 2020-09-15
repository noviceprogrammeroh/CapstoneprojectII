package com.example.ecomerceapp.service;


import com.example.ecomerceapp.model.Motorcycle;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;


public interface MotorcycleService {


    Iterable<Motorcycle> listAllMotorcyles();
    Motorcycle createMotorcyle(Motorcycle moto);
    Motorcycle getMotorcycleById(Long id);

    HttpStatus deleteMotorcycleById(Long id);



}
