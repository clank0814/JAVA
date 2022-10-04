/*
 Crear un programa que dado un numero determine si es par o impar.
 */
package Egg_Java;

/**
 *
 * @author Mario
 */
import java.util.Scanner;
public class _06_Num_Par_Impar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("COLOQUE UN NUMERO");
        Scanner teclado = new Scanner(System.in);
        int num = teclado.nextInt();
        if (num % 2 == 0){
            System.out.println("ES PAR");
        }
        else{
            System.out.println("ES IMPAR");
        }
        
    }
    
}
