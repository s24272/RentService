package com.example.VideoRent.service;

import com.example.VideoRent.data.GameRepository;
import com.example.VideoRent.data.UserRepository;
import com.example.VideoRent.entity.Games;
import com.example.VideoRent.entity.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private GameRepository gameRepository;
    private UserRepository userRepository;
    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    public Optional<Users> find(int id){
        return userRepository.findById(id);
    }

    public Iterable<Users> findAll(){
        return userRepository.findAll();
    }

    public Users save(Users user){
        return userRepository.save(user);
    }

    public void delete(int id){
        userRepository.deleteById(id);
    }

}
