package com.example.forRoadside.forRoadside.Jdbc;

import com.example.forRoadside.forRoadside.entity.ServiceProvider;
import com.example.forRoadside.forRoadside.mapper.ServiceProviderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ServiceProviderTypeRepository {
    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<ServiceProvider> getServiceProviderAllInfoByEmail(String email) {
        Object[] params = new Object[]{email};
        ServiceProviderMapper mapper = new ServiceProviderMapper();
        List<ServiceProvider> serviceProviders = jdbcTemplate.query("SELECT * FROM roadside.service_provider WHERE service_email = ? ;", params, mapper);
        return serviceProviders;
    }

//    public ServiceProvider getAServiceProviderByemail(String email) {
//        Object[] params = new Object[]{email};
//        ServiceProviderMapper mapper = new ServiceProviderMapper();
//        ServiceProvider serviceProvider = (ServiceProvider) jdbcTemplate.query("SELECT * FROM roadside.service_provider WHERE service_email = ? ;", params, mapper);
//        return serviceProvider;
//    }
}
