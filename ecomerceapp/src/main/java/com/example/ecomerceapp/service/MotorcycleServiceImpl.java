package com.example.ecomerceapp.service;


import com.example.ecomerceapp.model.Motorcycle;
import com.example.ecomerceapp.repository.MotorcycleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
public class MotorcycleServiceImpl implements MotorcycleService
{

@Autowired
    MotorcycleRepository motorcycleRepository;


    @Override
    public Iterable<Motorcycle> listAllMotorcyles() {
        return motorcycleRepository.findAll();
    }

    @Override
    public Motorcycle createMotorcyle(Motorcycle moto) {
        return motorcycleRepository.save(moto);
    }

    @Override
    public Motorcycle getMotorcycleById(Long id) {
        return motorcycleRepository.findById(id).get();
    }

    @Override
    public HttpStatus deleteMotorcycleById(Long id) {
        motorcycleRepository.deleteById(id);
        return HttpStatus.OK;
    }
}
