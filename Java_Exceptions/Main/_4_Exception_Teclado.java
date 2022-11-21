/*
 Todas estas operaciones puede tirar excepciones a manejar, el ingreso por teclado puede
causar una excepción de tipo InputMismatchException, el método Integer.parseInt() si la cadena
no puede convertirse a entero, arroja una NumberFormatException y además, al dividir un
número por cero surge una ArithmeticException. Manipule todas las posibles excepciones
utilizando bloques try/catch para las distintas excepciones
 */
package Main;

import com.sun.xml.internal.bind.v2.runtime.output.SAXOutput;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Mario
 */
public class _4_Exception_Teclado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("String to Int");    
      
        try {
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
        
        catch (InputMismatchException e) {
            
            System.out.println("ERROR: TECLADO");
        }
        catch (NumberFormatException e){
            System.out.println("ERROR: SOLO SE ADMITE NUMEROS ENTEROS");
        }
        catch (ArithmeticException e) {
            System.out.println("ERROR: DIVICION POR 0");
        }
        
        
        
        
    
        
        
        
        
    }
    
}
