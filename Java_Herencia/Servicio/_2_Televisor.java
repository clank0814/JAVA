/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad._2_Electrodomestico;
import java.util.Scanner;

/**
 *
 * @author Mario
 */
public class _2_Televisor extends _2_Electrodomestico {

    protected int resolución;
    protected boolean sintonizadorTDT = false;

    public _2_Televisor() {
    }

    public _2_Televisor(int resolución, boolean sintonizadorTDT, double precio, String color, char letra, double peso) {
        super(precio, color, letra, peso);
        this.resolución = resolución;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public int getResolución() {
        return resolución;
    }

    public void setResolución(int resolución) {
        this.resolución = resolución;
    }

    public boolean isSintonizadorTDT() {
        return sintonizadorTDT;
    }

    public void setSintonizadorTDT(boolean sintonizadorTDT) {
        this.sintonizadorTDT = sintonizadorTDT;
    }

    Scanner teclado = new Scanner(System.in);

    public void crearTelevisor() {
        System.out.println("TELEVISOR"+
                           "\n");
        
        super.crearElectrodomestico();
        System.out.println("TAMAÑO DE RESOLUCION (PULGADAS)");
        this.resolución = teclado.nextInt();
        System.out.println("CON SITONIZADOR TDT S/N");
        if (teclado.next().equalsIgnoreCase("S")) {
            this.sintonizadorTDT = true;
        }
    //    precioFinal();
    }

    @Override
    public void precioFinal() {
        super.precioFinal();
        
        if(this.resolución > 40){
            int porcentaje = (int) (this.precio * 30 / 100);
            this.precio += porcentaje;
            
        }
        
        if(this.sintonizadorTDT = true){
            this.precio += 500;
        }
        System.out.println("TELEVISOR");
        System.out.println("PRECIO FINAL: " + this.precio);
        
    }

    
    
}
