package com.tutorial.userSevice.controller;

import com.tutorial.userSevice.entities.Contact;
import com.tutorial.userSevice.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.tutorial.userSevice.service.UserService;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class UserController {
    RestTemplate restTemplate= new RestTemplate();
    @Autowired
    private UserService userService;

    @GetMapping("/hello")
    public String display(){
        return "hello here";
    }

    @GetMapping("/allUsers")
    public List<User> showUsers(){

        return userService.getAllUsers();

    }
    @GetMapping("/{id}")
    public User showUser(@PathVariable(name = "id") int id){
        System.out.println("Executed");
        List<Contact> contacts= restTemplate.getForObject("http://localhost:8080/contact/"+id,
                List.class);
        User user= userService.getUser(id);
        user.setContacts(contacts);
        return user;
    }



}
