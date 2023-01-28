package com.example.VideoRent.controller;

import com.example.VideoRent.entity.Games;
import com.example.VideoRent.entity.Users;
import com.example.VideoRent.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private UserService userService;
    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
        userService.save(new Users(1,"Damian","Maluga","d.maluga@gmail.com"));
    }

    @GetMapping("/all")
    public Iterable<Users> getAll(){
        return userService.findAll();
    }
    @GetMapping("{id}")
    public Optional<Users> findById(@PathVariable int id){
        return userService.find(id);
    }
    @PostMapping("/add")
    public Users addUser(@RequestBody Users user){
        return userService.save(user);
    }
    @PutMapping("/ubdate")
    public Users updateUser(@RequestBody Users user){
        return userService.save(user);
    }
    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable int id){
        userService.delete(id);
    }
}
