/*
Crear un vector de 5 posiciones,posteriormente guardar un número
en cada una de las posiciones del vector,y finalmente imprimir en
pantalla cada una de las posiciones para verificar que se hayan guardado
los números de manera correcta.
 */
package java_code;

import java.sql.SQLOutput;

/**
 *
 * @author Mario
 */
public class Arreglo_vector {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("ESTATICO");
        
        // ESTATICO
        int vector[] = new int[5];
        vector [0] = 5;
        vector [1] = 4;
        vector [2] = 3;
        vector [3] = 2;
        vector [4] = 1;
        System.out.print("[" + vector[0] + "]");
        System.out.print("[" + vector[1] + "]");
        System.out.print("[" + vector[2] + "]");
        System.out.print("[" + vector[3] + "]");
        System.out.print("[" + vector[4] + "]");
       
        System.out.println("");
        System.out.println("DINAMICO");
        // DINAMICO
      int vector2 [] = new int[10];
      for (int i = 5 ; i<vector2.length ; i++){   // INICIO (I = 5 + 1 )
          vector2[i] = i + 1;        //GUARDA LA SUMA EN LA POSICION DEL VECTOR
          System.out.print("[" + vector2[i] + "]");   //PANTALLA
      }
      System.out.println("");
    }
    
}
