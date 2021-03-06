package com.example.forRoadside.forRoadside.controller;

import com.example.forRoadside.forRoadside.Jdbc.UserTypeRepository;
import com.example.forRoadside.forRoadside.entity.Admin_entity;
import com.example.forRoadside.forRoadside.entity.User;
import com.example.forRoadside.forRoadside.entity.UserProblems;
import com.example.forRoadside.forRoadside.service.UPB.UpbIMP;
import com.example.forRoadside.forRoadside.service.UserService;
import com.example.forRoadside.forRoadside.service.admin.AdminService;
import com.example.forRoadside.forRoadside.service.serviceProvider.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class UserController {
    @Autowired
    UserService userService;
    @Autowired
    AdminService adminService;
    @Autowired
    UpbIMP upbIMP;
    @Autowired
    UserTypeRepository userTypeRepository;
    @Autowired
    Service service;


//    @PostMapping("/authenticateServiceProvidersBYUserByEmailAndPassword")
//    @ResponseBody
//    public ServiceProvider getOneServiceProviderByEmail(@RequestBody ServiceProvider serviceProvider) {//this method for authenticate an serviceprovider using her email and password.
//        ServiceProvider serviceProvider1 = service.getOneByServiceProviderEmail(serviceProvider.getServiceEmail());
//        if (serviceProvider1 != null) {
//            if (serviceProvider1.getServicePassword().equalsIgnoreCase(serviceProvider.getServicePassword())) {
//                return serviceProvider1;
//            } else {
//                return new ServiceProvider();
//            }
//        }
//        return new ServiceProvider();
//    }

    @PostMapping("/authenticateUserBYUserByEmailAndPassword")
    @ResponseBody
    public User getTest(@RequestBody User user) {//this method for authenticate an user using her email and password.
        User user1 = userService.getOneUserByEmail(user.getUserEmail());
        if (user1 != null) {
            if (user1.getUserPassword().equalsIgnoreCase(user.getUserPassword())) {
                // equalsIgnoreCase(); this method check case sensitive small and large all check here.
                return user1;
            } else {
                return new User();
            }
        }
        return new User();
    }


    @PostMapping("/addUsers")//This method only for Add a user.
    public void addUser(@RequestBody User user) {
        userService.addUser(user);
    }

    @PostMapping("/addUsersPB")//This method only for adding a user problem to MySQL Database.
    public void addUser(@RequestBody UserProblems userProblems) {
        upbIMP.addUserProblems(userProblems);
    }

    @PutMapping(value = "/updateUsers")
    public void updateUser(@RequestBody User user) {
        userService.updateUser(user);
    }

    @GetMapping("/allUser")
    public List<User> getAllUsers() {
        return userService.getAllUser();
    }

    @GetMapping("/lastUserProblem")
    public UserProblems getLastProblem() {//This method only for get last problems
        List<UserProblems> upb = upbIMP.getAllProblem();
        if (upb.size() >= 0) {
            int lastValue = upb.size() - 1; //Here is the last problem.
            return upb.get(lastValue);
        } else {
            return null;
        }
    }

    @GetMapping("/allUserProblems")
    public List<UserProblems> getAllUserProblems() {
        List<UserProblems> upb = upbIMP.getAllProblem();
        return upb;
    }

    @GetMapping("/adminAllHere")//for all admin show
    public List<Admin_entity> getAlladmin() {
        return adminService.getAllAdmin();
    }

    @GetMapping("/get/{id}")//search user by her ID 🆔 
    public Optional<User> getOneUser(@PathVariable("id") int id) {
        return userService.getUser(id);
    }


    @DeleteMapping("/deleteUser/{id}")//useing return server responce
    public ResponseEntity<User> deleteUser(@PathVariable int id) {
        Optional<User> userHave = userService.getUser(id);
        if (userHave != null) {//if there is any user by the id then delete the current user.
            userService.deleteUser(id);
            return new ResponseEntity<User>(HttpStatus.OK);
        } else {
            return new ResponseEntity<User>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/deleteAll")
    public List<User> deleteAll() {//Delete all User sad 😔 
        return userService.deleteAll();
    }

    @GetMapping("/getUserByEmailByEmail/{email}")
    public User getUserByEmailUsingEmail(@PathVariable("email") String email) {
        return userService.getOneUserByEmail(email);
    }

    //    @GetMapping("/getAdminByEmailByEmail/{email}")
//    public Admin_entity getAsminByEmailUsingEmail(@PathVariable("email") String email) {
//        return adminService.getOneAdmin_entityByEmail(email);
//    }


    @GetMapping("/getUserByEmailByQuary/{email}")//get a user by her email using MySQL query.
    public User getUserByEmailUsingQuary(@PathVariable("email") String email) {
        List<User> users = userTypeRepository.getuserAllInfoByEmail(email);
        if (users.size() > 0) {
            return users.get(0);
        } else {
            return null;
        }
    }
}

