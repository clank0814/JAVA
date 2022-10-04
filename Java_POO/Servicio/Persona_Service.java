// 
// Decompiled by Procyon v0.5.36
// 

package Servicio;

import Entidad.Persona;
import java.util.Scanner;

public class Persona_Service
{
    Scanner teclado;
    
    public Persona_Service() {
        this.teclado = new Scanner(System.in);
    }
    
    public Persona CreaPersona() {
        System.out.println("COLOQUE SU NOMBRE");
        final Persona PersonaCompletar = new Persona(this.teclado.next());
        return PersonaCompletar;
    }
}
