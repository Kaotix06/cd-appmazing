package com.campusdual.appmazing.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/contacts")
public class ContactController {
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
}
