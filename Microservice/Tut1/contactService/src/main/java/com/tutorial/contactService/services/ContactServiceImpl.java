package com.tutorial.contactService.services;

import com.tutorial.contactService.entities.Contact;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ContactServiceImpl implements ContactService{
    List<Contact> contacts= List.of(
            new Contact(1,"738289928383",100),
            new Contact(2,"438974893899",100),
            new Contact(3,"9847389743",101),
            new Contact(4,"794878943",102)
    );
    @Override
    public List<Contact> getContacts(int userId) {
        return contacts.stream().filter(i->i.getUserId()==userId).collect(Collectors.toList());
    }
}
