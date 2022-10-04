// 
// Decompiled by Procyon v0.5.36
// 

package java_poo;

import Entidad._12_Fecha;
import Servicio._12_FechaService;

public class _12_
{
    public static void main(final String[] args) {
        final _12_FechaService res = new _12_FechaService();
        final _12_Fecha crearPersona = res.crearPersona();
        res.mostrarPersona(crearPersona);
    }
}
