package com.example.forRoadside.forRoadside.entity;

import org.hibernate.annotations.NaturalId;

import javax.persistence.*;
import javax.validation.constraints.Email;
@Entity
@Table(name = "service_provider")
public class ServiceProvider {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    public int serviceId;

    public String serviceName;
    @NaturalId
    @Email
    public String serviceEmail;
    public String servicePhone;
    public String servicePassword;
    public String serviceType;
    public String serviceLocation;

    public ServiceProvider() {
    }

    public ServiceProvider(int serviceId, String serviceName, @Email String serviceEmail, String servicePhone, String servicePassword, String serviceType, String serviceLocation) {
        this.serviceId = serviceId;
        this.serviceName = serviceName;
        this.serviceEmail = serviceEmail;
        this.servicePhone = servicePhone;
        this.servicePassword = servicePassword;
        this.serviceType = serviceType;
        this.serviceLocation = serviceLocation;
    }

    @Override
    public String toString() {
        return "ServiceProvider{" +
                "serviceId=" + serviceId +
                ", serviceName='" + serviceName + '\'' +
                ", serviceEmail='" + serviceEmail + '\'' +
                ", servicePhone='" + servicePhone + '\'' +
                ", servicePassword='" + servicePassword + '\'' +
                ", serviceType='" + serviceType + '\'' +
                ", serviceLocation='" + serviceLocation + '\'' +
                '}';
    }

    public int getServiceId() {
        return serviceId;
    }

    public void setServiceId(int serviceId) {
        this.serviceId = serviceId;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getServiceEmail() {
        return serviceEmail;
    }

    public void setServiceEmail(String serviceEmail) {
        this.serviceEmail = serviceEmail;
    }

    public String getServicePhone() {
        return servicePhone;
    }

    public void setServicePhone(String servicePhone) {
        this.servicePhone = servicePhone;
    }

    public String getServicePassword() {
        return servicePassword;
    }

    public void setServicePassword(String servicePassword) {
        this.servicePassword = servicePassword;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public String getServiceLocation() {
        return serviceLocation;
    }

    public void setServiceLocation(String serviceLocation) {
        this.serviceLocation = serviceLocation;
    }
}
