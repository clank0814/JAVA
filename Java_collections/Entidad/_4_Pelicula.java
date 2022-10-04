/*
 Un cine necesita implementar un sistema en el que se puedan cargar peliculas. Para esto,
tendremos una clase Pelicula con el título, director y duración de la película (en horas).
Implemente las clases y métodos necesarios para esta situación, teniendo en cuenta lo
que se pide a continuación:
En el servicio deberemos tener un bucle que crea un objeto Pelicula pidiéndole al usuario
todos sus datos y guardándolos en el objeto Pelicula.
Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si quiere
crear otra Pelicula o no.
Después de ese bucle realizaremos las siguientes acciones:

• Mostrar en pantalla todas las películas.
• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en
pantalla.
• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en
pantalla.
• Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
 */
package Entidad;

/**
 *
 * @author Mario
 */
public class _4_Pelicula implements Comparable<_4_Pelicula> {

    public String titulo;
    public String director;
    public int hora;
    public int minutos;
    public int cont;

    public _4_Pelicula(String titulo, String director, int hora, int minutos, int cont) {
        this.titulo = titulo;
        this.director = director;
        this.hora = hora;
        this.minutos = minutos;
        this.cont = cont;
    }

    public _4_Pelicula() {
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public void setCont(int cont) {
        this.cont = cont;
    }

    @Override
    public String toString() {
        return "[" + cont + "]  TITULO = " + titulo + "       DIRECTOR = " + director + "        DURACION = " + hora + ":" + minutos + "";
    }

    
    // COMPARATOR (RETORNA EL VALOR CON EL QUE SE ORDENA LA NUEVA LISTA)
/*
    SI LA HORA (input) ES MAYOR O IGUAL A LA ACTUAL 
    Y
    SI EL MINUTO (input) ES MAYOR AL ACTUAL
    (RETORNA -1) -----> PARA QUE COLLECTIONS.sort PUEDA CONTAR Y ORDENAR SEGUN EL RETURN
    
    Y LO CONTRARIO CON EL OTRO "IF" (RETORNA 1)
    
    SI NINGUNA SE CUMPLE (RETORNA 0)    
    
    NO SE COMO FUNCIONO 
    (COMPARA EL ACTUAL CON EL NUEVO)
    IF 1 = SI ENTRADA ES MAYOR O IGUAL, O IGUAL A (0)
    IF 2 = SI ENTRADA ES MENOR O IGUAL
     */
    @Override
    public int compareTo(_4_Pelicula a) {
        if (this.hora <= a.getHora() && this.minutos <= a.getMinutos() || 0 == getHora()) {

            return -1;

        } else {
            if (this.hora >= a.getHora() && this.minutos >= a.getMinutos()) {

                return 1;
            } else {
                return 0;
            }
        }

    }
}
