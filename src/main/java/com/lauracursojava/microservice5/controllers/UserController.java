package com.lauracursojava.microservice5.controllers;

import com.lauracursojava.microservice5.models.User;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

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

    @RequestMapping(value="users")
    public List<User> getUsers(){
        List<User> users = new ArrayList<>();
        User user = new User();
        user.setId(1L);
        user.setName("Fabian");
        user.setLastName("Gonzalez");
        user.setEmail("fa@gmail.com");
        user.setTelephone("2587");

        User user2 = new User();
        user2.setId(2L);
        user2.setName("Federico");
        user2.setLastName("Valencia");
        user2.setEmail("f@gmail.com");
        user2.setTelephone("3658");

        User user3 = new User();
        user3.setId(3L);
        user3.setName("Juliana");
        user3.setLastName("Valencia");
        user3.setEmail("j@gmail.com");
        user3.setTelephone("258");

        User user4 = new User();
        user4.setId(4L);
        user4.setName("Alonso");
        user4.setLastName("Castaño");
        user4.setEmail("a@gmail.com");
        user4.setTelephone("36547");

        users.add(user);
        users.add(user2);
        users.add(user3);
        users.add(user4);
        return  users;
    }

   /* @RequestMapping(value="user2")
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
    }*/
}
