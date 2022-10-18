package com.online.restaurant;

//Access modifiers : public, private, default(no need to write anything),protected
//we can't access private memb (to hide data) but can still make objcs by methods (getter/setter[can set validation])

public class Customer {
    private long customerId;
    private String name;
    private String address;
    private long phoneNumber;
    private String city;
    private String state;
    private String emailId;

    //methods

    // Getter (to get data)
    public long getCustomerId() {
        return customerId;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getEmailId() {
        return emailId;
    }

    // setter to set entities

    public void setCustomerId(long customerId) {
        this.customerId = customerId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }
}
