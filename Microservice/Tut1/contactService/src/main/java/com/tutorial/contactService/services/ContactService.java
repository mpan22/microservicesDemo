package com.tutorial.contactService.services;

import com.tutorial.contactService.entities.Contact;
import org.springframework.stereotype.Service;

import java.util.List;


public interface ContactService {
    public List<Contact> getContacts(int userId);

}
