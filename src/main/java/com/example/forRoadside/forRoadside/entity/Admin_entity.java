package com.example.forRoadside.forRoadside.entity;

import org.hibernate.annotations.NaturalId;

import javax.persistence.*;
import javax.validation.constraints.Email;

@Entity
@Table(name = "admin")
public class Admin_entity {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    public int adminId;

    public String adminName;
    @NaturalId
    @Email
    public String adminEmail;

    public String adminPhone;

    public String adminPassword;

    public String adminLocation;

    public Admin_entity() {
    }

    public Admin_entity(int adminId, String adminName, @Email String adminEmail, String adminPhone, String adminPassword, String adminLocation) {
        this.adminId = adminId;
        this.adminName = adminName;
        this.adminEmail = adminEmail;
        this.adminPhone = adminPhone;
        this.adminPassword = adminPassword;
        this.adminLocation = adminLocation;
    }

    public int getAdminId() {
        return adminId;
    }

    public void setAdminId(int adminId) {
        this.adminId = adminId;
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    public String getAdminEmail() {
        return adminEmail;
    }

    public void setAdminEmail(String adminEmail) {
        this.adminEmail = adminEmail;
    }

    public String getAdminPhone() {
        return adminPhone;
    }

    public void setAdminPhone(String adminPhone) {
        this.adminPhone = adminPhone;
    }

    public String getAdminPassword() {
        return adminPassword;
    }

    public void setAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword;
    }

    public String getAdminLocation() {
        return adminLocation;
    }

    public void setAdminLocation(String adminLocation) {
        this.adminLocation = adminLocation;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "adminId=" + adminId +
                ", adminName='" + adminName + '\'' +
                ", adminEmail='" + adminEmail + '\'' +
                ", adminPhone='" + adminPhone + '\'' +
                ", adminPassword='" + adminPassword + '\'' +
                ", adminLocation='" + adminLocation + '\'' +
                '}';
    }
}
