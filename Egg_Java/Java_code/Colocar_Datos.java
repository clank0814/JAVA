//Suma de datos
package java_code;

/**
 *
 * @author Mario
 */
import java.util.Scanner;
public class Colocar_Datos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        String nombre = "";
        int num = 0 , num2 = 0 , res = 0;
        
        System.out.println("¿Cual es tu nombre?");
        nombre = teclado.nextLine();
        
        System.out.println("primer numero");
        num = teclado.nextInt();
        
        System.out.println("segundo numero");
        num2 = teclado.nextInt();
        
        res = num + num2;
        System.out.println( nombre + " tu resultado es " + res);
    }
    
}
