package com.example.forRoadside.forRoadside.mapper;

import com.example.forRoadside.forRoadside.entity.ServiceProvider;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ServiceProviderMapper implements RowMapper<ServiceProvider> {
    @Override
    public ServiceProvider mapRow(ResultSet resultSet, int i) throws SQLException {
        int serviceId = resultSet.getInt("service_id");
        String ServiceName = resultSet.getString("service_name");
        String serviceEmail = resultSet.getString("service_email");
        String servicePhone = resultSet.getString("service_phone");
        String servicePassword = resultSet.getString("service_password");
        String serviceType = resultSet.getString("service_type");
        String serviceLocation = resultSet.getString("service_location");

        ServiceProvider serviceProvider = new ServiceProvider();

        serviceProvider.setServiceId(serviceId);
        serviceProvider.setServiceName(ServiceName);
        serviceProvider.setServiceEmail(serviceEmail);
        serviceProvider.setServicePhone(servicePhone);
        serviceProvider.setServicePassword(servicePassword);
        serviceProvider.setServiceType(serviceType);
        serviceProvider.setServiceLocation(serviceLocation);
        return serviceProvider;
    }
}
