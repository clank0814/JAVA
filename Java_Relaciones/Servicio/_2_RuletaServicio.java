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
package Servicio;

import Entidad._2_Juego;
import Entidad._2_Jugador;
import Entidad._2_RevolverDeAgua;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Mario
 */
public class _2_RuletaServicio {

    public ArrayList<_2_Jugador> LISTA = new ArrayList<>();

    public _2_RuletaServicio() {
        this.LISTA = new ArrayList<>();
    }

    _2_RevolverDeAgua DATOS = new _2_RevolverDeAgua();   // OBJETO GLOBAL (_2_RevolverDeAgua)
    Scanner teclado = new Scanner(System.in);
    int CANT = 0;

    _2_Jugador DATOSJugador = new _2_Jugador();      // OBJETO GLOBAL SE AÑADEN LOS ATRIBUTOS A LA CLASE (_2_JUGADOR)

// METODO1
    public void datos() {

        _2_Juego DatosList = new _2_Juego();
        _2_RuletaServicio datos = new _2_RuletaServicio();    // OBJETO
        

        System.out.println("CANTIDAD DE JUGADORES");
        CANT = teclado.nextInt();

        String vector[] = new String[CANT + 1];

// BUCLE        
        for (int i = 1; i <= CANT; i++) {
            boolean RES = datos.mojar();
            System.out.println("JUGADOR: " + i);
            String nombre = teclado.next();
            vector[i] = nombre;
            int id = i + 1;
            boolean mojado = false;
            
            if(mojado == RES){
                mojado = true;
            }
            else{
                datos.siguienteChorro();
                System.out.println();
            }
            
            _2_Jugador e = new _2_Jugador(id, nombre, mojado);

            
         

            LISTA.add(e);

        }
        
        

      
        
        for (_2_Jugador jugador : LISTA) {
            System.out.println("LISTA");
            System.out.println(jugador);
        }

    }

        //    List<_2_Jugador> list = DatosList.getJugadores();
        //     for (_2_Jugador jugador : list) {      // ERROR
    

    public void mostrar() {

        System.out.println("LISTA");
        for (_2_Jugador jugador : LISTA) {
            System.out.println(jugador);
        }
    }

//CLASE JUEGO
//METODO 1
    public void llenarJugadores(ArrayList<_2_Jugador> jugadores, _2_RevolverDeAgua r) {

    }

// METODO 1
    public _2_RevolverDeAgua llenarRevolver() {

        // OBJETO 
        int aleatorio = (int) Math.floor(Math.random() * 7);
        DATOS.setPosicionActual(aleatorio);                // SET
        System.out.println("NUM " + aleatorio);

        System.out.println(DATOS.getPosicionActual());

        int aleatorio2 = (int) Math.floor(Math.random() * 7);
        DATOS.setPosicionAgua(aleatorio2);                // SET
        System.out.println("NUM2 " + aleatorio2);

        return DATOS;

    }

// METODO 2    
    public boolean mojar() {

        int var = DATOS.getPosicionActual();
        int var2 = DATOS.getPosicionAgua();

        boolean band = false;
        if (var == var2) {
            band = true;
        }
      //  System.out.println("num1: " + var);
      //  System.out.println("num2: " + var2);

        return band;
    }

    public void siguienteChorro() {

        int var = DATOS.getPosicionActual();

        int resp = 0;
        if (var < 6) {
            System.out.println("suma");
            resp = var + 1;

        } else if (var == 6) {
            System.out.println("resta");
            resp = 0;
        }
        DATOS.setPosicionActual(resp);
        System.out.println("nueva pisicion actual " + resp);
    }

    public void disparo() {

        _2_RuletaServicio datos = new _2_RuletaServicio();    // OBJETO

        for (_2_Jugador jugador : LISTA) {

            // LLAMADO A LOS METODOS  (CLASE _2_RevolverDeAgua)
            boolean band = datos.mojar();
            if (band == true) {
                
                System.out.println("true");

                mojar();
                DATOSJugador.setMojado(band);
            } else {
                System.out.println("false");
                siguienteChorro();
            }
        }
        
        for (_2_Jugador jugador : LISTA) {
            System.out.println("LISTA");
            System.out.println(jugador);
        }

    }
    
    

}
