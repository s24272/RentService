package com.example.VideoRent.controller;

import com.example.VideoRent.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    private UserService service;
    @Autowired
    public UserController(UserService service) {
        this.service = service;
    }

    
}
