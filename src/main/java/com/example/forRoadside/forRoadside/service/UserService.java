package com.example.forRoadside.forRoadside.service;

import com.example.forRoadside.forRoadside.entity.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

    void addUser(User user);

    void updateUser(User user);

    Optional<User> getUser(int id);

    User getOneUserByEmail(String email);

    List<User> getAllUser();

    void deleteUser(int id);

    List<User> deleteAll();


}
