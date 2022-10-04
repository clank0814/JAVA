/*
 METODO LENGTH Y SUBSTRING
 */
package java_code;

/**
 *
 * @author Mario
 */
import java.util.Scanner;
public class Cadena_caracteres_cont {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner teclado = new Scanner(System.in); 
    String original = "", modif = "";
    int caracter = 0, desde = 0, hasta = 0;
    
        System.out.println("Coloque su nombre");
         original = teclado.nextLine();
         
         //METODO LENGTH
         caracter = original.length();
         
        System.out.println("tiene " + caracter + " caracteres");
       
        // NUEVA CADENA
        System.out.println("COLOQUE INICIO DE LA NUEVA CADENA (NUMEROS)");
        desde = teclado.nextInt();
        System.out.println("COLOQUE FIN DE LA NUEVA CADENA (NUMEROS)");
        hasta = teclado.nextInt();
        
        //METODO SUBSTRING
        modif = original.substring(desde, hasta);
        System.out.println("NUEVA CADENA: " + modif);
    
    }
    
}
