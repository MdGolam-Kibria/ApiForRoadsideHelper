package com.example.forRoadside.forRoadside.service.admin;

import com.example.forRoadside.forRoadside.entity.Admin_entity;
import com.example.forRoadside.forRoadside.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AdminImple implements AdminService {
    @Autowired
    AdminRepository adminRepository;

    @Override
    public List<Admin_entity> getAllAdmin() {
        List<Admin_entity> allAdminEntity = new ArrayList<>();
        adminRepository.findAll().forEach(allAdminEntity::add);
        return allAdminEntity;
    }

//    @Override
//    public Admin_entity getOneAdmin_entityByEmail(String email) {
//       return adminRepository.findByAdmin_entityEmail(email);
//    }
}
