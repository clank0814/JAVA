// 
// Decompiled by Procyon v0.5.36
// 

package Servicio;

import java.util.Scanner;
import Entidad._04_Rectangulo;

public class _04_RectanguloService
{
    public _04_Rectangulo DatosRectangulo() {
        final _04_Rectangulo DatosRectangulo = new _04_Rectangulo();
        final Scanner teclado = new Scanner(System.in);
        System.out.println("MEDIDA DE LA BASE");
        DatosRectangulo.setBase(teclado.nextInt());
        System.out.println("MEDIDA DE LA ALTURA");
        DatosRectangulo.setAltura(teclado.nextInt());
        return DatosRectangulo;
    }
    
    public void Superficie(final _04_Rectangulo DatosRectangulo) {
        final int RESP = DatosRectangulo.getBase() * DatosRectangulo.getAltura();
        System.out.println("SUPERFICIE: ");
        System.out.println(RESP);
        System.out.println("");
    }
    
    public void Perimetro(final _04_Rectangulo DatosRectangulo) {
        final int RESP = (DatosRectangulo.getBase() + DatosRectangulo.getAltura()) * 2;
        System.out.println("PERIMETRO: ");
        System.out.println(RESP);
        System.out.println("");
    }
    
    public void Pantalla(final _04_Rectangulo DatosRectangulo) {
        final int base = DatosRectangulo.getBase();
        for (int altura = DatosRectangulo.getAltura(), i = 1; i <= altura; ++i) {
            for (int j = 1; j <= base; ++j) {
                if (i == 1 || i == altura || j == 1 || j == base) {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
    }
}
