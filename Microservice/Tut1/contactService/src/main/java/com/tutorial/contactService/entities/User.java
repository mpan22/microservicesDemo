package com.tutorial.contactService.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private int id;
    private String firstName;
    private String lastName;
    private String city;
    private List<Contact> contacts;

    public User(int id, String firstName, String lastName, String city) {
        this.id=id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
    }
}
