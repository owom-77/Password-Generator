package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    public User createUser(@RequestParam String firstName, 
                           @RequestParam String middleName, 
                           @RequestParam String lastName) {
        return userService.createUser(firstName, middleName, lastName);
    }
}
