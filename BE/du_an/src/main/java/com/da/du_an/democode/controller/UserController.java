package com.da.du_an.democode.controller;

import com.da.du_an.democode.common.base.ResponseObject;
import com.da.du_an.democode.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/user")

public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("")
    public ResponseObject getUser(){
        return new ResponseObject(userService.GetUser());
    }
}
