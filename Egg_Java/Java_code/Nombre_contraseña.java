/*
 METODO (EQUALS)
 */
package java_code;

/**
 *
 * @author Mario
 */
import java.util.Scanner;
public class Nombre_contraseña {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in); 
        System.out.println("Coloque su nombre");
        String nombre = teclado.nextLine(); 
        
        //METODO EQUALS
        if ("Mario".equals(nombre) || "MARIO".equals(nombre)){
            System.out.println("CONTRASEÑA");
            int num = teclado.nextInt();
            
            if (num == 12345) {
                    System.out.println("ACCESO CONCEDIDO");
                    }
            else {
                System.out.println("CONTRASEÑA INCORRECTA");
            }
        }
        else {
            System.out.println("USUARIO INCORRECTO");
        }           
        
    }
    
}
