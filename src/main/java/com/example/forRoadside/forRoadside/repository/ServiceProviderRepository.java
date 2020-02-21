package com.example.forRoadside.forRoadside.repository;

import com.example.forRoadside.forRoadside.entity.ServiceProvider;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServiceProviderRepository extends JpaRepository<ServiceProvider,Integer> {

   // ServiceProvider findByServiceProviderEmail(String email);
}
