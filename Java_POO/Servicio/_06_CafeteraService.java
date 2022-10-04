// 
// Decompiled by Procyon v0.5.36
// 

package Servicio;

import Entidad._06_Cafetera;
import java.util.Scanner;

public class _06_CafeteraService
{
    Scanner teclado;
    
    public _06_CafeteraService() {
        this.teclado = new Scanner(System.in);
    }
    
    public _06_Cafetera llenarCafetera() {
        _06_Cafetera llenarCafetera = new _06_Cafetera();
        Scanner teclado = new Scanner(System.in);
        System.out.println("LITROS EN LA CAFETERA");
        double CANTIDAD = teclado.nextDouble();
        llenarCafetera.setCapacidadMaxima(CANTIDAD);
        llenarCafetera.setCantidadActual(CANTIDAD);
        System.out.println("");
        return llenarCafetera;
    }
    
    public void ServirTasa(_06_Cafetera llenarCafetera) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("QUIERE CAFE ?");
        String RESP = teclado.nextLine();
        if (RESP.equals("si") || RESP.equals("SI")) {
            System.out.println("CANTIDAD (LITROS)");
            double TASA = teclado.nextDouble();
            if (TASA <= llenarCafetera.getCapacidadMaxima()) {
                System.out.println("TASA LLENA");
                double TOTAL = llenarCafetera.getCapacidadMaxima() - TASA;
                llenarCafetera.setCantidadActual(TOTAL);
            }
            else {
                System.out.println("UUUH DON, NOS QUEDAMOS SIN CAFE");
                System.out.println(llenarCafetera.getCapacidadMaxima());
                double cantidad = llenarCafetera.getCapacidadMaxima() - llenarCafetera.getCapacidadMaxima();
                llenarCafetera.setCantidadActual(cantidad);
            }
        }
    }
    
    public void VaciarCafetera(final _06_Cafetera llenarCafetera) {
        double CANTIDAD = llenarCafetera.getCantidadActual();
        System.out.println("");
        if (CANTIDAD > 0.0) {
            System.out.println(CANTIDAD);
            System.out.println("LO TIRAMOS?");
            final String RESP = this.teclado.nextLine();
            if (RESP.equals("si") || RESP.equals("SI")) {
                llenarCafetera.setCantidadActual(0.0);
                System.out.println("LITROS EN CAFETERA: 0L ");
            }
        }
    }
    
    public void AgregarCafe(final _06_Cafetera llenarCafetera) {
        System.out.println("");
        System.out.println("PREPARAMOS MAS CAFE JEFE?");
        String RESP = this.teclado.nextLine();
        if (RESP.equals("si") || RESP.equals("SI")) {
            System.out.println("CANTIDAD: ");
            double CANTIDAD = this.teclado.nextDouble();
            Double TOTAL = llenarCafetera.getCantidadActual() + CANTIDAD;
            System.out.println(TOTAL);
        }
    }
}
