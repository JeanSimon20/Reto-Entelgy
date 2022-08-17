package com.jeansimon.reto.service.Impl;

import com.jeansimon.reto.model.User;
import com.jeansimon.reto.model.UserResponse;
import com.jeansimon.reto.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service

public class UserServiceImpl implements UserService {

    private final RestTemplate restTemplate;

    public UserServiceImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public List<User> findAll() {
        UserResponse response = restTemplate.getForObject("users", UserResponse.class);

        if (response != null) return response.getData();
        else return new ArrayList<>();

    }

}
