/*
OPERADOR LOGICO Y 
CONDICION ANIDADA 

*/
package java_code;

/**
 *
 * @author Mario
 */
import java.util.Scanner;
public class Condicion_operadores_logicos_relacionales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner (System.in);
        String nombre = ""   ;
        int num = 0 , clave = 0;
        
        System.out.println("SISTEMA DE INGRESO DE DATOS");
        System.out.println("¿CUAL ES SU NOMBRE?");
        nombre = teclado.nextLine();
        
        System.out.println("¿AÑOS EN LA EMPRESA?" );
        num = teclado.nextInt();
        
        System.out.println("CLAVE DEL PUESTO");
        clave = teclado.nextInt();
        
        if (clave == 1 ){
            if (num == 1){
                System.out.println(nombre + " , Tiene 6 dias de vacaciones");
            }
            else if (num >= 2 && num <= 6){
                System.out.println(nombre + " , Tiene 14 dias de vacaniones");
            }
            else if (num == 7){
                System.out.println(nombre + " , Tiene 20 dias de vacaniones");
            }
            else {
                System.out.println("No tiene vacaciones");
            }
         }
        else if (clave == 2 ){
            if (num == 1){
                System.out.println(nombre + " , Tiene 7 dias de vacaciones");
            }
            else if (num >= 2 && num <= 6){
                System.out.println(nombre + " , Tiene 15 dias de vacaniones");
            }
            else if (num == 7){
                System.out.println(nombre + " , Tiene 22 dias de vacaniones");
            }
            else {
                System.out.println("No tiene vacaciones");
            }
         }
        else if (clave == 3){
            if (num == 1){
                System.out.println(nombre + " , Tiene 10 dias de vacaciones");
            }
            else if (num >= 2 && num <= 6){
                System.out.println(nombre + " , Tiene 20 dias de vacaniones");
            }
            else if (num == 7){
                System.out.println(nombre + " , Tiene 30 dias de vacaniones");
            }
            else {
                System.out.println("No tiene vacaciones");
            }
         } 
  }   
}

/*
CREAR un sistema que determine los dias de vacaciones segun los datos

El sistema debe solicitar el "NOMBRE", "CLAVE DEL DEPARTAMENTO" y "ANTIGUEDAD"
Luego mostrar un mensaje con "EL NOMBRE DEL TRABAJADOR Y LOS DIAS DE VACACIONES"

Existen tres departamentos dentro de la empresa con sus respectivas claves:
   1. Departamento de Atención al cliente.(Clave1)
   2. Departamento de Logística.(Clave2)
   3. Gerencia.(Clave3)

Trabajadores con clave 1(Atención al cliente):
   Con 1 año de servicio,reciben 6 días de vacaciones.
   Con 2 a 6 años de servicio,reciben 14 días de vacaciones.
   Apartir de 7 años de servicio,reciben 20 días de vacaciones.

Trabajadores con clave 2(Logística):
   Con 1 año de servicio, reciben 7 días de vacaciones.
   Con 2 a 6 años de servicio, reciben 15 días de vacaciones.
   Apartir de 7 años de servicio, reciben 22 días de vacaciones.

Trabajadores con clave 3(Gerencia):
   Con 1 año de servicio, reciben 10 días de vacaciones.
   Con 2 a 6 ños de servicio,reciben 20 días de vacaciones.
   Apartir de 7 años de servicio,reciben 30 días de vacaciones.
*/