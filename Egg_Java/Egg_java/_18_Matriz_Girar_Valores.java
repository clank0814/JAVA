/*
 Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la
traspuesta de la matriz. La matriz traspuesta de una matriz A se denota por B y se obtiene
cambiando sus filas por columnas (o viceversa).

[1][0][4]          [1][0][6]
[0][5][0]   --->   [0][5][0]
[6][0][-9]         [4][0][-9]
 */
package Egg_Java;

/**
 *
 * @author Mario
 */
import java.util.Scanner;

public class _18_Matriz_Girar_Valores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner teclado = new Scanner(System.in);
        int matriz[][] = new int[4][4];
        System.out.println("MATRIZ A");

        // BUCLE 1
        // EL BUCLE LEE PRIMERO LAS COLUMNAS
        
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                int random = (int) (Math.random() * 100);
                matriz[i][j] = random;
                System.out.print("");
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println(" ");
        }

        // BUCLE 2  
        // CAMBIO i -> j : EL BUCLE LEE PRIMERO LAS FILAS
        
        System.out.println("--------------");
        System.out.println("MATRIZ B");
        for (int j = 0; j < matriz.length; j++) {
            for (int i = 0; i < matriz.length; i++) {
                System.out.print("");
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println(" ");
        }
    }

}
