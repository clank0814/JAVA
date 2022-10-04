/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/**
 *
 * @author Mario
 */
public class prof {
    public String nombre;
    public int edad;
    public int ID;

    public prof() {
    }

    public prof(String nombre, int edad, int ID) {
        this.nombre = nombre;
        this.edad = edad;
        this.ID = ID;
    }

    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    @Override
    public String toString() {
        return "prof{" + "nombre=" + nombre + ", edad=" + edad + ", ID=" + ID + '}';
    }
    
    
}
