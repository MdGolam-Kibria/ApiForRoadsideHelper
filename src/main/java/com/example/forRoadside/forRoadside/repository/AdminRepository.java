package com.example.forRoadside.forRoadside.repository;

import com.example.forRoadside.forRoadside.entity.Admin_entity;
import com.example.forRoadside.forRoadside.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface AdminRepository extends JpaRepository<Admin_entity,Integer> {
   // Admin_entity findByAdmin_entityEmail(String email);
}
