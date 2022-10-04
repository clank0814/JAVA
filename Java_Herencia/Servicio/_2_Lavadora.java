/*
 
SUBCLASE LAVADORA   -----> CLASE PADRE ELECTRODOMESTICO

 */
package Servicio;

import Entidad._2_Electrodomestico;
import java.util.Scanner;

/**
 *
 * @author Mario
 */
public class _2_Lavadora extends _2_Electrodomestico{
    
    protected int carga;

    public _2_Lavadora() {
    }

    public _2_Lavadora(int carga, double precio, String color, char letra, double peso) {
        super(precio, color, letra, peso);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

   
    
    
    Scanner teclado = new Scanner(System.in);
    
    
    public void crearLavadora(){
        System.out.println("LAVADORA");
        super.crearElectrodomestico();
        
        System.out.println("CAPACIDAD DE CARGA 10KG / 50KG");
        
        this.carga = teclado.nextInt();
        
     //   precioFinal();
       
        
        
    }

    @Override
    public void precioFinal() {
      
        super.precioFinal();     // LLAMADO AL METODO PADRE
        if(this.carga > 30){
            this.precio += 500;
        }
        System.out.println("LAVADORA");
        System.out.println("PRECIO FINAL: " + this.precio);
    }

    
    
}
