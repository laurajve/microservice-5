package com.lauracursojava.microservice5.controllers;

import com.lauracursojava.microservice5.models.User;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @RequestMapping(value="user/{id}")
    public User getUser(@PathVariable String id){
        User user = new User();
        user.setName("Laura");
        user.setLastName("Valencia");
        user.setEmail("laura@gmail.com");
        user.setTelephone("123456");
        return user;
    }

    @RequestMapping(value="user")
    public User editUser(){
        User user = new User();
        user.setName("Laura");
        user.setLastName("Valencia");
        user.setEmail("laura@gmail.com");
        user.setTelephone("123456");
        return user;
    }

    @RequestMapping(value="user")
    public User deleteUser(){
        User user = new User();
        user.setName("Laura");
        user.setLastName("Valencia");
        user.setEmail("laura@gmail.com");
        user.setTelephone("123456");
        return user;
    }

    @RequestMapping(value="user")
    public User searchUser(){
        User user = new User();
        user.setName("Laura");
        user.setLastName("Valencia");
        user.setEmail("laura@gmail.com");
        user.setTelephone("123456");
        return user;
    }
}
