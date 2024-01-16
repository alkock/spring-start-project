package de.gruppe3.springprojekt;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController

public class RestController {
    @GetMapping("/")
    public String test() {
        return "Test";
    }
}
