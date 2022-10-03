package com.example.fabrica.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/index")
public class Index {
    @GetMapping("/online")
    public String isOnline() {
        return "Online";
    }

    @PostMapping("/{name}")
    public ResponseEntity<String> getName(@PathVariable("name") String name) {
        return new ResponseEntity<>(name, HttpStatus.OK);
    }
}
