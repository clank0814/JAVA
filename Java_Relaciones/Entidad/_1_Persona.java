/*
 Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de dos
clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase Persona con
atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que
pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde
la clase Persona, la información del Perro y de la Persona.
 */
package Entidad;

/**
 *
 * @author Mario
 */
public class _1_Persona {
    private String nombre;
    private String apellido;
    private int edad;
    private int ID;
    private _1_Perro mascota;

    public _1_Persona() {
    }

    public _1_Persona(String nombre, String apellido, int edad, int ID, _1_Perro mascota) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.ID = ID;
        this.mascota = mascota;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public _1_Perro getMascota() {
        return mascota;
    }

    public void setMascota(_1_Perro mascota) {
        this.mascota = mascota;
    }

    @Override
    public String toString() {
        return "NOMBRE = " + nombre + ", APELLIDO = " + apellido + ", EDAD = " + edad + ", ID = " + ID + " " +
                "\n MASCOTA: " +
                "\n " + mascota;
    }
    
    
}
