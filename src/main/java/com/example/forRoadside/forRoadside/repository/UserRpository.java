package com.example.forRoadside.forRoadside.repository;

import com.example.forRoadside.forRoadside.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRpository extends JpaRepository<User, Integer> {

    User findByUserEmail(String email);
}
