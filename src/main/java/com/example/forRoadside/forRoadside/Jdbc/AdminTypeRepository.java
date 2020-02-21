package com.example.forRoadside.forRoadside.Jdbc;

import com.example.forRoadside.forRoadside.entity.Admin_entity;
import com.example.forRoadside.forRoadside.entity.ServiceProvider;
import com.example.forRoadside.forRoadside.mapper.AdminMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AdminTypeRepository {
    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<Admin_entity> authAdmin_entityByAdminEmail(String email) {
        Object[] params = new Object[]{email};
        AdminMapper adminMapper = new AdminMapper();
        List<Admin_entity> admin_entities = jdbcTemplate.query("SELECT * FROM roadside.admin WHERE admin_email = ? ;", params, adminMapper);
        return admin_entities;
    }
}
