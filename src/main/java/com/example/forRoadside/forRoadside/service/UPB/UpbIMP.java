package com.example.forRoadside.forRoadside.service.UPB;

import com.example.forRoadside.forRoadside.entity.User;
import com.example.forRoadside.forRoadside.entity.UserProblems;
import com.example.forRoadside.forRoadside.repository.UserProblemsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UpbIMP implements UproblemsService {
    @Autowired
    UserProblemsRepo userProblemsRepo;

    @Override
    public List<UserProblems> getAllProblem() {
        List<UserProblems> list = new ArrayList<>();
        userProblemsRepo.findAll().forEach(list::add);
        return list;
    }

    @Override
    public void addUserProblems(UserProblems userProblems) {
        userProblemsRepo.save(userProblems);
    }
}
