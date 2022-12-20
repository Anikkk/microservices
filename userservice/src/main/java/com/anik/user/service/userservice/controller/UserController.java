package com.anik.user.service.userservice.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.anik.user.service.userservice.entities.User;
import com.anik.user.service.userservice.services.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
    
    @Autowired
    public UserService userService;

    //create
    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody User user){
        User user1=userService.saveUser(user);
        return ResponseEntity.status(HttpStatus.CREATED).body(user1);
    }

    //single user

    @GetMapping("/{userId}")
    public ResponseEntity<User> singleUser(@PathVariable String userId){


        User user = userService.getUser(userId);
        return ResponseEntity.ok(user);
    }

    //all user
    @GetMapping
    public ResponseEntity<List<User>> getAllUser(){
        List<User> alluser=userService.getAllUser();
        return ResponseEntity.ok(alluser);
    }
}
