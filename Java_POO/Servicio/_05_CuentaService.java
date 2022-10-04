// 
// Decompiled by Procyon v0.5.36
// 

package Servicio;

import java.util.Scanner;
import Entidad._05_Cuenta;

public class _05_CuentaService
{
    public _05_Cuenta DatosCuenta() {
        final _05_Cuenta DatosCuenta = new _05_Cuenta();
        final Scanner teclado = new Scanner(System.in);
        System.out.println("NUMERO DE CUENTA");
        DatosCuenta.setNumeroCuenta(teclado.nextInt());
        System.out.println("DNI");
        DatosCuenta.setDNI(teclado.nextInt());
        System.out.println("SALDO ACTUAL");
        DatosCuenta.setSaldoActual(teclado.nextInt());
        return DatosCuenta;
    }
    
    public void Sumar(final _05_Cuenta DatosCuenta) {
        final Scanner teclado = new Scanner(System.in);
        System.out.println("DESEA REALIZAR UN DEPISITO?");
        final String RESP = teclado.nextLine();
        if (RESP.equals("SI") || RESP.equals("si")) {
            System.out.println("COLOQUE LA CANTIDAD A INGRESAR");
            final double ingreso = teclado.nextDouble();
            final double Saldo = ingreso + DatosCuenta.getSaldoActual();
            DatosCuenta.setSaldoActual((int)Saldo);
        }
    }
    
    public void Restar(final _05_Cuenta DatosCuenta) {
        final Scanner teclado = new Scanner(System.in);
        System.out.println("DESEA RETIRAR DINERO?");
        final String RESP = teclado.nextLine();
        if (RESP.equals("SI") || RESP.equals("si")) {
            System.out.println(DatosCuenta.getSaldoActual());
            System.out.println("");
            System.out.println("COLOQUE LA CANTIDAD A RETIRAR");
            final double retiro = teclado.nextDouble();
            final double Saldo = DatosCuenta.getSaldoActual() - retiro;
            DatosCuenta.setSaldoActual((int)Saldo);
        }
    }
    
    public void ExtraccionRapida(final _05_Cuenta DatosCuenta) {
        final Scanner teclado = new Scanner(System.in);
        System.out.println("DESEA REALIZAR UNA EXTRACCION RAPIDA?");
        final String RESP = teclado.nextLine();
        final double limite = DatosCuenta.getSaldoActual() * 0.2;
        if (RESP.equals("SI") || RESP.equals("si")) {
            System.out.println(DatosCuenta.getSaldoActual());
            System.out.println("");
            System.out.println("COLOQUE LA CANTIDAD A RETIRAR");
            final double retiro = teclado.nextDouble();
            if (retiro <= limite) {
                final double Saldo = DatosCuenta.getSaldoActual() - retiro;
                DatosCuenta.setSaldoActual((int)Saldo);
            }
            else {
                System.out.println("NO SE PUEDE RETIRAR");
                System.out.println("LA CANTIDAD SUPERA EL 20%");
            }
        }
    }
    
    public void ConsultarSaldo(final _05_Cuenta DatosCuenta) {
        final Scanner teclado = new Scanner(System.in);
        System.out.println("DESEA CONSULTAR SALDO?");
        final String RESP = teclado.nextLine();
        if (RESP.equals("SI") || RESP.equals("si")) {
            System.out.println(DatosCuenta.getSaldoActual());
        }
    }
    
    public void ConsultarDatos(final _05_Cuenta DatosCuenta) {
        final Scanner teclado = new Scanner(System.in);
        System.out.println("DESEA CONSULTAR DATOS?");
        final String RESP = teclado.nextLine();
        if (RESP.equals("SI") || RESP.equals("si")) {
            System.out.println(DatosCuenta.getNumeroCuenta());
            System.out.println(DatosCuenta.getDNI());
            System.out.println(DatosCuenta.getSaldoActual());
        }
    }
}
