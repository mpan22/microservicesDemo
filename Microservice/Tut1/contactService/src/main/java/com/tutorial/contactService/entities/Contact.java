package com.tutorial.contactService.entities;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Contact {

    private int contactId;
    private String number;
    private int userId;
}
