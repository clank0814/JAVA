/*
 Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice que una
matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero cambiada de
signo. Es decir, A es anti simétrica si A = -AT. La matriz traspuesta de una matriz A se
denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).

[0][-2][4]          [0][2][-4]
[2][0][2]     ==   [-2][0][-2]
[-4][-2][0]         [4][2][0]

 */
package Egg_Java;

/**
 *
 * @author Mario
 */
import java.util.Scanner;

public class _19_Matriz_Girar_Valores_Comparar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("COMPARAR MATRIZ");

        Scanner teclado = new Scanner(System.in);
        int matriz[][] = new int[3][3];
        int matriz2[][] = new int[3][3];

        // DATOS DE LA MATRIZ
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.println("FILA: " + i + " COLUMNA: " + j);
                int tec = teclado.nextInt();
                matriz[i][j] = tec;
            }
        }

        System.out.println("MATRIZ A");
        // BUCLE 1
        // EL BUCLE LEE PRIMERO LAS COLUMNAS

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print("");
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println(" ");
        }

        // BUCLE 2  
        // CAMBIO i -> j : EL BUCLE LEE PRIMERO LAS FILAS  (GIRAR)
        System.out.println("--------------");
        System.out.println("MATRIZ B");
        for (int j = 0; j < matriz.length; j++) {
            for (int i = 0; i < matriz.length; i++) {
                System.out.print("");
                System.out.print("[" + matriz[i][j] + "]");
                matriz2[i][j] = matriz[i][j];
            }
            System.out.println(" ");
        }

        int cont = 0;
        System.out.println("");

        // BUCLE 3 (COMPARAR MATRIZ)
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (matriz[j][i] == matriz2[i][j]) {
                    cont++;
                }
            }
        }

        // SI CONT = 9 (LONGITUD DE LA MATRIZ) --> ES CORRECTO 
        if (cont == 9) {
            System.out.println("A es anti simetrica de B");

        } else {
            System.out.println("A no es anti simetrica de B");
        }
    }

}
