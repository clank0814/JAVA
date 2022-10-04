// 
// Decompiled by Procyon v0.5.36
// 

package java_poo;

import Entidad._07_Persona;
import Servicio._07_PersonaService;

public class _07_
{
    public static void main(final String[] args) {
        int CONT = 0;
        final int[] vector = new int[4];
        final _07_PersonaService persona1 = new _07_PersonaService();
        final _07_Persona CrearPersona = persona1.CrearPersona();
        vector[0] = persona1.calcularIMC(CrearPersona);
        final boolean mayor = persona1.EsMayorDeEdad(CrearPersona);
        if (mayor) {
            System.out.println("ES MAYOR DE EDAD");
            ++CONT;
        }
        System.out.println("------------------");
        final _07_PersonaService persona2 = new _07_PersonaService();
        final _07_Persona CrearPersona2 = persona2.CrearPersona();
        vector[1] = persona2.calcularIMC(CrearPersona2);
        final boolean mayor2 = persona2.EsMayorDeEdad(CrearPersona2);
        if (mayor2) {
            System.out.println("ES MAYOR DE EDAD");
            ++CONT;
        }
        System.out.println("------------------");
        final _07_PersonaService persona3 = new _07_PersonaService();
        final _07_Persona CrearPersona3 = persona3.CrearPersona();
        vector[2] = persona3.calcularIMC(CrearPersona3);
        final boolean mayor3 = persona3.EsMayorDeEdad(CrearPersona3);
        if (mayor3) {
            System.out.println("ES MAYOR DE EDAD");
            ++CONT;
        }
        System.out.println("------------------");
        final _07_PersonaService persona4 = new _07_PersonaService();
        final _07_Persona CrearPersona4 = persona4.CrearPersona();
        vector[3] = persona4.calcularIMC(CrearPersona4);
        final boolean mayor4 = persona4.EsMayorDeEdad(CrearPersona4);
        if (mayor4) {
            System.out.println("ES MAYOR DE EDAD");
            ++CONT;
        }
        System.out.println("------------------");
        final int Edad = 4 - CONT;
        int bajo = 0;
        int ideal = 0;
        int alto = 0;
        for (int i = 0; i < vector.length; ++i) {
            switch (vector[i]) {
                case -1: {
                    ++bajo;
                    break;
                }
                case 0: {
                    ++ideal;
                    break;
                }
                case 1: {
                    ++alto;
                    break;
                }
            }
        }
        System.out.println("1" + CONT);
        System.out.println("IMC TOTAL (PERSONAS):");
        System.out.println("2" +  bajo);
        System.out.println("3" +ideal);
        System.out.println("4" +alto);
    }
}
