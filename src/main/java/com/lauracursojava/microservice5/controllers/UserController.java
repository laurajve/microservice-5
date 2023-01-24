package com.lauracursojava.microservice5.controllers;

import com.lauracursojava.microservice5.dao.IUserDao;
import com.lauracursojava.microservice5.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {

    @Autowired
    private IUserDao iUserDao;

    @RequestMapping(value="api/user/{id}")
    public User getUser(@PathVariable String id){
        User user = new User();
        user.setName("Laura");
        user.setLast_name("Valencia");
        user.setEmail("laura@gmail.com");
        user.setTelephone("123456");
        return user;

    }

    @RequestMapping(value="api/users")
    public List<User> getUsers(){
      System.out.println("===llegando al controller");
        List<User> userList = iUserDao.getUsers();
        System.out.println("===imprimiento");
        System.out.println("===tamaño de la lista"+userList.size());
        userList.forEach(x->{
            System.out.println(x.getId());
        });
       return  userList;
       /* System.out.println("===llegando al controller");
        List<User> userList = new ArrayList<User>();
        User user = new User();
        user.setName("Laura");
        user.setLast_name("Valencia");
        user.setEmail("laura@gmail.com");
        user.setTelephone("123456");
        userList.add(user);
        return userList;*/
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
