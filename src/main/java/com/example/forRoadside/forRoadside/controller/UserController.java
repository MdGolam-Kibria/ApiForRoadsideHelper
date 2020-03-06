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


    @PostMapping("/addUsers")//this is only for post request..
    public void addUser(@RequestBody User user) {
        userService.addUser(user);
    }

    @PostMapping("/addUsersPB")//this is only for post request..for add user problem to database
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
    public UserProblems getLastProblem() {//akhane shodho first problem ta dekhabe.
        List<UserProblems> upb = upbIMP.getAllProblem();
        if (upb.size() >= 0) {
            int lastValue = upb.size() - 1;//last problem ta dekhabe
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

    @GetMapping("/get/{id}")
    public Optional<User> getOneUser(@PathVariable("id") int id) {
        return userService.getUser(id);
    }


    @DeleteMapping("/deleteUser/{id}")
    public void deleteUser(@PathVariable int id) {
    }

    @DeleteMapping("/deleteAll")
    public List<User> deleteAll() {
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


    @GetMapping("/getUserByEmailByQuary/{email}")
    public User getUserByEmailUsingQuary(@PathVariable("email") String email) {
        List<User> users = userTypeRepository.getuserAllInfoByEmail(email);
        if (users.size() > 0) {
            return users.get(0);
        } else {
            return null;
        }
    }
}
//test
