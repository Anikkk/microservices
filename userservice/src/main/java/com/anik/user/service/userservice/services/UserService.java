package com.anik.user.service.userservice.services;

import java.util.List;

import com.anik.user.service.userservice.entities.User;

public interface UserService {
    
    //user operation

    //create
    User saveUser(User user);

    //get alll user
    List<User> getAllUser();


    //get user by id
    User getUser(String userId);
}
