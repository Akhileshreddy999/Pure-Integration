package com.akhil.project.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TestController {

    @GetMapping(value = "/hello")
    public ResponseEntity<String> sendHello() {

        String s = "Hello ...!";
        return new ResponseEntity<>(s, HttpStatus.OK);
    }
}
