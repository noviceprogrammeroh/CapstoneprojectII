package com.example.ecomerceapp.controller;

import com.example.ecomerceapp.model.Boat;
import com.example.ecomerceapp.model.Car;
import com.example.ecomerceapp.service.BoatService;
import com.example.ecomerceapp.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/boats")
public class BoatController {


    @Autowired
    BoatService boatService;

    @GetMapping
    public Iterable<Boat> listAllCars() {
        return boatService.listAllBoats();
    }

    @PostMapping
    public Boat createBoat(@RequestBody Boat boat) {
        return boatService.createBoat(boat);

    }


    @GetMapping("/{id}")
    public Boat getBoatById(@PathVariable Long id) {
        return boatService.getBoatById(id);

    }

    @DeleteMapping("/{id}")
    public HttpStatus deleteBoat(@PathVariable Long id) {
        return boatService.deleteBoatById(id);

    }




























}
