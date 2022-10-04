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
package Entidad;

/**
 *
 * @author Mario
 */
public class _3_Alumno {

    public String nombre;
    public Integer notas1;
    public Integer notas2;
    public Integer notas3;
    public int cont;

    public _3_Alumno(String nombre, Integer notas1, Integer notas2, Integer notas3, int cont) {
        this.nombre = nombre;
        this.notas1 = notas1;
        this.notas2 = notas2;
        this.notas3 = notas3;
        this.cont = cont;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getNotas1() {
        return notas1;
    }

    public void setNotas1(Integer notas1) {
        this.notas1 = notas1;
    }

    public Integer getNotas2() {
        return notas2;
    }

    public void setNotas2(Integer notas2) {
        this.notas2 = notas2;
    }

    public Integer getNotas3() {
        return notas3;
    }

    public void setNotas3(Integer notas3) {
        this.notas3 = notas3;
    }

    public void setCont(int cont) {
        this.cont = cont;
    }

    
    @Override
    public String toString() {
        return "[" + cont +"]" + " nombre = " + nombre + ", nota 1 = " + notas1 + ", nota 2 = " + notas2 + ", nota 3 = " + notas3 + "";
        
    }

}
