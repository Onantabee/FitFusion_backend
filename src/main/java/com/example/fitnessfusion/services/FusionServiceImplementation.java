package com.example.fitnessfusion.services;

import com.example.fitnessfusion.dao.FusionRepo;
import com.example.fitnessfusion.entity.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FusionServiceImplementation implements FusionServices {

    private final FusionRepo fusionRepo;

    @Autowired
    public FusionServiceImplementation(FusionRepo fusionRepo) {
        this.fusionRepo = fusionRepo;
    }

    @Override
    public List<Users> getAll() {
        return fusionRepo.findAll();
    }

    @Override
    public Users getByID(Long id) {
        return fusionRepo.findById(id).orElse(null);
    }

    @Override
    public Users save(Users users) {
        return fusionRepo.save(users);
    }

    @Override
    public Users deleteByID(Long id) {
        Users user = fusionRepo.findById(id).orElse(null);
        if (user != null) {
            fusionRepo.delete(user);
        }
        return user;
    }
}

