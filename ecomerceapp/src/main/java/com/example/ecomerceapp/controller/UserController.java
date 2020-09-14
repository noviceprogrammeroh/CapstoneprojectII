package com.example.ecomerceapp.controller;


import com.example.ecomerceapp.model.User;
import com.example.ecomerceapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
@Autowired
    UserService userService;

@PostMapping
public User createUser(@RequestBody User user) {
    return userService.createUser(user);
}


}
