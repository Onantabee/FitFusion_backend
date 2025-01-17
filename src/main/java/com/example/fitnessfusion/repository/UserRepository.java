package com.example.fitnessfusion.repository;

import com.example.fitnessfusion.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;


@Repository
@RepositoryRestResource(path = "user")
public interface UserRepository extends JpaRepository<User, Integer> {
}
