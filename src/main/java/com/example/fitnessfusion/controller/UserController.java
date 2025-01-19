package com.example.fitnessfusion.controller;

import com.example.fitnessfusion.entity.User;
import com.example.fitnessfusion.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "user")
@AllArgsConstructor
public class UserController {
    private UserRepository userRepository;

    @GetMapping("users")
    public List<User> getAll(){
        return userRepository.findAll();
    }
}
