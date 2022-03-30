package com.company;

public class Main {

    public static void main(String[] args) {
	GestorPersonas gestorPersonas= new GestorPersonas();
    gestorPersonas.loadContacts();
    System.out.println(gestorPersonas);
    gestorPersonas.addContactInfo();
    }

}
