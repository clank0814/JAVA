/*
Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite
números al usuario hasta que la suma de los números introducidos supere el límite inicial.
 */
package Egg_Java;

/**
 *
 * @author Mario
 */
import java.util.Scanner;
public class _10_Colocar_Limite_Permitido_num {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("COLOQUE NUMERO LIMITE");
        Scanner teclado = new Scanner(System.in);
        int num_limite = teclado.nextInt();
        
        System.out.println("COLOQUE NUMEROS HASTA SUPERAR EL LIMITE");
        int resp = 0;
        int a = 0;
        int b = 0;
        int c = 0;
        
        // BUCLE
        for (resp = 0; resp < num_limite; ) {
            
            // SUMA
            a = teclado.nextInt();
            c = a + b;           // A = TECLADO , B = 0
            resp = c;            
            b = c;               // SI EL BUCLE NO TERMINA B = C SE SUMA EL RESULTADO ANTERIOR
                   
           }
        // SI "RESP"↑ ES MAYOR O IGUAL AL "NUM_LIMITE" 
             if (resp >= num_limite){
             System.out.println("LIMITE ALCANZADO: " + resp);
             
        }
             
    }
    
}
