package com.company;

public class Persona {
    private String name;
    private String phoneNumber;
    private String address;
    private String email;

    public Persona(String name, String phoneNumber, String address, String email) {
        this.name=name;
        this.phoneNumber=phoneNumber;
        this.address = address;
        this.email=email;
    }

    public Persona(String name, String phoneNumber){
        this(name,phoneNumber,null,null);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\nPhone Number: " + phoneNumber + "\nAddress: " + address + "\nEmail: " + email;
    }
}
