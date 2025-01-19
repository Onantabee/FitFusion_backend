package com.example.fitnessfusion.controller;

import com.example.fitnessfusion.dto.RegistrationRequest;
import com.example.fitnessfusion.entity.User;
import com.example.fitnessfusion.repository.UserRepository;
import com.example.fitnessfusion.service.RegistrationService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/register")
@AllArgsConstructor
public class UserRegistrationController {

    private RegistrationService registrationService;
    private UserRepository userRepository;

    @PostMapping
    public String register(@RequestBody RegistrationRequest request){
        return registrationService.register(request);
    }

    @GetMapping(path = "confirm")
    public String confirm(@RequestParam("token") String token) {
        return registrationService.confirmToken(token);
    }

    @GetMapping("users")
    public List<User> getAll(){
        return userRepository.findAll();
    }
}
