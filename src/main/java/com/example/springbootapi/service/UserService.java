package com.example.springbootapi.service;

import com.example.springbootapi.entity.User;
import com.example.springbootapi.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public String createOrUpdateUser(User user){
        try {
            userRepository.save(user);
            return "Success";
        }catch (Exception e){
            System.out.println(e.getMessage());
            return "Error";
        }
    }

    public List<User> getAllUser(){
       return userRepository.findAll();
    }

}
