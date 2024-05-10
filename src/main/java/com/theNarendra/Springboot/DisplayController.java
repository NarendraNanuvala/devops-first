package com.theNarendra.Springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DisplayController {
    
    @GetMapping
    public String display(){
        return "This is my second Jenkins Application";
    }
}
