/*

HEREDA DE CLASE PADRE

 Tenemos una clase padre Animal junto con sus 3 clases hijas Perro, Gato, Caballo.
La clase Animal tendrá como atributos el nombre, alimento, edad y raza del Animal.
Crear un método en la clase Animal a través del cual cada clase hija deberá mostrar luego un
mensaje por pantalla informando de que se alimenta.
 */
package Servicio;

import Entidad._1_Animal;

/**
 *
 * @author Mario
 */
public class _1_Gato extends _1_Animal{
    
    public _1_Gato(String nombre, String alimento, int edad, String raza) {
        super(nombre, alimento, edad, raza);
    }
    
    @Override
    public void alimentarse() {
       
        System.out.println(alimento);
    }
    
    
}
