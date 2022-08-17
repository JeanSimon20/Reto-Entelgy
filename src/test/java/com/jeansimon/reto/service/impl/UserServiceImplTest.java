package com.jeansimon.reto.service.impl;

import com.jeansimon.reto.model.User;
import com.jeansimon.reto.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class UserServiceImplTest {
    @Autowired
    private UserService userService;

    @Test
    public void service() {
        List<User> data = new ArrayList<>();
        User user = new User();
        user.setId(1);
        user.setLastName("Jean");
        user.setEmail("jean.simon@entelgy.com");
        data.add(user);

        List<User> users = userService.findAll();
        assertEquals(users.get(0), data.get(0));
    }
}
