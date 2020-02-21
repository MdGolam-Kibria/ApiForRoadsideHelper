package com.example.forRoadside.forRoadside.service;

import com.example.forRoadside.forRoadside.entity.User;
import com.example.forRoadside.forRoadside.repository.UserRpository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImplementer implements UserService {
    @Autowired
    UserRpository userRpository;

    @Override
    public void addUser(User user) {
        userRpository.save(user);
    }


    @Override
    public void updateUser(User user) {
        userRpository.save(user);
    }

    @Override
    public Optional<User> getUser(int id) {
        return userRpository.findById(id);
    }


    @Override
    public User getOneUserByEmail(String email) {
        return userRpository.findByUserEmail(email);
    }


    @Override
    public List<User> getAllUser() {
        List<User> list = new ArrayList<>();
        userRpository.findAll().forEach(list::add);
        return list;
    }

    @Override
    public void deleteUser(int id) {

        userRpository.deleteById(id);
    }

    @Override
    public List<User> deleteAll() {
        userRpository.deleteAll();
        return null;
    }


}
