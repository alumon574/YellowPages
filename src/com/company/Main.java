package com.company;


import java.util.Collections;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        String accion = "";
        String campo = "";
        Scanner scanner = new Scanner(System.in);
        int index;


      do {
          System.out.println("\n¿Que quieres hacer?\n0 - Mostrar agenda\n1 - Añadir contacto\n2 - Borrar contacto\n3 - Modificar contacto\n4 - Mostrar agenda en orden alfabetico\n5 - Cargar 3 contactos genericos\n6 - Vaciar agenda\n7 - Acabar programa ");
          accion = scanner.next();
          switch (accion) {
              case "0":
                  System.out.println(agenda);
                  break;

              case "1":
                  agenda.addContactInfo();
                  break;

              case "2": /*Borrar contacto*/
                  System.out.println(agenda);
                  System.out.println("¿Que contacto quieres eliminar?");
                  agenda.agendaTelf.remove(index= scanner.nextInt());
                  break;

              case "3": /*modificar contacto*/
                  System.out.println(agenda.agendaTelf);
                  System.out.println("¿Que contacto quieres modificar?\nEscribe su indice:");
                  agenda.agendaTelf.get(index=scanner.nextInt());
                  System.out.println("¿Que campo quieres modificar?\n1 - Nombre\n2 - Telefono\n3 - direccion\n4 - email");
                  campo=scanner.next();
                  switch (campo){
                      //FALTA HACER LOS SAVES
                      case "1":
                          System.out.println("Escribe el nuevo nombre");
                          agenda.agendaTelf.get(index).setName(scanner.next());
                          break;
                      case "2":
                          System.out.println("Escribe el nuevo telefono");
                          agenda.agendaTelf.get(index).setPhoneNumber(scanner.next());
                          break;
                      case "3":
                          System.out.println("Escribe la nueva direccion");
                          agenda.agendaTelf.get(index).setAddress(scanner.next());
                          break;
                      case "4":
                          System.out.println("Escribe el nuevo email");
                          agenda.agendaTelf.get(index).setEmail(scanner.next());
                          break;
                  }
                  System.out.println(agenda.agendaTelf);
              agenda.agendaTelf.get(index).setName(scanner.next());
                  break;

              case "4": /*Ordenar agenda*/
                  break;

              case "5": agenda.loadContacts();
                  break;

              case "6": //Borrar toda la agenda
                  agenda.removeAgenda();
                  break;

          }
      }while (!accion.equals("7"));
        System.out.println("Cerrando agenda");


    }

}
