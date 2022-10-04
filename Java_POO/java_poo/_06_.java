// 
// Decompiled by Procyon v0.5.36
// 

package java_poo;

import Entidad._06_Cafetera;
import Servicio._06_CafeteraService;

public class _06_
{
    public static void main(String[] args) {
        _06_CafeteraService RESPUETA = new _06_CafeteraService();
        _06_Cafetera llenarCafetera = RESPUETA.llenarCafetera();    
        RESPUETA.ServirTasa(llenarCafetera);
        RESPUETA.VaciarCafetera(llenarCafetera);
        RESPUETA.AgregarCafe(llenarCafetera);
    }
}
