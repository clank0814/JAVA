// 
// Decompiled by Procyon v0.5.36
// 

package Servicio;

import java.util.Scanner;
import Entidad._03_Operacion;

public class _03_OperacionService
{
    public _03_Operacion CrearOperacion() {
        final _03_Operacion CrearOperacion = new _03_Operacion();
        final Scanner teclado = new Scanner(System.in);
        System.out.println("COLOQUE NUM 1");
        CrearOperacion.setNum1(teclado.nextInt());
        System.out.println("COLOQUE EL NUM 2");
        CrearOperacion.setNum2(teclado.nextInt());
        System.out.println("----------------------------");
        return CrearOperacion;
    }
    
    public void suma(final _03_Operacion CrearOperacion) {
        final int resp = CrearOperacion.getNum1() + CrearOperacion.getNum2();
        System.out.println("SUMA");
        System.out.println(resp);
        System.out.println("");
    }
    
    public void Resta(final _03_Operacion CrearOperacion) {
        final int Resp = CrearOperacion.getNum1() - CrearOperacion.getNum2();
        System.out.println("RESTA");
        System.out.println(Resp);
        System.out.println("");
    }
    
    public void Multiplicacion(final _03_Operacion CrearOperacion) {
        final int val1 = CrearOperacion.getNum1();
        final int val2 = CrearOperacion.getNum2();
        if (val1 != 0 && val2 != 0) {
            final int total = val1 * val2;
            System.out.println("MULTIPLICACION");
            System.out.println(total);
            System.out.println("");
        }
        else {
            System.out.println("ERROR AL MULTIPLICAR");
            System.out.println("");
        }
    }
    
    public void Divicion(final _03_Operacion CrearOperacion) {
        final double val1 = CrearOperacion.getNum1();
        final double val2 = CrearOperacion.getNum2();
        if (val1 != 0.0 && val2 != 0.0) {
            final double total = val1 / val2;
            System.out.println("DIVICION");
            System.out.println(total);
        }
        else {
            System.out.println("ERROR AL DIVIDIR");
        }
    }
}
