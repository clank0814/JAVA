/*
 Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el número
ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo:
5 *****
3 ***
11 ***********
2 **
 */
package java_code;

/**
 *
 * @author Mario
 */
import java.util.Scanner;
public class Ejercicios {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("COLOCAR 4 NUMEROS ENTRE 1 A 20");
        Scanner num = new Scanner(System.in);
        int numero = 0;
        int vector []= new int[4];
        
        
        // COLOCAR VALOR AL VECTOR
        for (int i = 0; i < vector.length;) {     // SIN AUMENTO DE VALOR "I++" (BUCLE INFINITO)
         numero = num.nextInt();
         
         // CONDICION
           if (numero <= 20 && numero >= 1) {
               vector [i] = numero;
               i++;                                  // SI LA CONDICION SE CUMPLE SI AUMENTA EL VALOR (I++)
           }
           else {
               System.out.println("NUMEROS ENTRE 1 A 20");
           }
        }
        
        // PANTALLA: ESCRIBIR EL NUMERO DEL VECTOR + CANTIDAD DE " * " (CON UN BUCLE)
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i]+"");           // ESCRIBIR EN BUCLE 1 (EL DATO SE LEE PRIMERO, LUEGO EL BUCLE 2) 
            for (int j = 0; j < vector[i]; j++) { 
                
                System.out.print("*");
            }
            System.out.println("");
        }
        
    }
}



    

