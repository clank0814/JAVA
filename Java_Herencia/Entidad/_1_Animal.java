/*

CLASE PADRE

 Tenemos una clase padre Animal junto con sus 3 clases hijas Perro, Gato, Caballo.
La clase Animal tendrá como atributos el nombre, alimento, edad y raza del Animal.
Crear un método en la clase Animal a través del cual cada clase hija deberá mostrar luego un
mensaje por pantalla informando de que se alimenta.
 */
package Entidad;

/**
 * 
 * @author Mario
 */
public class _1_Animal {
    
    protected String nombre;
    protected String alimento;
    protected int edad;
    protected String raza;

    public _1_Animal(String nombre, String alimento, int edad, String raza) {
        this.nombre = nombre;
        this.alimento = alimento;
        this.edad = edad;
        this.raza = raza;
    }
    
    public void alimentarse(){
        System.out.println(alimento);
    }
    
    
}
