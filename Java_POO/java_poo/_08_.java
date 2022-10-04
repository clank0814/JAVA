// 
// Decompiled by Procyon v0.5.36
// 

package java_poo;

import Servicio._08_CadenaService;
import java.util.Scanner;
import Entidad._08_Cadena;

public class _08_
{
    public static void main(final String[] args) {
        final _08_Cadena FRASE = new _08_Cadena();
        final Scanner teclado = new Scanner(System.in);
        System.out.println("COLOQUE UNA FRASE");
        final String frase = teclado.nextLine();
        FRASE.setFrase(frase);
        final int cont = frase.length();
        FRASE.setLongitud(cont);
        final _08_Cadena LETRA = new _08_Cadena();
        System.out.println("----------------");
        System.out.println("BUSCAR LETRA (CUANTAS VECES SE REPITE)");
        final String buscarLetra = teclado.nextLine();
        LETRA.setLetra(buscarLetra);
        final _08_Cadena FRASE2 = new _08_Cadena();
        System.out.println("----------------");
        System.out.println("COLOQUE OTRA FRASE (CON LA LONGITUD DE LA ANTERIOR)");
        final String frase2 = teclado.nextLine();
        FRASE2.setFrase2(frase2);
        final _08_Cadena MODIF = new _08_Cadena();
        System.out.println("----------------");
        System.out.println("MODIFICAR FRASE COLOQUE UNA LETRA (SE REEMPLAZA POR LA A)");
        final String modif = teclado.nextLine();
        MODIF.setModif(modif);
        final _08_Cadena BUSCAR = new _08_Cadena();
        System.out.println("----------------");
        System.out.println("BUSCAR UN LETRA");
        final String buscar = teclado.nextLine();
        BUSCAR.setBuscar(buscar);
        final _08_CadenaService RESPUESTA = new _08_CadenaService();
        final int MostrarVocales = RESPUESTA.MostrarVocales(FRASE);
        System.out.println(""+ MostrarVocales);
        RESPUESTA.buscarLetra(LETRA, FRASE);
        RESPUESTA.compararLongitud(FRASE2, FRASE);
        RESPUESTA.reemplazar(FRASE, MODIF);
        RESPUESTA.Buscar(FRASE, BUSCAR);
    }
}
