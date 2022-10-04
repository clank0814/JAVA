/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package Main;

import Entidad.curso;
import Entidad.prof;
import java.util.Scanner;

/**
 *
 * @author Mario
 */
public class Java_Relaciones {

    public static void main(String[] args) {
        
        prof datos = new prof();
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("NOMBRE");
        String nombre = teclado.next();
        
        System.out.println("EDAD");
        int edad = teclado.nextInt();
        
        System.out.println("ID");
        int ID = teclado.nextInt();
        
        datos.setNombre(nombre);
        datos.setEdad(edad);
        datos.setID(ID);
        
        
        curso datos2 = new curso();
        
        System.out.println("MATERIA");
        String materia = teclado.next();
        datos2.setMateria(materia);
        
        
        System.out.println("AÑO");
        int año = teclado.nextInt();
        datos2.setAño(año);
        
        System.out.println("PROF");
        datos2.setProf(datos);
        
        System.out.println(datos);
        System.out.println(datos2);
        
    }
}
