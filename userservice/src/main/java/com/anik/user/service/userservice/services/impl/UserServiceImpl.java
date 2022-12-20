package com.anik.user.service.userservice.services.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anik.user.service.userservice.entities.User;
import com.anik.user.service.userservice.exceptions.ResourceNotFoundException;
import com.anik.user.service.userservice.repositories.UserRepository;
import com.anik.user.service.userservice.services.UserService;


@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> getAllUser() {     
        return userRepository.findAll();
    }

    @Override
    public User getUser(String userId) {
        
        return userRepository.findById(userId).orElseThrow(()-> new ResourceNotFoundException("User with given id is not found on server!!"));
    }

    @Override
    public User saveUser(User user) {
        String randomUserId=UUID.randomUUID().toString();
        user.setUserId(randomUserId);
        return userRepository.save(user);
    }
    
}
