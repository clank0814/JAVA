/*
 Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, si el
cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
* * * *
*     *
*     *
* * * *
 */
package Egg_Java;

/**
 *
 * @author Mario
 */
import java.util.Scanner;
public class _13_Cuadro_De_Asteriscos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("COLOQUE LA DIMENCION DEL CUADRADO (NUM)");
        // TECLADO
        
        Scanner teclado = new Scanner(System.in);
        int num = teclado.nextInt();
        
        // BUCLE
        
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {
                if (i == 1 || i == num || j == 1 || j == num ){   // SOLO EN LOS EXTREMOS SE ESCRIBE (*)
                    System.out.print("* ");           // (* ) CON ESPACIO
                }
                else{
                    System.out.print("  ");             // ESPACIO VACIO
                }
            }
            System.out.println("");            // SALTO DE LINEA
 
        }
    }
    
}
