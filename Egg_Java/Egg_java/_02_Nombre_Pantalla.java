/*
Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por
pantalla.
 */
package Egg_Java;

/**
 *
 * @author Mario
 */
import java.util.Scanner;
public class _02_Nombre_Pantalla {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // TECLADO
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("COLOQUE SU NOMBRE");
        String nombre = teclado.nextLine();
        
        System.out.println(nombre);
    }
    
}
