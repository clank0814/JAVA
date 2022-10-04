/*
 Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la
suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un programa que
permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no.
El programa deberá comprobar que los números introducidos son correctos, es decir,
están entre el 1 y el 9.
 */
package Egg_Java;

/**
 *
 * @author Mario
 */
import java.util.Scanner;

public class _20_Matriz_Magica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        System.out.println("MATRIZ MAGICA");

        Scanner teclado = new Scanner(System.in);

        // MATRIZ 1 Y 2
        int matriz[][] = new int[3][3];
        int matriz2[][] = new int[3][3];

        // DATOS DE LA MATRIZ
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.println("FILA: " + i + " COLUMNA: " + j);
                int var = teclado.nextInt();
                matriz[i][j] = var;
            }
        }
        // LLAMADO A LA FUNCION
        funcion(matriz);
    }

    // FUNCION (VOID)
    public static void funcion(int[][] matriz) {

        int filas = 0;
        int columnas = 0;
        int diagonal = 0;
        int C_diagonal = 0;
        int total = 0, total2 = 0;

// FILAS 
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print("[" + matriz[i][j] + "]");
                filas = filas + matriz[i][j];

            }
            System.out.println(" = " + filas);
            total = total + filas;
            filas = 0;
        }
        System.out.println(" =  =  = ");

// COLUMNAS
        for (int j = 0; j < matriz.length; j++) {
            for (int i = 0; i < matriz.length; i++) {

                columnas = columnas + matriz[i][j];

            }

            total2 = total2 + columnas;
            System.out.print(columnas + " ");
            columnas = 0;

        }

        System.out.println("");
// DIAGONAL
        System.out.println("DIAGONAL:");
        for (int i = 0; i < matriz.length; i++) {
            diagonal = diagonal + matriz[i][i];
        }
        System.out.println(" = " + diagonal);

        System.out.println("");
// C_DIAGONAL      
        System.out.println("C_DIAGONAL:");
        for (int i = 0; i < matriz.length; i++) {
            C_diagonal = C_diagonal + matriz[i][2 - i];

        }
        System.out.println(" = " + C_diagonal);

        System.out.println("--------------------");
        if (total == total2) {

            if (diagonal == C_diagonal) {
                System.out.println("ES UNA MATRIZ MAGICA");
            } else {
                System.out.println("NO ES UNA MATRIZ MAGICA");
            }
        }

    }
}
