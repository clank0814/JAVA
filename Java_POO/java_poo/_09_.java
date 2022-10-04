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

package java_poo;

import Servicio._09_MatematicasService;
import Entidad._09_Matematicas;

public class _09_
{
    public static void main( String[] args) {
         _09_Matematicas DATOS = new _09_Matematicas();
        int num1 = (int)(Math.random() * 100.0);
        int num2 = (int)(Math.random() * 100.0);
        System.out.println("NUMEROS ALEATORIOS:");
        System.out.println( num1 + " " + num2);
        DATOS.setNum1(num1);
        DATOS.setNum2(num2);
        _09_MatematicasService RESPUESTA = new _09_MatematicasService();
        RESPUESTA.devolverMayor(DATOS);
        RESPUESTA.calcularPotencia(DATOS);
        RESPUESTA.calculaRaiz(DATOS);
    }
}
