// 
// Decompiled by Procyon v0.5.36
// 

package java_poo;

import Entidad._01_Libro;
import Servicio._01_LibroService;

public class _01_
{
    public static void main(final String[] args) {
        _01_LibroService RESPUESTA = new _01_LibroService();
        _01_Libro MEMORY = RESPUESTA.Datos();
        RESPUESTA.total(MEMORY);
    }
}
