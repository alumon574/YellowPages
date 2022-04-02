package com.company;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Agenda {

    public LinkedList<Persona> agendaTelf = new LinkedList<>();

    public LinkedList<Persona> getAgendaTelf() {
        return agendaTelf;
    }

    public void setAgendaTelf(LinkedList<Persona> agendaTelf) {
        this.agendaTelf = agendaTelf;
    }

    public void addContactInfo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce nombre y numero de telefono, direccion y email del contacto son opcionales:");
        Persona newContact = new Persona(scanner.next(), scanner.next(), scanner.next(), scanner.next());
        agendaTelf.add(newContact);
    }

    public void loadContacts() {
        Persona p1 = new Persona("Juan", "999999999", "Calle recta", "correoReal@jemeil.com");
        Persona p2 = new Persona("Pepe", "111111111", "Calle curva", "correoFalso@jemeil.com");
        Persona p3 = new Persona("Selim selarom", "454545454", "Calle inclinada", "correo100%Real@jemeil.com");
        agendaTelf.add(p1);
        agendaTelf.add(p2);
        agendaTelf.add(p3);
    }

    public void removeAgenda() {
        agendaTelf.removeAll(agendaTelf);
    }



    private void showContacts(List<Persona> contactos) {
        System.out.println(constructContactString(contactos));
    }

    private String constructContactString(List<Persona> contactos) {
        String gestorPersonasStr = "";
        for (Persona contactInfo : contactos)
            gestorPersonasStr += "Contacto: " + agendaTelf.indexOf(contactInfo) +"\n" + contactInfo + "\n\n";

        return gestorPersonasStr + "\n";
    }

    @Override
    public String toString() {
        return constructContactString(agendaTelf);
    }
}
