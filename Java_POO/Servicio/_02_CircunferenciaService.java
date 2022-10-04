// 
// Decompiled by Procyon v0.5.36
// 

package Servicio;

import java.util.Scanner;
import Entidad._02_Circunferencia;

public class _02_CircunferenciaService
{
    public _02_Circunferencia CrearCircunferencia() {
        _02_Circunferencia MEMORY = new _02_Circunferencia();
        Scanner teclado = new Scanner(System.in);
        System.out.println("COLOQUE EL VALOR DEL RADIO");
        MEMORY.setRadio(teclado.nextInt());
        return MEMORY;
    }
    
    public void Area(_02_Circunferencia MEMORY) {
        int Radio = MEMORY.getRadio();
        double Area = 3.14 * (Radio * Radio);
        System.out.println("AREA: " + Area);
    }
    
    public void Perimetro(_02_Circunferencia MEMORY) {
        int Radio = MEMORY.getRadio();
        double Perimetro = 6.28 * Radio;
        System.out.println("PERIMETRO: " + Perimetro);
    }
}
