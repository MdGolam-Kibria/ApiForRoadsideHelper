package com.example.forRoadside.forRoadside.service.serviceProvider;


import com.example.forRoadside.forRoadside.entity.ServiceProvider;

import java.util.List;

public interface Service {
    void addServiceProvider(ServiceProvider serviceProvider);

    List<ServiceProvider> getAllServiceProviders();
    //ServiceProvider getOneByServiceProviderEmail(String email);

}
