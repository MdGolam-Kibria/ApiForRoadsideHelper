package com.example.forRoadside.forRoadside.repository;

import com.example.forRoadside.forRoadside.entity.UserProblems;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface UserProblemsRepo extends CrudRepository<UserProblems,byte[]> {

}
