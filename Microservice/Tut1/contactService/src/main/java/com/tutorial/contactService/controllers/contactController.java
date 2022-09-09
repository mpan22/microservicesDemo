package com.tutorial.contactService.controllers;

import com.tutorial.contactService.entities.Contact;
import com.tutorial.contactService.services.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/contact")
public class contactController {
    @Autowired
    ContactService contactService;

    @RequestMapping(value = "/{uId}", method = RequestMethod.GET)
    public List<Contact> getAllContactsForUserId(@PathVariable(name = "uId") int userId){
        return contactService.getContacts(userId);
    }
}
