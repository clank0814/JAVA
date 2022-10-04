// 
// Decompiled by Procyon v0.5.36
// 

package java_poo;

import java.util.Arrays;

public class _10_Clase_Arrays
{
    public static void main(final String[] args) {
        final int[] vector = new int[50];
        final double[] vector2 = new double[20];
        for (int i = 0; i < vector.length; ++i) {
            final int num1 = (int)(Math.random() * 100.0);
            vector[i] = num1;
            System.out.println(num1);
        }
        System.out.println("vector2");
        Arrays.sort(vector);
        for (int i = 0; i < 10; ++i) {
            vector2[i] = vector[i];
            System.out.println((int)vector2[i]);
        }
        for (int i = 10; i < 20; ++i) {
            vector2[i] = 0.5;
            System.out.println(vector2[i]);
        }
    }
}
