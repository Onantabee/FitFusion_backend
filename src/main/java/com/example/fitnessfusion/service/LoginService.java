package com.example.fitnessfusion.service;

import com.example.fitnessfusion.dto.LoginRequest;
import com.example.fitnessfusion.entity.User;
import com.example.fitnessfusion.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class LoginService {
    private final UserRepository userRepository;
    private final BCryptPasswordEncoder bCryptPasswordEncoder;

    public String login(String username, String rawPassword) {
        User user = userRepository.findByUsername(String.valueOf(username))
                .orElseThrow(() -> new IllegalStateException("Invalid Username"));
        if (!bCryptPasswordEncoder.matches((CharSequence) rawPassword, user.getPassword())) {
            throw new IllegalStateException("Invalid Password");
        }
        return "Login successful for user: " + username;
    }
}
