package com.example.ecomerceapp.controller;
import com.example.ecomerceapp.model.Motorcycle;
import com.example.ecomerceapp.service.MotorcycleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/motorcycles")
public class MotorcyleController {
    @Autowired
    MotorcycleService motorcycleService;

    @GetMapping
    public Iterable<Motorcycle> listAllMotorcyles() {
        return motorcycleService.listAllMotorcyles();


    }

    @PostMapping
    public Motorcycle createMotorcycle(@RequestBody Motorcycle moto) {
        return motorcycleService.createMotorcyle(moto);
    }


    @GetMapping("/{id}")
    public Motorcycle getMotorcycleById(@PathVariable Long id) {
        return motorcycleService.getMotorcycleById(id);

    }

    @DeleteMapping("/{id}")
    public HttpStatus deleteMotorcycleById(@PathVariable Long id) {
        return motorcycleService.deleteMotorcycleById(id);
    }
}