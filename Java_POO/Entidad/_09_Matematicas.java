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

package Entidad;

public class _09_Matematicas
{
    public int num1;
    public int num2;
    
    public _09_Matematicas() {
        this.num1 = 2;
        this.num2 = 5;
    }
    
    public _09_Matematicas(int num1, int num2) {
        this.num1 = 2;
        this.num2 = 5;
        this.num1 = num1;
        this.num2 = num2;
    }
    
    public int getNum1() {
        return this.num1;
    }
    
    public void setNum1(int num1) {
        this.num1 = num1;
    }
    
    public int getNum2() {
        return this.num2;
    }
    
    public void setNum2(int num2) {
        this.num2 = num2;
    }
}
