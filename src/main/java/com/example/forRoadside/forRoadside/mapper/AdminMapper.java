package com.example.forRoadside.forRoadside.mapper;

import com.example.forRoadside.forRoadside.entity.Admin_entity;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class AdminMapper implements RowMapper<Admin_entity> {
    @Override
    public Admin_entity mapRow(ResultSet resultSet, int i) throws SQLException {
        int adminId = resultSet.getInt("admin_id");
        String adminName = resultSet.getString("admin_name");
        String adminEmail = resultSet.getString("admin_email");
        String adminPhone = resultSet.getString("admin_phone");
        String adminPassword = resultSet.getString("admin_password");
        String adminLocation = resultSet.getString("admin_location");

        Admin_entity admin_entity = new Admin_entity();


        admin_entity.setAdminId(adminId);
        admin_entity.setAdminName(adminName);
        admin_entity.setAdminEmail(adminEmail);
        admin_entity.setAdminPhone(adminPhone);
        admin_entity.setAdminPassword(adminPassword);
        admin_entity.setAdminLocation(adminLocation);
        return admin_entity;
    }
}
