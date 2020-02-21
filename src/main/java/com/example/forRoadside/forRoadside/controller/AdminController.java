package com.example.forRoadside.forRoadside.controller;

import com.example.forRoadside.forRoadside.Jdbc.AdminTypeRepository;
import com.example.forRoadside.forRoadside.entity.Admin_entity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AdminController {
    @Autowired
    AdminTypeRepository adminRepository;
    @PostMapping("/authenticateAdminBYAdminEmailAndPassword")
    @ResponseBody //this method for authenticate an serviceProviders using her email and password by making mysql quary.
    public Admin_entity getServiceProviderAuth(@RequestBody Admin_entity admin_entity) {
       List<Admin_entity> admin = adminRepository.authAdmin_entityByAdminEmail(admin_entity.getAdminEmail());
       if (admin.size()>0){
           if (admin.get(0).getAdminPassword().equalsIgnoreCase(admin_entity.getAdminPassword())){
               return admin.get(0);
           }else {
               return new Admin_entity();
           }
       }
       return new Admin_entity();
    }
}
