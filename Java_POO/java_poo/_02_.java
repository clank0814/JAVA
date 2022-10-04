// 
// Decompiled by Procyon v0.5.36
// 

package java_poo;

import Entidad._02_Circunferencia;
import Servicio._02_CircunferenciaService;

public class _02_
{
    public static void main(String[] args) {
        _02_CircunferenciaService RESPUESTA = new _02_CircunferenciaService();
        _02_Circunferencia MEMORY = RESPUESTA.CrearCircunferencia();
        
        RESPUESTA.Area(MEMORY);
        RESPUESTA.Perimetro(MEMORY);
        
        
    }
}
