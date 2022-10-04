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
package Service;

/**
 *
 * @author Mario
 */
import Entidad._4_Pelicula;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class _4_PeliculaService {

    public ArrayList<_4_Pelicula> ListPeliculas;

    public _4_PeliculaService() {
        this.ListPeliculas = new ArrayList<>();
    }

    Scanner teclado = new Scanner(System.in);

    int cont = 1;
    public _4_Pelicula Datos() {

        boolean val = true;
        while (val) {

            System.out.println("DATOS DE LA PELICULA " + cont++);
            System.out.println("TITULO");
            String titulo = teclado.next();

            System.out.println("DIRECTOR");
            String director = teclado.next();

            System.out.println("HORAS");
            int hora = teclado.nextInt();
            System.out.println("MINUTOS");
            int minutos = teclado.nextInt();

            System.out.println("DURACION \n " + hora + " : " + minutos);

            _4_Pelicula DatosPelicula = new _4_Pelicula(titulo, director, hora, minutos, cont);

            ListPeliculas.add(DatosPelicula);

            System.out.println("OTRA PELICULA? S/N");
            String resp = teclado.next();

            if (resp.equals("N") || resp.equals("n")) {
                val = false;

            }
            System.out.println("---------------------------");
        }
        return null;
    }

    public void mostrar() {
        System.out.println("LISTA");
        for (_4_Pelicula aux : ListPeliculas) {

            System.out.println(aux);

        }
    }

    public void Duracion1H() {
        System.out.println("PELICULAS DE 1H O MENOS");
        for (_4_Pelicula Pelicula1H : ListPeliculas) {
            if (Pelicula1H.getHora() <= 1) {
                System.out.println(Pelicula1H);
            }
        }
    }
 
// ERROR NO ENCONTRADO
    // PRIMERO LA LISTA TIENE QUE ORDENARSE CON Mayor()  (NO SE LLAMA EN MAIN)
    // PARA PODER LEER Y ORDENAR Menor() CORRECTAMENTE
    public void Mayor() {
        System.out.println("LISTA DURACION MAYOR A MENOR");
        Collections.sort(ListPeliculas, Collections.reverseOrder());
        for (_4_Pelicula ListOrdenada2 : ListPeliculas) {
            System.out.println(ListOrdenada2);
        }

    }

    
    public void Menor() {
        System.out.println("LISTA DURACION MENOR A MAYOR");
        Collections.sort(ListPeliculas);
        for (_4_Pelicula ListOrdenada2 : ListPeliculas) {
            System.out.println(ListOrdenada2);
        }
        
        System.out.println("LISTA DURACION MAYOR A MENOR");
        Collections.reverse(ListPeliculas);
        for (_4_Pelicula ListPelicula3 : ListPeliculas) {
            System.out.println(ListPelicula3);
        }

    }

    
    public void OrdenTitulo() {
        System.out.println("LISTA TITULO ALFABETICAMENTE");
        Collections.sort(ListPeliculas, (_4_Pelicula P1, _4_Pelicula P2) -> P1.getTitulo().compareTo(P2.getTitulo()));
        for (_4_Pelicula OrdenTitulo : ListPeliculas) {
            System.out.println(OrdenTitulo);
        }

    }

    public void OrdenDirector() {
        System.out.println("LISTA DIRECTOR ALFABETICAMENTE");
        Collections.sort(ListPeliculas, (_4_Pelicula D1, _4_Pelicula D2) -> D1.getDirector().compareTo(D2.getDirector()));
        for (_4_Pelicula OrdenDirector : ListPeliculas) {
            System.out.println(OrdenDirector);
        }
    }
}
