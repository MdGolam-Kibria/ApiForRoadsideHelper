package com.example.forRoadside.forRoadside.Jdbc;

import com.example.forRoadside.forRoadside.entity.User;
import com.example.forRoadside.forRoadside.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserTypeRepository {


    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<User> getuserAllInfoByEmail(String email) {
        Object[] params = new Object[]{email};
        UserMapper mapper = new UserMapper();
        List<User> user = jdbcTemplate.query("SELECT * FROM roadside.user WHERE user_email = ? ;", params, mapper);
//        List<User> user = jdbcTemplate.query("SELECT user_email,user_password FROM roadside.user Where user_email = ? ;", params, mapper);
//        SELECT user_email,user_password FROM roadside.user where user_email = "golamkibria041@gmail.com";
        return user;
    }
}
