/*
1.
Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
salir, se mostrará todos los perros guardados en el ArrayList.

2.
Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá
un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. Si el perro
está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista
ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará
la lista ordenada.
 */
package Entidad;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Mario
 */
public class _1_Raza {

    public String Raza;       // ATRIBUTO

// CONSTRUCTOR    
    public _1_Raza(String Raza) {
        this.Raza = Raza;
    }
// CONSTRUCTOR VOID
    public _1_Raza() {
    }

// ARRAY    
    ArrayList<String> raza = new ArrayList();
    Scanner teclado = new Scanner(System.in);
    int cont = 1;

// METODO 1 DATOS    
    public void datos() {

        boolean var = true;

        while (var) {
            System.out.println("COLOQUE LA RAZA DEL PERRO " + cont);
            raza.add(teclado.nextLine());

            System.out.println("COLOCAR OTRA RAZA?  S/N");
            String res = teclado.nextLine();
            if (res.equals("s") || res.equals("S")) {
                cont++;
            } else {
                var = false;
            }
        }
    }

// METODO 2 MOSTRAR    
    public void mostrar() {
        System.out.println("---------------------");
        System.out.println("LISTA:");
        for (String lista : raza) {
            System.out.println(lista);
        }
    }

// METODO 3 ITERATOR (BUSCAR-ELIMINAR)
    public void iterator() {

        boolean buscador = false;       // PARA NO REPETIR EL MENSAJE CON EL BUCLE
        System.out.println("");
        System.out.println("ELIMINAR RAZA");
        System.out.println("COLOQUE LA RAZA");
        String RES = teclado.nextLine();

        Iterator<String> i = raza.iterator();

// BUCLE        
        while (i.hasNext()) {
            String val = i.next();

            if (val.equals(RES)) {      // SI LO ENCUNTRA (BUSCADOR = TRUE Y UN BREAK PARA QUE SALTE EL "ELSE")
                i.remove();             
                buscador = true;
                break;
                
            }
        }
        
        if (buscador == false) {        // SI NO LO ENCUENTRA (BUSCADOR = FALSE Y MUESTRA EL MENSAJE)
            System.out.println("");
            System.out.println("NO SE ENCONTRO RESULTADOS");
        }
        
// LISTA        
        System.out.println("---------------------");
        System.out.println("LISTA:");
        for (String lista2 : raza) {
            System.out.println(lista2);
        }
    }
}
