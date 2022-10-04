/*
 Escribir un programa que lea un número entero por teclado y muestre por pantalla el
doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función Math.sqrt().
 */
package Egg_Java;

/**
 *
 * @author Mario
 */
import java.util.Scanner;
public class _05_Num_Doble_Triple_RaizC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("COLOQUE UN NUMERO");
        Scanner teclado = new Scanner(System.in);
        int num = teclado.nextInt();
        
        // EL DOBLE
        int num2 = num * 2;
        
        // EL TRIPLE
        int num3 = num * 3;
        
        // RAIZ CUADRADA, LA VARIABLE TIENE QUE SER DE "TIPO DOUBLE" (ES UN REQUISITO) 
        double num4 = Math.sqrt(num);
        
        System.out.println("------------------------------------");
        System.out.println("EL DOBLE:");
        System.out.println(num2);
        
        System.out.println("EL TRIPLE:");
        System.out.println(num3);
        
        System.out.println("RAIZ CUADRADA:");
        System.out.println(num4);
    }
    
}
