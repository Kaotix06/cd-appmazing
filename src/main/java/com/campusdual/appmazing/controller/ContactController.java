package com.campusdual.appmazing.controller;

import com.campusdual.appmazing.api.IContactService;
import com.campusdual.appmazing.model.dto.ContactDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/contacts")
public class ContactController {

    @Autowired
    IContactService contactService;

    @GetMapping
    public String testController() {
        return "Contact controller works!";
    }

    @PostMapping
    public String testController(@RequestBody String name) {
        return "Contact controller works, " + name + "!";
    }

    @GetMapping(value = "/testMethod")
    public String testControllerMethod(){
        return "Contact controller method works!";
    }

    @PostMapping(value = "/get")
    public ContactDTO queryContact(@RequestBody ContactDTO contact){
        return this.contactService.queryContact(contact);
    }

    @GetMapping(value = "/getAll")
    public List<ContactDTO> queryAllContacts(){
        return this.contactService.queryAllContacts();
    }

    @PostMapping(value = "/add")
    public int insertContact(@RequestBody ContactDTO contact){
        return this.contactService.insertContact(contact);
    }

    @PutMapping(value = "/update")
    public int updateContact(@RequestBody ContactDTO contact){
        return this.contactService.updateContact(contact);
    }

    @DeleteMapping(value = "/delete")
    public int deleteContact(@RequestBody ContactDTO contact){
        return this.contactService.deleteContact(contact);
    }
}
