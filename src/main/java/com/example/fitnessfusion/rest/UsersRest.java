package com.example.fitnessfusion.rest;

import com.example.fitnessfusion.entity.Users;
import com.example.fitnessfusion.services.FusionServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UsersRest {
    private final FusionServices fusionServices;

    @Autowired
    public UsersRest(FusionServices fusionServices) {
        this.fusionServices = fusionServices;
    }

    @GetMapping
    public List<Users> getUsers() {
        return fusionServices.getAll();
    }

    @GetMapping("/{userId}")
    public Users getUser(@PathVariable Long userId) throws Exception {
        Users employee = fusionServices.getByID(userId);
        if (employee == null) {
            throw new Exception("User not found for ID: " + userId);
        }
        return employee;
    }

    @PostMapping
    public Users saveUsers(@RequestBody Users employee) {
        return fusionServices.save(employee);
    }

    @PutMapping
    public Users updateUsers(@RequestBody Users employee) {
        return fusionServices.save(employee);
    }

    @DeleteMapping("/{userId}")
    public Users deleteUser(@PathVariable Long userId) {
        return fusionServices.deleteByID(userId);
    }
}
