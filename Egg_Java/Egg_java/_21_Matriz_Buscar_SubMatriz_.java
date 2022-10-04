/*
 Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 y la matriz P de
3x3, se solicita escribir un programa en el cual se compruebe si la matriz P está contenida
dentro de la matriz M. Para ello se debe verificar si entre todas las submatrices de 3x3 que
se pueden formar en la matriz M, desplazándose por filas o columnas, existe al menos una
que coincida con la matriz P. En ese caso, el programa debe indicar la fila y la columna de
la matriz M en la cual empieza el primer elemento de la submatriz P.
Ejemplo:

[1][4][3][4][1][3][5][6][2][5]
[2][2][5][5][1][3][6][2][2][6]
[5][4][3][6][2][3][5][6][2][5]
[2][2][5][4][1][5][5][6][6][2]
[1][5][3][4] [6][2][5] [6][6][2]           [6][2][5]
[1][4][5][4] [1][6][2] [6][2][5]   ---->   [1][6][2]
[2][2][5][5] [1][3][6] [2][2][5]           [1][3][6]
[1][2][3][4][5][3][5][6][2][5]
[1][4][3][4][1][5][5][6][6][2]
[2][2][3][4][5][7][5][6][2][5]

Como podemos observar nuestra submatriz P se encuentra en la matriz M en los índices:
4,4 - 4,5 - 4,6 - 5,4 - 5,5 - 5,6 - 6,4 - 6,5 - 6,6.
 */
package Egg_Java;

/**
 *
 * @author Mario
 */
import java.util.Scanner;

public class _21_Matriz_Buscar_SubMatriz_ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        
        Scanner teclado = new Scanner(System.in);
        
// MATRIZ
        
        int matriz[][] = new int[10][10];
        int matriz2[][] = new int[3][3];

// BUCLE 1 : MATRIZ 1 --> NUM RANDOM

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                int random = (int) (Math.random() * 10);
                matriz[i][j] = random;
                System.out.print("");
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println("  ");
        }
        
        System.out.println("SUBMATRIZ: ");
        
// BUCLE 2 : MATRIZ 2 --> COLOCAR VALORES

        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2.length; j++) {
                System.out.println("FILA " + i + " COLUMNA " + j);
                int num = teclado.nextInt();
                matriz2[i][j] = num;

            }
        }
        
// MATRIZ 1 = MATRIZ 2 --> COMPARAR

        boolean cont = false;
        int num1 = 0;
        int num2 = 0;

// BUCLE 3 : RECORRIDO MATRIZ 1 
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {

                if (matriz[i][j] == matriz2[0][0]) {     // SI MATRIZ 1 = PRIMER NUM (MATRIZ 2) ES CORRECTO

// BUCLE 4 : RECORRIDO MATRIZ 2                    
                    for (int m = 0; m < 3; m++) {
                        for (int n = 0; n < 3; n++) {
                            if (matriz[i + m][j + n] != matriz2[m][n]) {   // SI MATRIZ 1 (NO ES IGUAL) MATRIZ 2
                                                                           // i y j = AL LUGAR DONDE SE CUMPLE EL (IF ↑) + NUM DE LA VARIABLE (M Y N)
                                cont = false;
                                break;

                            }
                            cont = true;
                            num1 = i;
                            num2 = j;
                        }
                        if (!cont) {
                            break;
                        }
                    }
                    if (cont) {
                        break;
                    }
                }
                if (cont) {
                    break;
                }
            }
            if (cont) {
                break;
            }
        }

// PANTALLA --> POSICION
        if (cont) {     // SI CONT ES VERDADERO
            System.out.println("LA MATRIZ SI SE ENCUENTRA");
            System.out.println("POSICION :");
            

            for (int k = num1; k < num1 + 3; k++) {
                for (int l = num2; l < num2 + 3; l++) {
                    System.out.println("[" + k + "]" + ", " + "[" + l + "]");

                }

            }

        } else {
            System.out.println("NO SE ENCONTRO LA MATRIZ");
        }

    }

}
