package com.example.GitHubActionsDemo.controller;


import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
public class UserController {


    @GetMapping(value = "/get/details")
    public ResponseEntity<?> getUserDetails(){


        return ResponseEntity.ok("User Details");
    }
}
