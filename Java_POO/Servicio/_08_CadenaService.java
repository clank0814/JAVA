// 
// Decompiled by Procyon v0.5.36
// 

package Servicio;

import Entidad._08_Cadena;

public class _08_CadenaService
{
    public int MostrarVocales(final _08_Cadena FRASE) {
        int cont = 0;
        final String BUSCAR = FRASE.getFrase();
        final String[] vector = { "a", "e", "i", "o", "u", "A", "E", "I", "O", "U" };
        for (int i = 0; i < BUSCAR.length(); ++i) {
            for (int j = 0; j < vector.length; ++j) {
                if (BUSCAR.substring(i, i + 1).equals(vector[j])) {
                    ++cont;
                }
            }
        }
        return cont;
    }
    
    public void InvertirFrase(final _08_Cadena FRASE) {
        final String LETRA = FRASE.getFrase();
        final String[] vector = new String[LETRA.length()];
        for (int i = 0; i < LETRA.length(); ++i) {
            vector[i] = LETRA.substring(i, i + 1);
        }
        System.out.println("INVERTIR FRASE:");
        for (int i = LETRA.length() - 1; i >= 0; --i) {
            System.out.print(vector[i]);
        }
        System.out.println("");
    }
    
    public void buscarLetra(final _08_Cadena LETRA, final _08_Cadena FRASE) {
        int cont2 = 0;
        final String letra = LETRA.getLetra();
        final String frase = FRASE.getFrase();
        final String[] vector = new String[frase.length()];
        for (int i = 0; i < vector.length; ++i) {
            if (frase.substring(i, i + 1).equals(letra)) {
                ++cont2;
            }
        }
        System.out.println(letra + "" + cont2);
    }
    
    public void compararLongitud(final _08_Cadena FRASE2, final _08_Cadena FRASE) {
        final String frase = FRASE.getFrase();
        final String frase2 = FRASE2.getFrase2();
        if (frase.length() == frase2.length()) {
            System.out.println("LA FRASE 1 Y 2 SON DE LA MISMA LONGITUD");
        }
        else {
            System.out.println("LA FRASE 1 Y 2 NO SON IGUALES");
        }
        System.out.println(frase + "" + frase2);
    }
    
    public void reemplazar(final _08_Cadena FRASE, final _08_Cadena MODIF) {
        final String frase = FRASE.getFrase();
        final String letraModif = MODIF.getModif();
        final String a = "a";
        System.out.println("FRASE MODIFICADA:");
        for (int i = 0; i < frase.length(); ++i) {
            String modif = frase.substring(i, i + 1);
            if (modif.equals(a)) {
                modif = letraModif;
            }
            System.out.print(modif);
        }
        System.out.println("");
    }
    
    public void Buscar(final _08_Cadena FRASE, final _08_Cadena BUSCAR) {
        final String frase = FRASE.getFrase();
        final String buscar = BUSCAR.getBuscar();
        for (int i = 0; i < frase.length(); ++i) {
            final String letra = frase.substring(i, i + 1);
            if (letra.equals(buscar)) {
                System.out.println(buscar);
                break;
            }
        }
    }
}
