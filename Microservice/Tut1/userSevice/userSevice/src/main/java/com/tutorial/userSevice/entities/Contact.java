package com.tutorial.userSevice.entities;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;

@Data
public class Contact {

    private int contactId;
    private String number;
}
