package com.company;

public class Persona {
    private String name;
    private int phoneNumber;
    private String address;
    private String email;

    public Persona(String name, int phoneNumber, String address, String email) {
        this.name=name;
        this.phoneNumber=phoneNumber;
        this.address = address;
        this.email=email;
    }

    public Persona(String name, int phoneNumber){
        this(name,phoneNumber,null,null);
    }

    public String getName() {
        return name;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\nPhone Number: " + phoneNumber + "\nAddress: " + address + "\nEmail: " + email;
    }
}
