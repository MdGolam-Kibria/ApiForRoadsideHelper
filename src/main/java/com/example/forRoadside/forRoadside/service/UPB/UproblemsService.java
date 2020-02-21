package com.example.forRoadside.forRoadside.service.UPB;

import com.example.forRoadside.forRoadside.entity.User;
import com.example.forRoadside.forRoadside.entity.UserProblems;
import com.example.forRoadside.forRoadside.repository.UserProblemsRepo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface UproblemsService {
    List<UserProblems> getAllProblem();
    void addUserProblems(UserProblems userProblems);
}
