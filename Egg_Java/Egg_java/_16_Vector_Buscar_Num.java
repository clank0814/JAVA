/*
 Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida al
usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el
numero y si se encuentra repetido
 */
package Egg_Java;

/**
 *
 * @author Mario
 */
import java.util.Scanner;

public class _16_Vector_Buscar_Num {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("CANTIDAD DE NUMEROS ALEATORIOS");
        Scanner teclado = new Scanner(System.in);
        int num = teclado.nextInt();
        int vector[] = new int[num];

        // BUCLE 1
        for (int i = 0; i < vector.length; i++) {

            // NUM ALEATOREO
            // METODO MATH.random : SOLO USA DOUBLE 
            int aleatoreo = (int) (Math.random() * 100);    // SE CONVIERTE A ENTERO --> (* 100) --> (int) 
            vector[i] = aleatoreo;
        }
        System.out.println("BUSCAR EL NUMERO:");
        // NUM BUSCADOR
        int buscador = teclado.nextInt();
        System.out.println("----------------------------");
        System.out.println("NUMERO: " + buscador);
        System.out.println("");
        int cont = 0;

        // BUCLE 2
        for (int i = 0; i < vector.length; i++) {
            if (buscador == vector[i]) {       // SI BUSCADOR = VECTOR[i](NUM) ES CORRECTO     
                cont++;     // CONT + 1
                System.out.println("POSICION " + i);
            }

        }
        System.out.println("SE REPITE " + cont + " VECES");
    }

}
