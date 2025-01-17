package com.example.fitnessfusion.dao;

import com.example.fitnessfusion.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FusionRepo extends JpaRepository<Users, Long> {
}
