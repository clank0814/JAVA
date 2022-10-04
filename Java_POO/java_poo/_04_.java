// 
// Decompiled by Procyon v0.5.36
// 

package java_poo;

import Entidad._04_Rectangulo;
import Servicio._04_RectanguloService;

public class _04_
{
    public static void main(final String[] args) {
        final _04_RectanguloService RESPUESTA = new _04_RectanguloService();
        final _04_Rectangulo DatosRectangulo = RESPUESTA.DatosRectangulo();
        RESPUESTA.Superficie(DatosRectangulo);
        RESPUESTA.Perimetro(DatosRectangulo);
        RESPUESTA.Pantalla(DatosRectangulo);
    }
}
