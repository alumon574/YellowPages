package com.company;

import java.util.LinkedList;
import java.util.Scanner;

public class GestorPersonas {

    public LinkedList<Persona> agenda = new LinkedList<>();

    public void addContactInfo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce nombre y numero de telefono, direccion y email del contacto son opcionales:");
        Persona newContact = new Persona(scanner.next(), scanner.nextInt(), scanner.next(), scanner.next());
        agenda.add(newContact);
    }

    public void loadContacts() {
        Persona p1 = new Persona("Juan", 999999999, "Calle recta", "correoReal@jemeil.com");
        Persona p2 = new Persona("Pepe", 111111111, "Calle curva", "correoFalso@jemeil.com");
        Persona p3 = new Persona("Selim selarom", 454545454, "Calle inclinada", "correo100%Real@jemeil.com");
        agenda.add(p1);
        agenda.add(p2);
        agenda.add(p3);
    }

    public void removeAgenda(){
        agenda.remove();

    }

    @Override
    public String toString() {
        String gestorPersonasStr = "";
        for (Persona contactInfo : agenda)
            gestorPersonasStr += contactInfo + "\n\n";
        return gestorPersonasStr;
    }
}
