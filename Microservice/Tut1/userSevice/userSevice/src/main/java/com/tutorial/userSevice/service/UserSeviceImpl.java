package com.tutorial.userSevice.service;

import com.tutorial.userSevice.entities.User;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserSeviceImpl implements UserService{

    List<User> users= List.of(
            new User(100,"Mukul","Pandit","Jaipur"),
            new User(101,"Rajesh","Ranjan","Pune"),
            new User(102,"Rahul","Yadav","Moscow"),
            new User(103,"Ram","Pandit","Luclnow")
    );
    @Override
    public User getUser(int id) {
        return (User) users.stream().filter(x->x.getId()== id).findAny().orElse(null);
    }

    @Override
    public List<User> getAllUsers() {
        return users;
    }
}
