package com.example.forRoadside.forRoadside.mapper;

import com.example.forRoadside.forRoadside.entity.User;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserMapper implements RowMapper<User> {

    @Override
    public User mapRow(ResultSet resultSet, int i) throws SQLException {
        int userId = resultSet.getInt("user_id");
        String userName = resultSet.getString("user_name");
        String userEmail = resultSet.getString("user_email");
        String userPhone = resultSet.getString("user_phone");
        String userPassword = resultSet.getString("user_password");
        String userType = resultSet.getString("user_type");
        String userLocation = resultSet.getString("user_location");

        User user = new User();

        user.setUserId(userId);
        user.setUserName(userName);
        user.setUserEmail(userEmail);
        user.setUserPhone(userPhone);
        user.setUserPassword(userPassword);
        user.setUserType(userType);
        user.setUserLocation(userLocation);
        return user;
    }
}
