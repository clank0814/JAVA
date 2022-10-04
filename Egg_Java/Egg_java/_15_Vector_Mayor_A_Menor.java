/*
 Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y los
muestre por pantalla en orden descendente.
 */
package Egg_Java;

/**
 *
 * @author Mario
 */
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
public class _15_Vector_Mayor_A_Menor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner teclado = new Scanner(System.in);
        
        boolean cont = false;
        int num = 0;
        int i = 0;
        int vector[] = new int[10];
        for (i = 0; i < 10; i++) {
            
        
          
            num = teclado.nextInt();
            
            vector[i] = num;
            
            
        }
     Arrays.sort(vector);    // Arrays. sort ORDENA EN FORMA ASCENDENTE (DE MENOR A MAYOR)
     
     // BUCLE 
     // VECTOR.LENGTH-1: INICIA EN EL ULTIMO NUM -1
     // HASTA: 0
     // RESTANDO i - 1 
        for (i = vector.length-1 ; i >= 0; i--) {  // INICIA DE MAYOR A MENOR    
            System.out.println("[" + vector[i] + "]");
        }
       
    }
}

