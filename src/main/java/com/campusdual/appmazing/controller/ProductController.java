package com.campusdual.appmazing.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
public class ProductController {
    @GetMapping
    public String testController() {
        return "Product controller works!";
    }
    @PostMapping
    public String testController(@RequestBody String name) {
        return "Product controller works, " + name + "!";
    }
    @GetMapping(value = "/testMethod")
    public String testControllerMethod(){
        return "Product controller method works!";
    }
}
