package com.example.forRoadside.forRoadside.service.serviceProvider;

import com.example.forRoadside.forRoadside.entity.ServiceProvider;
import com.example.forRoadside.forRoadside.repository.ServiceProviderRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

@org.springframework.stereotype.Service
public class ServiceProviderImple implements Service {
    @Autowired
    ServiceProviderRepository serviceProviderRepository;

    @Override
    public void addServiceProvider(ServiceProvider serviceProvider) {
        serviceProviderRepository.save(serviceProvider);
    }

    @Override
    public List<ServiceProvider> getAllServiceProviders() { //for get All service providers
        List<ServiceProvider> allServiceProvidersEntity = new ArrayList<>();
        serviceProviderRepository.findAll().forEach(allServiceProvidersEntity::add);
        return allServiceProvidersEntity;
    }

//    @Override
//    public ServiceProvider getOneByServiceProviderEmail(String email) {
//       return serviceProviderRepository.findByServiceProviderEmail(email);
//    }
}
