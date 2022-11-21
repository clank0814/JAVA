/*
 Defina una clase llamada DivisionNumero. En el método main utilice un Scanner para leer dos
números en forma de cadena. A continuación, utilice el método parseInt() de la clase Integer,
para convertir las cadenas al tipo int y guardarlas en dos variables de tipo int. Por ultimo realizar
una división con los dos numeros y mostrar el resultado.
 */
package Main;

import java.util.Scanner;

/**
 *
 * @author Mario
 */
public class _3_String_to_Int {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("String to Int");    
        
        System.out.println("NUM 1");
        String num = teclado.next();
        System.out.println("NUM 2");
        String num2 = teclado.next();
        
    
        
        
        int val = Integer.parseInt(num);
        int val2 = Integer.parseInt(num2);
        
        
        System.out.println("NUMERO 1: " + val);
        System.out.println("NUMERO 2: " + val2);
        
        System.out.println("DIVISION: " + val + " / " +  val2);
        
        int res = val / val2;
        
        System.out.println("RESULTADO: " + res);
    }
    
}
