/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Main;

import Entidad.equipo;
import Entidad.jugador;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Mario
 */
public class lista {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        
        Scanner teclado = new Scanner(System.in);
        ArrayList<jugador> LISTA = new ArrayList();
        equipo RES = new equipo();
        boolean band = true;
        
// BUCLE
        while (band) {
        
        jugador DATOS = new jugador();     // SE CREA EL OBJETO DENTRO DEL BUCLE PARA QUE NO SE REEMPLECEN LOS OBJETOS
                                           // SI SE COLOCA COMO GLOBAL EL ULTIMO OBJETO CREADO ES EL UNICO QUE SE GUARDA
        
        System.out.println("COLOQUE LOS DATOS");
        System.out.println("NOMBRE");
        String nombre = teclado.next();
        System.out.println("APELLIDO");
        String apellido = teclado.next();
        System.out.println("POSICION");
        String posicion = teclado.next();
        System.out.println("NUM");
        int num = teclado.nextInt();

        DATOS.setNombre(nombre);
        DATOS.setApellido(apellido);
        DATOS.setPosicion(posicion);
        DATOS.setNum(num);

        LISTA.add(DATOS);

        RES.setJugadores(LISTA);
        
        
            System.out.println("OTRO JUGADOR S/N");
            String res = teclado.next();
            if (res.equals("N")) {
                band = false;
                System.out.println(RES);
            }
        }
    }

}
