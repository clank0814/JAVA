/* 
Realizar una clase llamada Matemática que tenga como atributos dos números reales con
los cuales se realizarán diferentes operaciones matemáticas. La clase deber tener un
constructor vacío, parametrizado y get y set. En el main se creará el objeto y se usará el
Math.random para generar los dos números y se guardaran en el objeto con su
respectivos set. Deberá además implementar los siguientes métodos:
a) Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor
b) Método calcularPotencia() para calcular la potencia del mayor valor de la clase elevado
al menor número. Previamente se deben redondear ambos valores.
c) Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
*/

package Servicio;

import Entidad._09_Matematicas;

public class _09_MatematicasService
{
    public void devolverMayor(_09_Matematicas DATOS) {
        int num1 = DATOS.getNum1();
        int num2 = DATOS.getNum2();
        int mayor = Math.max(num1, num2);
        System.out.println("MAYOR");
        System.out.println(mayor);
        
    }
    
    public void calcularPotencia(_09_Matematicas DATOS) {
        double num1 = DATOS.getNum1();
        double num2 = DATOS.getNum2();
        int mayor = (int)Math.max(num1, num2);
        int menor = (int)Math.min(num1, num2);
        int elevado = (int)Math.pow(num1, num2);
        System.out.println("POTENCIA MAYOR ^ MENOR");
        System.out.println(elevado);
    }
    
    public void calculaRaiz(_09_Matematicas DATOS) {
        double num1 = DATOS.getNum1();
        double num2 = DATOS.getNum2();
        double menor = Math.min(num1, num2);
        double raiz = Math.sqrt(menor);
        System.out.println("RAIZ DEL MENOR");
        System.out.println((int)menor + raiz);
    }
}
