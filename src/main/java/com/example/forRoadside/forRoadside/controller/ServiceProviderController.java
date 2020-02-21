package com.example.forRoadside.forRoadside.controller;

import com.example.forRoadside.forRoadside.Jdbc.ServiceProviderTypeRepository;
import com.example.forRoadside.forRoadside.entity.ServiceProvider;
import com.example.forRoadside.forRoadside.entity.User;
import com.example.forRoadside.forRoadside.service.serviceProvider.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ServiceProviderController {
    @Autowired
    Service service;
    @Autowired
    ServiceProviderTypeRepository serviceProviderTypeRepository;

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


    @GetMapping("/getServiceProviderByEmailByQuary/{email}")
    public ServiceProvider getServiceProviderByEmailUsingQuary(@PathVariable("email") String email) {
        List<ServiceProvider> serviceProviders = serviceProviderTypeRepository.getServiceProviderAllInfoByEmail(email);
        if (serviceProviders.size() > 0) {
            //if (serviceProviders.get(0).getServicePassword().equalsIgnoreCase())
            return serviceProviders.get(0);
        } else {
            return new ServiceProvider();
        }
    }


    @PostMapping("/authenticateServiceProvidersBYUserByEmailAndPassword")
    @ResponseBody //this method for authenticate an serviceProviders using her email and password by making mysql quary.
    public ServiceProvider getServiceProviderAuth(@RequestBody ServiceProvider serviceProvider) {
        List<ServiceProvider> serviceProvider1 = serviceProviderTypeRepository.getServiceProviderAllInfoByEmail(serviceProvider.getServiceEmail());
        if (serviceProvider1.size() > 0) {
            if (serviceProvider1.get(0).getServicePassword().equalsIgnoreCase(serviceProvider.getServicePassword())) {
                return serviceProvider1.get(0);
            } else {
                return new ServiceProvider();
            }
        }
        return new ServiceProvider();
    }


    @PostMapping("/addServiceProvider")//this is only for post request..
    public void addUser(@RequestBody ServiceProvider serviceProvider) {
        service.addServiceProvider(serviceProvider);
    }

    @GetMapping("/ServiceProvidersAllHere")//for all admin show
    public List<ServiceProvider> getAllServiceProviders() {
        return service.getAllServiceProviders();
    }

}
