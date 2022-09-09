package com.tutorial.userSevice.service;

import com.tutorial.userSevice.entities.User;

import java.util.List;


public interface UserService {
    User getUser(int id);
    List<User> getAllUsers();
}
