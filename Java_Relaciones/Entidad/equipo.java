/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

import java.util.List;

/**
 *
 * @author Mario
 */
public class equipo {
    
    private List<jugador> jugadores;

   

    public List<jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(List<jugador> jugadores) {
        this.jugadores = jugadores;
    }

    @Override
    public String toString() {
        return "equipo{" + "jugadores=" + jugadores + '}';
    }
    
    
}
