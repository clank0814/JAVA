// 
// Decompiled by Procyon v0.5.36
// 

package java_poo;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class _11_Clase_Date
{
    public static void main(final String[] args) {
        final Scanner teclado = new Scanner(System.in);
        System.out.println("FECHA DE NACIMIENTO");
        System.out.println("DIA:");
        final int dia = teclado.nextInt();
        System.out.println("MES:");
        final int mes = teclado.nextInt();
        System.out.println("ANIO:");
        final int anio = teclado.nextInt();
        final Date fechaNacimiento = new Date(anio - 1900, mes - 1, dia);
        final Date fechaActual = new Date();
        final SimpleDateFormat fechaSimple = new SimpleDateFormat("dd/MM/yyyy");
        final String fechaModif = fechaSimple.format(fechaActual);
        final String fechaNac = fechaSimple.format(fechaNacimiento);
        System.out.println(fechaModif);
        System.out.println(fechaNac);
    }
}
