/*
 Se plantea desarrollar un programa que nos permita calcular el área y el perímetro de formas
geométricas, en este caso un círculo y un rectángulo. Ya que este cálculo se va a repetir en las
dos formas geométricas, vamos a crear una Interfaz, llamada  que tendrá, los
dos métodos para calcular el área, el perímetro y el valor de PI como constante.
Desarrollar el ejercicio para que las formas implementen los métodos de la interfaz y se
calcule el área y el perímetro de los dos. En el main se crearán las formas y se mostrará el
resultado final.
Área circulo: PI * radio ^ 2 / Perímetro circulo: PI * diámetro.
Área rectángulo: base * altura / Perímetro rectángulo: (base + altura) * 2.
 */
package Servicio;

import Entidad._4_calculosFormas;
import java.util.Scanner;

/**
 *
 * @author Mario
 */
public class _4_Rectangulo implements _4_calculosFormas{
    
    private int Area;
    private int Perimetro;

    public _4_Rectangulo() {
    }
    
    public _4_Rectangulo(int Area, int Perimetro) {
        this.Area = Area;
        this.Perimetro = Perimetro;
    }

    Scanner teclado = new Scanner(System.in);
            
    @Override
    public void calcular() {
        System.out.println("TAMAÑO DEL RECTANGULO");
        System.out.println("BASE");
        int base = teclado.nextInt();
        System.out.println("ALTURA:");
        int altura = teclado.nextInt();
        
        this.Area = base * altura;
        this.Perimetro = (base + altura) * 2;
        
        System.out.println("AREA: " + this.Area);
        System.out.println("PERIMETRO: " + this.Perimetro);
    }
    
   
    
    
}
