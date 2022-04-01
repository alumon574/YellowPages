package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        String campo = "";
        Scanner scanner = new Scanner(System.in);

        campo = scanner.next();
      do {
          System.out.println("¿Que quieres hacer?\n0 - Mostrar agenda\n1 - Añadir contacto\n2 - Borrar contacto\n3 - Modificar contacto\n4 - Mostrar agenda en orden alfabetico\n5 - Cargar 3 contactos genericos\n6 - Vaciar agenda\n7 - Acabar programa ");
          switch (campo) {
              case "0":
                  System.out.println(agenda);
                  break;
              case "1":
                  agenda.addContactInfo();
                  break;
              case "2": //Borrar contacto
                  break;
              case "3": //modifyContactInfo();
                  break;
              case "4": //Ordenar agenda
                  break;
              case "5": agenda.loadContacts();
                  break;
              case "6": //Borrar toda la agenda
                  break;
          }
      }while (campo=="7");
    }

    public void modifyContactInfo() {

    }


}
