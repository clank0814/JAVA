/*

MAIN

EN ESTE CASO SERVICIO TIENE LAS CLASES QUE HEREDAN

 Tenemos una clase padre Animal junto con sus 3 clases hijas Perro, Gato, Caballo.
La clase Animal tendrá como atributos el nombre, alimento, edad y raza del Animal.
Crear un método en la clase Animal a través del cual cada clase hija deberá mostrar luego un
mensaje por pantalla informando de que se alimenta. Generar una clase Main que realice lo
siguiente:
 */
package Main;

import Entidad._1_Animal;
import Servicio._1_Gato;
import Servicio._1_Perro;
import Servicio._1_Pez;

/**
 *
 * @author Mario
 */
public class _1_Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

// OBJETO        
        _1_Animal a = new _1_Perro("chiquito", "carnivoro", 1, "chiquito");
        System.out.println("perro");
        a.alimentarse();
// OBJETO        
        _1_Animal b = new _1_Gato("gigante", "galletas", 2, "mediano");
        System.out.println("gato");
        b.alimentarse();
// OBJETO        
        _1_Animal c = new _1_Pez("nadador", "hervivoro", 1, "rapido");
        System.out.println("pez");
        c.alimentarse();

    }

}
