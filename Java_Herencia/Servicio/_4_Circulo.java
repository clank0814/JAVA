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
public class _4_Circulo implements _4_calculosFormas{
    private double perimetro;
    private double area;

    public _4_Circulo() {
    }
    
    public _4_Circulo(double perimetro, double area) {
        this.perimetro = perimetro;
        this.area = area;
    }
    
    Scanner teclado = new Scanner(System.in);

    @Override
    public void calcular() {
        System.out.println("TAMAÑO DEL CIRCULO");
        System.out.println("DIAMETRO:");
        double diametro = teclado.nextInt();
        
        this.area = 3.14 * Math.pow(diametro/2, 2);  // PI * RADIO ^ 2 
        this.perimetro = 3.14 * diametro;
        
        System.out.println("AREA: " + this.area);
        System.out.println("PERIMETRO: " + this.perimetro );
    }
    
    
    
}
