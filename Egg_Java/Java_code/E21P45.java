// 
// Decompiled by Procyon v0.5.36
// 

package java_code;

import java.util.Scanner;

public class E21P45
{
    public static void main(final String[] args) {
        final Scanner read = new Scanner(System.in);
        final int[][] m = new int[10][10];
        final int[][] p = new int[3][3];
        for (int i = 0; i < 10; ++i) {
            for (int j = 0; j < 10; ++j) {
                m[i][j] = (int)(Math.random() * 10.0);
            }
        }
        for (int i = 0; i < 10; ++i) {
            for (int j = 0; j < 10; ++j) {
                System.out.print(m[i][j] + "/");
            }
            System.out.println("");
        }
        System.out.println("Escriba una matriz 3x3 que existe en la matriz anterior");
        for (int i = 0; i < 3; ++i) {
            for (int j = 0; j < 3; ++j) {
                do {
                    p[i][j] = read.nextInt();
                    if (p[i][j] >= 10 || p[i][j] <= -1) {
                        System.out.println("numero equivocado tiene que estar por debajo de 9 y por encima de 0");
                    }
                } while (p[i][j] >= 10 || p[i][j] <= -1);
            }
        }
        for (int i = 0; i < 3; ++i) {
            for (int j = 0; j < 3; ++j) {
                System.out.print(p[i][j] + "/");
            }
            System.out.println("");
        }
        FindMtrix(m, p);
    }
    
    public static void FindMtrix(final int[][] m, final int[][] p) {
        boolean v = false;
        int n1 = 0;
        int n2 = 0;
        for (int i = 0; i < 8; ++i) {
            for (int j = 0; j < 8; ++j) {
                if (m[i][j] == p[0][0]) {
                    for (int k = 0; k < 3; ++k) {
                        for (int h = 0; h < 3; ++h) {
                            if (m[k + i][h + j] != p[k][h]) {
                              
                                v = false;
                                break;
                            }
                            v = true;
                            n1 = i;
                            n2 = j;
                        }
                        if (!v) {
                            break;
                        }
                    }
                    if (v) {
                        break;
                    }
                }
                if (v) {
                    break;
                }
            }
            if (v) {
                break;
            }
        }
        if (v) {
            System.out.println("Esta matriz se ha encontrado en " + (n1 + 1) + "/" + (n2 + 1));
        }
        else {
            System.out.println("Esta matriz no ha sido encontrada");
        }
    }
}
