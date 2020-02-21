package com.example.forRoadside.forRoadside.service.admin;

import com.example.forRoadside.forRoadside.entity.Admin_entity;
import com.example.forRoadside.forRoadside.entity.User;

import java.util.List;

public interface AdminService {
    List<Admin_entity> getAllAdmin();
  //  Admin_entity getOneAdmin_entityByEmail(String email);
}
