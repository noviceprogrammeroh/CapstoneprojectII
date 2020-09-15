package com.example.ecomerceapp.service;


import com.example.ecomerceapp.model.Boat;
import com.example.ecomerceapp.repository.BoatRepository;
import com.example.ecomerceapp.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
public class BoatServiceImpl implements BoatService {
    @Autowired
    BoatRepository boatRepository;


    @Override
    public Iterable<Boat> listAllBoats() {
        return boatRepository.findAll();
    }

    @Override
    public Boat createBoat(Boat boat) {
        return boatRepository.save(boat);
    }

    @Override
    public Boat getBoatById(Long id) {
        return boatRepository.findById(id).get();
    }

    @Override
    public HttpStatus deleteBoatById(Long id) {
        boatRepository.deleteById(id);
        return HttpStatus.OK;
    }
}
