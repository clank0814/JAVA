// 
// Decompiled by Procyon v0.5.36
// 
package Servicio;

import Entidad._07_Persona;
import java.util.Scanner;

public class _07_PersonaService {

    Scanner teclado;

    public _07_PersonaService() {
        this.teclado = new Scanner(System.in);
    }

    public _07_Persona CrearPersona() {
        boolean val = false;
        System.out.println("COLOQUE SUS DATOS");
        final _07_Persona CrearPersona = new _07_Persona();
        System.out.println("NOMBRE");
        CrearPersona.setNombre(this.teclado.nextLine());
        System.out.println("EDAD");
        CrearPersona.setEdad(this.teclado.nextInt());
        System.out.println("SEXO");
        System.out.println("H hombre, M mujer, O otro");
        final String SaltoDeLinea = this.teclado.nextLine();
        while (!val) {
            final String sexo = this.teclado.nextLine();
            if (sexo.equals("H") || sexo.equals("M") || sexo.equals("O")) {
                CrearPersona.setSexo(sexo);
                val = true;
            } else {
                System.out.println("VALOR INCORRECTO");
                System.out.println("SEXO");
                System.out.println("H hombre, M mujer, O otro");
            }
        }
        System.out.println("PESO");
        CrearPersona.setPeso(this.teclado.nextInt());
        System.out.println("ALTURA (METROS)");
        CrearPersona.setAltura(this.teclado.nextDouble());
        return CrearPersona;
    }

    public int calcularIMC(final _07_Persona crearPersona) {
        final int peso = crearPersona.getPeso();
        final double altura = crearPersona.getAltura() * crearPersona.getAltura();
        int VAR = 0;
        final double RESP = peso / altura;
        if (RESP < 20.0) {
            System.out.println("BAJO DE PESO");
            VAR = -1;
        } else if (RESP >= 20.0 && RESP <= 25.0) {
            System.out.println("PESO IDEAL");
            VAR = 0;
        } else if (RESP > 25.0) {
            System.out.println("SOBREPESO");
            VAR = 1;
        }
        return VAR;
    }

    public boolean EsMayorDeEdad(final _07_Persona crearPersona) {
        boolean mayor = false;
        final int edad = crearPersona.getEdad();
        if (edad >= 18) {
            mayor = true;
        }
        return mayor;
    }
}
