/*
 Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda
en minúsculas. Nota: investigar la función toUpperCase() y toLowerCase() en Java.
 */
package Egg_Java;

/**
 *
 * @author Mario
 */
import java.util.Scanner;
public class _03_Palabra_Mayus_Min {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("COLOQUE UNA FRASE");
        
        //TECLADO
        Scanner teclado = new Scanner(System.in);
        String letras = teclado.nextLine();
        
        // toUpperCase: DEVUELVE CARACTERES EN MAYUSCULA
        String mayus = letras.toUpperCase();
        
        // toLowerCase: DEVUELVE CARACTERES EN MINUSCULAS
        String min = letras.toLowerCase();
        
        // PANTALLA
        System.out.println(mayus);
        System.out.println(min);
    
    }
    
}
