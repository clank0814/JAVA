/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Main;

import Entidad.Animal;
import Entidad.gato;
import Entidad.perro;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Mario
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        List <Animal> lista = new ArrayList<>();
        
        Animal a = new Animal();
        Animal b = new perro();
        Animal c = new gato();
        
       
        lista.add(a);
        lista.add(b);
        lista.add(c);
        
        
        
        for (Animal aux : lista) {
            
            aux.hacerRuido();
        }
          
    }
    
}
