package com.example.ecomerceapp.service;


import com.example.ecomerceapp.model.User;
import com.example.ecomerceapp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements  UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public User createUser(User user) {


     return userRepository.save(user);

    }






}
