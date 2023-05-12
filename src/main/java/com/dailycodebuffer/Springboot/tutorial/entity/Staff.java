package com.dailycodebuffer.Springboot.tutorial.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Staff {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String Name;
    private String emailId;
    private String Password;
    private int PhoneNo;
    private String Address;
    private String bloodGroup;
    private String createdAt;
    private String updatedAt;
    private String OTP;

    public Staff(String name, String emailId, String password, int phoneNo, String address, String bloodGroup, String createdAt, String updatedAt, String OTP) {
        Name = name;
        this.emailId = emailId;
        Password = password;
        PhoneNo = phoneNo;
        Address = address;
        this.bloodGroup = bloodGroup;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.OTP = OTP;
    }

    public Staff() {
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public int getPhoneNo() {
        return PhoneNo;
    }

    public void setPhoneNo(int phoneNo) {
        PhoneNo = phoneNo;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getOTP() {
        return OTP;
    }

    public void setOTP(String OTP) {
        this.OTP = OTP;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "Name='" + Name + '\'' +
                ", emailId='" + emailId + '\'' +
                ", Password='" + Password + '\'' +
                ", PhoneNo=" + PhoneNo +
                ", Address='" + Address + '\'' +
                ", bloodGroup='" + bloodGroup + '\'' +
                ", createdAt='" + createdAt + '\'' +
                ", updatedAt='" + updatedAt + '\'' +
                ", OTP='" + OTP + '\'' +
                '}';
    }
}
