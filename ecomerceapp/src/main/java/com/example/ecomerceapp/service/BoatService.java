package com.example.ecomerceapp.service;
import com.example.ecomerceapp.model.Boat;
import com.example.ecomerceapp.model.Car;
import com.example.ecomerceapp.model.Motorcycle;
import org.springframework.http.HttpStatus;

public interface BoatService {


    Iterable<Boat> listAllBoats();
    Boat createBoat(Boat boat);
    Boat getBoatById(Long id);
    HttpStatus deleteBoatById(Long id);





}
