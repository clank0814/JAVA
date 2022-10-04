/*
 Crear una clase llamada Alumno que mantenga información sobre las notas de distintos
alumnos. La clase Alumno tendrá como atributos, su nombre y una lista de tipo Integer
con sus 3 notas.
En el servicio de Alumno deberemos tener un bucle que crea un objeto Alumno. Se pide
toda la información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
pregunta al usuario si quiere crear otro Alumno o no.
Después de ese bucle tendremos el siguiente método en el servicio de Alumno:
Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota
final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método. Dentro
del método se usará la lista notas para calcular el promedio final de alumno. Siendo este
promedio final, devuelto por el método y mostrado en el main.
 */
package Service;

import Entidad._3_Alumno;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Mario
 */
public class _3_AlumnoService {
    
// SE CREA EL ARRAY DE TIPO OBJETO "Alumno" (PARA GUARDAR OBJETOS EN LA LISTA)
    public ArrayList<_3_Alumno> AlumnosList;

    Scanner teclado = new Scanner(System.in);

// CONSTRUCTOR PARA GUARDAR CADA ELEMENTO "OBJETO CREADO" EN LA LISTA    
    public _3_AlumnoService() {
        this.AlumnosList = new ArrayList();
    }

// METODO DATOS   
    public _3_Alumno Datos() {

        int i = 1;
        boolean res = true;
// BUCLE
        while (res) {

            int j = 1;
// DATOS
            System.out.println("ALUMNO " + i++);
            System.out.println("NOMBRE");
            String nomb = teclado.next();

            System.out.println("NOTA " + j++);
            int nota1 = teclado.nextInt();

            System.out.println("NOTA " + j++);
            int nota2 = teclado.nextInt();

            System.out.println("NOTA " + j++);
            int nota3 = teclado.nextInt();

            int cont = i - 1;  // VARIABLE PARA CONTAR CUANTOS ALUMNOS HAY EN LA LISTA (SE MUESTRA AL FINAL)

// SE INSTANCIA UN OBJETO CON TODOS LOS ATRIBUTOS DE LOS DATOS             
            _3_Alumno Ingresante = new _3_Alumno(nomb, nota1, nota2, nota3, cont);

// EL OBJETO CON LOS ATRIBUTOS SE GUARDA EN LA LISTA            
            AlumnosList.add(Ingresante);

            System.out.println("");
            System.out.println("COLOCAR MAS ALUMNOS? S/N");
            String RES = teclado.next();
            
// CONDICIONAL (SI RES = N EL BUCLE FINALIZA)           
            if (RES.equals("N") || RES.equals("n")) {
                res = false;

            }

            System.out.println("----------------------------");

        }
        return null;   // NO ERA NECESARIO EL RETURN PERO BUE

    }

// METODO MOSTRAR    
    public void Mostrar() {

        System.out.println("");
        System.out.println("LISTA");
        
// BUCLE RECORRE CADA ELEMENTO EN LA LISTA Y LE COLOCA UNA VARIABLE        
        for (_3_Alumno aux : AlumnosList) {
            System.out.println(aux);       // LOS ELEMENTOS EL LA LISTA SE MUESTRAN CON LA VARIBLE
        }
    }

// METODO NOTA FINAL - PROMEDIO
    public void NotaFinal() {

        boolean val = true;

        System.out.println("");
        System.out.println("BUSCAR ALUMNO");
        System.out.println("COLOQUE EL NOMBRE");
        String buscar = teclado.next();
        
// BUCLE RECORRE CADA ELEMENTO EN LA LISTA Y LE COLOCA UNA VARIABLE
        for (_3_Alumno BuscarAlumno : AlumnosList){
            
// SI EL "ATRIBUTO" DEL "ELEMENTO" DE LA "LISTA" = AL NOMBRE QUE BUSCO (SE MUESTRA EL PROMEDIO) Y FINALIZA LA BUSQUEDA CON "BREAK"            
            if (BuscarAlumno.getNombre().equalsIgnoreCase(buscar)) {
                int not1 = BuscarAlumno.getNotas1();
                int not2 = BuscarAlumno.getNotas2();
                int not3 = BuscarAlumno.getNotas3();
                int total = (not1 + not2 + not3) / 3;

                System.out.println("PROMEDIO: " + total);
                val = true;
                break;
              
// SI NO VAL = FALSE PARA QUE NO SE REPITA Y SE USE EN OTRO (IF)
            } else {
                val = false;
            }
        }

        if (val = false) {
            System.out.println("SIN RESULTADOS");
        }
    }

}
