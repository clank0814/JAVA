// 
// Decompiled by Procyon v0.5.36
// 

package Servicio;

import java.util.Date;
import Entidad._12_Fecha;
import java.util.Scanner;

public class _12_FechaService
{
    Scanner teclado;
    
    public _12_FechaService() {
        this.teclado = new Scanner(System.in);
    }
    
    public _12_Fecha crearPersona() {
        final _12_Fecha DATOS = new _12_Fecha();
        System.out.println("COLOQUE SU NOMBRE:");
        final String nombre = this.teclado.nextLine();
        DATOS.setNombre(nombre);
        System.out.println("FECHA DE NACIMIENTO");
        System.out.println("DIA:");
        final int dia = this.teclado.nextInt();
        System.out.println("MES:");
        final int mes = this.teclado.nextInt();
        System.out.println("ANIO:");
        final int anio = this.teclado.nextInt();
        final Date fecha = new Date(anio - 1900, mes - 1, dia);
        DATOS.setFechaN(fecha);
        System.out.println("PERSONA 2");
        System.out.println("EDAD:");
        final int edad2 = this.teclado.nextInt();
        DATOS.setEdad2(edad2);
        final Date fechaActual = new Date();
        final int anio2 = fecha.getYear();
        final int anioActual = fechaActual.getYear();
        final int edad3 = anioActual - anio2;
        DATOS.setEdad(edad3);
        return DATOS;
    }
    
    public boolean menorQue(final _12_Fecha DATOS) {
        final int edad = DATOS.getEdad();
        final int edad2 = DATOS.getEdad2();
        boolean var = true;
        if (edad2 > edad) {
            var = false;
        }
        DATOS.setMayor(var);
        return var;
    }
    
    public void mostrarPersona(final _12_Fecha DATOS) {
        final String nombre = DATOS.getNombre();
        final int edad = DATOS.getEdad();
        final boolean mayor = DATOS.getMayor();
        System.out.println(nombre);
        System.out.println(edad);
        System.out.println(mayor);
        if (mayor) {
            System.out.println(mayor);
        }
    }
}
