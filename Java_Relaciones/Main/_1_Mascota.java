/*
 Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de dos
clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase Persona con
atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que
pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde
la clase Persona, la información del Perro y de la Persona.
 */
package Main;

import Entidad._1_Perro;
import Entidad._1_Persona;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Mario
 */
public class _1_Mascota {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner teclado = new Scanner(System.in);
        ArrayList<_1_Perro> LISTA = new ArrayList<>();         // LISTA MASCOTA
        ArrayList<_1_Persona> ListaPers = new ArrayList<>();   // LISTA PERSONA
        int cont = 1;

      
        _1_Perro DATOS = new _1_Perro();         // OBJETO 1

// DATOS
        System.out.println("PERRO " + cont++);
        System.out.println("NOMBRE");
        String nombre = teclado.next();
        System.out.println("RAZA");
        String raza = teclado.next();
        System.out.println("EDAD");
        int edad = teclado.nextInt();
        System.out.println("TAMAÑO");
        String tamaño = teclado.next();

        DATOS.setNombre(nombre);
        DATOS.setRaza(raza);
        DATOS.setEdad(edad);
        DATOS.setTamaño(tamaño);

        LISTA.add(DATOS);
        System.out.println("-----------------------------------");

        _1_Perro DATOS2 = new _1_Perro();         // OBJETO 2

// DATOS 2        
        System.out.println("PERRO " + cont++);
        System.out.println("NOMBRE");
        String nombre2 = teclado.next();
        System.out.println("RAZA");
        String raza2 = teclado.next();
        System.out.println("EDAD");
        int edad2 = teclado.nextInt();
        System.out.println("TAMAÑO");
        String tamaño2 = teclado.next();
// AÑADIR         
        DATOS2.setNombre(nombre2);
        DATOS2.setRaza(raza2);
        DATOS2.setEdad(edad2);
        DATOS2.setTamaño(tamaño2);
// AÑADIR A LA LISTA MASCOTA
        LISTA.add(DATOS2);
        
         System.out.println("-----------------------------------");

// MOSTRAR         
        System.out.println("MASCOTAS: ");
        System.out.print("1: ");
        System.out.println(DATOS);
        System.out.print("2: ");
        System.out.println(DATOS2);
        System.out.println("");

        
// DATOS PERSONA (CON BUCLE)

        for (int i = 1; i < 3; i++) {   // INICIA EN 1 PARA EL CONTADOR

            _1_Persona DATOS3 = new _1_Persona();         // OBJETO PERSONA

// DATOS PERSONA            
            System.out.println("PERSONA:" + i);
            System.out.println("NOMBRE");
            String Nombre = teclado.next();
            System.out.println("APELLIDO");
            String Apeliido = teclado.next();
            System.out.println("EDAD");
            int Edad = teclado.nextInt();
            System.out.println("ID");
            int id = teclado.nextInt();

// BUCLE WHILE             
            boolean band = true;
            while (band) {
                System.out.println("MASCOTA 1 o 2");
                int var = teclado.nextInt();

// SWITCH (LA OPCION DETERMINA EL ELEMENTO (OBJETO) DE LA "LISTA MASCOTA" A AÑADIR A LOS ATRIBUTOS DEL "OBJETO PERSONA")
                switch (var) {
                    case 1:
                        DATOS3.setMascota(DATOS);
                        band = false;

                        break;
                    case 2:
                        DATOS3.setMascota(DATOS2);
                        band = false;

                        break;
                    default:
                        System.out.println("RESPUESTA INCORRECTA");       // SI ES INCORRECTO EL BUCLE SE REPITE
                }
            }

// AÑADIR
            DATOS3.setNombre(Nombre);
            DATOS3.setApellido(Apeliido);
            DATOS3.setEdad(Edad);
            DATOS3.setID(id);
            
// AÑADIR A LA LISTA PERSONA
            ListaPers.add(DATOS3);
            
            System.out.println("-----------------------------------");

            if (i == 2) {               // SI ES EL ULTIMO BUCLE SE CUMPLE
                
                System.out.println("LISTA: ");
                for (_1_Persona ListaP : ListaPers) {
                    System.out.println(ListaP);
                    System.out.println("");
                }
            }
        }

    }

}
