/*
 Escribir un programa que pida dos números enteros por teclado y calcule la suma de los
dos. El programa deberá después mostrar el resultado de la suma
 */
package Egg_Java;

/**
 *
 * @author Mario
 */
import java.util.Scanner;
public class _01_Suma_Teclado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //TECLADO
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("NUMERO 1");
        int num1 = teclado.nextInt();
        System.out.println("NUMERO 2");
        int num2 = teclado.nextInt();
        
        int resp = num1 + num2;
        System.out.println("RESULTADO: " + resp);
    } 
}
