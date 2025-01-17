package com.example.fitnessfusion.services;
import com.example.fitnessfusion.entity.Users;

import java.util.List;


public interface FusionServices {
    List<Users> getAll();
    Users getByID(Long id);
    Users save(Users employee);
    Users deleteByID(Long id);
}
