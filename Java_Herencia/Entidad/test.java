/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author Mario
 */
public class test {
    protected double precio;
    protected String color;
    protected char letra;
    protected double peso;

    public test() {
    }

    public test(double precio, String color, char letra, double peso) {
        this.precio = precio;
        this.color = color;
        this.letra = letra;
        this.peso = peso;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void comprobarConsumoEnergetico(char caracter) {

       caracter = Character.toUpperCase(letra);
       
       if(caracter < 65 || caracter > 70){   // CODIGO ASCII
           
           this.letra = caracter;
           
       }
       else {
           this.letra = Character.toUpperCase(caracter);
       }

    }

    //blanco, negro, rojo, azul y gris
    public void comprobarColor(String color) {

        if (!color.equalsIgnoreCase("blanco") && !color.equalsIgnoreCase("negro") && !color.equalsIgnoreCase("rojo") && !color.equalsIgnoreCase("azul") && !color.equalsIgnoreCase("gris") ){
            System.out.println("COLOR BLANCO");
                this.color = "BLANCO";
        }
                
        else{
            this.color = color;
        }
        
    }

    Scanner teclado = new Scanner(System.in);

    public void crearElectrodomestico() {
        
        this.precio = 1000.00;

       
        System.out.println("ELIJA SU ELECTRODOMESTICO");
        System.out.println("NIVEL DE CONSUMO A - B - C - D - E - F ");
        this.letra = teclado.next().charAt(0);   // TOMA EL PRIMER CARACTER DE (Scanner.next)

        System.out.println("COLOR");
        System.out.println("BLANCO - NEGRO - ROJO - AZUL - GRIS");
        this.color = teclado.next();

        System.out.println("PESO");
        System.out.println("1kg / 100kg");
        this.peso = teclado.nextDouble();

// AÑADIR LOS PARAMETROS A LOS METODOS              
        comprobarConsumoEnergetico(this.letra);
        comprobarColor(this.color);
      

    }

    public void precioFinal() {   // RECIBE COMO PARAMETRO ↑

        

        switch (this.letra) {
            case 'A':
                this.precio += 1000;
                break;
            case 'B':
                this.precio += 800;
                break;
            case 'C':
                this.precio += 600;
                break;
            case 'D':
                this.precio += 500;
                break;
            case 'E':
                this.precio += 300;
                break;
            case 'F':
                this.precio += 100;
        }
        
        int total = (int) peso;     // LA VARIABLE PESO (double) A TOTAL (int)

                if (this.peso >= 80) {
                    this.precio += 1000;
                } else if (this.peso >= 50 && this.peso < 80) {
                    this.precio += 800;
                } else if (this.peso >= 20 && this.peso < 50) {
                    this.precio += 500;
                } else if (this.peso >= 1 && this.peso < 20) {
                    this.precio += 100;
                }
                
                System.out.println("PRECIO : "+ this.precio);
                
                

    }
}
