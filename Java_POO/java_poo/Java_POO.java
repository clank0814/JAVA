// 
// Decompiled by Procyon v0.5.36
// 

package java_poo;

import Entidad.Persona;
import java.util.Scanner;

public class Java_POO
{
    public static void main(final String[] args) {
        final Scanner teclado = new Scanner(System.in);
        final Persona nom = new Persona(teclado.nextLine());
        System.out.println(nom.Nombre);
    }
}
