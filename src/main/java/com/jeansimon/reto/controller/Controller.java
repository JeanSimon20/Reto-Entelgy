package com.jeansimon.reto.controller;


import com.jeansimon.reto.model.User;
import com.jeansimon.reto.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
public class Controller {

    private final UserService service;

    public Controller(UserService service) {
        this.service = service;
    }


    @PostMapping
    public List<User> list() {
        System.out.println(service.findAll());
        return service.findAll();
    }
}

