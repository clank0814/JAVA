/*
 Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
 */
package Egg_Java;

/**
 *
 * @author Mario
 */
import java.util.Scanner;
public class _04_Grados_Centigrados_a_Faherenheit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("GRADOS CENTIGRADOS:");
        
        Scanner teclado = new Scanner(System.in);
        int grados = teclado.nextInt();

        int f = 32 + (9 * grados / 5);
        
        System.out.println("GRADOS FAHERENHEIT:");
        System.out.println(f);

    }
    
}
