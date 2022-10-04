/*
 Realizar el juego de la ruleta rusa de agua en Java. Como muchos saben, el juego se trata de
un número de jugadores, que, con un revolver de agua, el cual posee una sola carga de agua,
se dispara y se moja. Las clases por hacer del juego son las siguientes:

Clase Revolver de agua: 
esta clase posee los siguientes atributos: posición actual (posición
del tambor que se dispara, puede que esté el agua o no) y posición agua (la posición del
tambor donde se encuentra el agua). Estas dos posiciones, se generarán aleatoriamente.
Métodos:
• llenarRevolver(): le pone los valores de posición actual y de posición del agua. Los valores
deben ser aleatorios.
• mojar(): devuelve true si la posición del agua coincide con la posición actual
• siguienteChorro(): cambia a la siguiente posición del tambor
• toString(): muestra información del revolver (posición actual y donde está el agua)

Clase Jugador: 
esta clase posee los siguientes atributos: id (representa el número del jugador), 
nombre (Empezara con Jugador más su ID, “Jugador 1” por ejemplo) y mojado (indica
si está mojado o no el jugador). El número de jugadores será decidido por el usuario, pero
debe ser entre 1 y 6. Si no está en este rango, por defecto será 6.
Métodos:
• disparo(Revolver r): el método, recibe el revolver de agua y llama a los métodos de
mojar() y siguienteChorro() de Revolver. El jugador se apunta, aprieta el gatillo y si el
revolver tira el agua, el jugador se moja. El atributo mojado pasa a false y el método
devuelve true, sino false.

Clase Juego: 
esta clase posee los siguientes atributos: Jugadores (conjunto de Jugadores) y Revolver
Métodos:
• llenarJuego(ArrayList<Jugador>jugadores, Revolver r): este método recibe los jugadores
y el revolver para guardarlos en los atributos del juego.

10
• ronda(): cada ronda consiste en un jugador que se apunta con el revolver de agua y
aprieta el gatillo. Sí el revolver tira el agua el jugador se moja y se termina el juego, sino se
moja, se pasa al siguiente jugador hasta que uno se moje. Si o si alguien se tiene que
mojar. Al final del juego, se debe mostrar que jugador se mojó.
Pensar la lógica necesaria para realizar esto, usando los atributos de la clase Juego.
 */
package Main;

import Entidad._2_Juego;
import Entidad._2_Jugador;
import Entidad._2_RevolverDeAgua;
import Servicio._2_RuletaServicio;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Mario
 */
public class _2_Ruleta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        ArrayList<_2_Jugador> JugadoresList = new ArrayList();

        Scanner teclado = new Scanner(System.in);

        _2_Juego DatosList = new _2_Juego();
        _2_RuletaServicio datos = new _2_RuletaServicio();    // OBJETO

        System.out.println("CANTIDAD DE JUGADORES");
        Integer CANT = teclado.nextInt();

        for (int i = 1; i <= CANT; i++) {
            boolean RES = datos.mojar();
            System.out.println("JUGADOR: " + i);
            String nombre = teclado.next();

            _2_Jugador j = new _2_Jugador(i , nombre , false);
            JugadoresList.add(j);

        }

        _2_Juego StarGame = new _2_Juego();

        System.out.println("CARGANDO...........");
        System.out.println("-----------------STAR----------------");

        
        _2_RevolverDeAgua revolverDeAgua = new _2_RevolverDeAgua();
        
        revolverDeAgua.llenarRevolver();

        StarGame.llenarJugador(JugadoresList, revolverDeAgua);
        

        System.out.println("JUGADORES:");
        for (_2_Jugador jugador : JugadoresList) {     // MOSTRAR JUGADORES
            
            System.out.println(jugador);
        }

        System.out.println("");
        System.out.println("REVOLVER DE AGUA:");
        System.out.println(revolverDeAgua);     // MOSTRAR REVOLVER DE AGUA
        System.out.println("");

        int CONT = 0;
        boolean SIGUIENTE = true;
        
        while (SIGUIENTE) {

            if (CONT == CANT) {
                CONT = 0;
            }
            System.out.println( "EL JUGADOR " + JugadoresList.get(CONT).getNombre() + " SE APUNTA");

            SIGUIENTE = StarGame.ronda(CONT);

            if (SIGUIENTE == false) {
                System.out.println( "(DISPARO DE AGUA)" + 
                                   "\n" + "   ___________-_ " +  
                                   "\n" + "  /_-__-_-_-___| " +   "     (JUGADOR) " + JugadoresList.get(CONT).getNombre() +
                                   "\n" + " /__/  )" + 
                                   "\n" + "/__/  "  );

            } else {
                System.out.println("EL JUGADOR " + JugadoresList.get(CONT).getNombre() + " (NO HAY MUNICION)");
            }
            
            CONT++;
        }

        System.out.println("");
        for (_2_Jugador jugador : JugadoresList) {
            System.out.println(jugador);

        }
        System.out.println("");
        System.out.println("REVOLVER DE AGUA:");
        System.out.println(revolverDeAgua);
        
        
    }

    
    

}
