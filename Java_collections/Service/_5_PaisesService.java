/*
 Se requiere un programa que lea y guarde países, y para evitar que se ingresen repetidos
usaremos un conjunto. El programa pedirá un país en un bucle, se guardará el país en el
conjunto y después se le preguntará al usuario si quiere guardar otro país o si quiere salir,
si decide salir, se mostrará todos los países guardados en el conjunto. (Recordemos hacer
los servicios en la clase correspondiente)
Después deberemos mostrar el conjunto ordenado alfabéticamente: para esto recordar
cómo se ordena un conjunto.
Por último, al usuario se le pedirá un país y se recorrerá el conjunto con un Iterator, se
buscará el país en el conjunto y si está en el conjunto se eliminará el país que ingresó el
usuario y se mostrará el conjunto. Si el país no se encuentra en el conjunto se le informará
al usuario.

RESUMEN:

SE USA EL CONJUNTO "TreeSet" (DE LOS CONJUNTOS ES UNO QUE PERMITE COMPARAR Y ORDENAR)

METODO 1:
DATOS, SCANNER, BOOLEAN, WHILE, SWHICH (2 opciones)

METODO 2:
FOR (ITERATOR) PERO ANTES SE LA ORDENA ALFABETICAMENTE CON UN "CompareTo" -> (ENTIDAD)




 */
package Service;

/**
 *
 * @author Mario
 */
import java.util.Scanner;
import Entidad._5_Paises;
import java.util.TreeSet;

/**
 *
 * @author Mario
 */
public class _5_PaisesService {

    public TreeSet<_5_Paises> ListPaises = new TreeSet<>();

    Scanner teclado = new Scanner(System.in);

    public _5_Paises DATOS() {
        boolean val = true;
        while (val) {

            System.out.println("COLOQUE UN PAIS");
            String pais = teclado.nextLine();

            _5_Paises Lista = new _5_Paises(pais);  // SE CREA UN OBJETO PARA CADA ELEMENTO (POR QUE NO ENCONTRE COMO COMPARAR ELEMENTOS SIMPLES)
            ListPaises.add(Lista);

            boolean band = true;

            while (band) {

                System.out.println("");
                System.out.println("1 COLOCAR OTRO PAIS");
                System.out.println("2 SALIR");
                String resp = teclado.nextLine();

                switch (resp) {
                    case "1":
                        band = false;
                        break;

                    case "2":
                        val = false;
                        band = false;
                        System.out.println("--------------------------");
                        break;

                    default:
                        System.out.println("[" + "RESPUESTA INCORRECTA" + "]");
                        ;
                }
            }

        }

        return null;

    }

    public void OrdenAlfab() {

        System.out.println("LISTA ALFABETICAMENTE");
        for (_5_Paises ListAlfab : ListPaises) {
            System.out.println(ListAlfab);
        }
        System.out.println("");
    }

// METODO 3:
    public void Buscar() {
        boolean var = true;
        System.out.println("BUSCAR/ELIMINAR");
        System.out.println("COLOQUE UN PAIS");
        String buscar = teclado.next();

        for (_5_Paises Buscar : ListPaises) {       // FOR (ITERATOR)
            if (buscar.equals(Buscar.getPaises())) {    // IF (SI LO QUE BUSCO = UNOS DE LOS ELEMENTOS GUARDADOS, SE ELIMINA)
                System.out.println("DESEA ELIMINAR " + Buscar + "?");
                String resp = teclado.next();
                if (resp.equals("S") || resp.equals("s")) {
                    
                    ListPaises.remove(Buscar);    // ELIMINAR (ELMENTO) -> OBJETO -> LIST  (EN ESTE CASO SE ELIMINA EL OBJETO)

// BREAK MUY IMPORTANTE, AL "ELIMINAR", EL FOR SIGUE BUSCANDO (ASI QUE SE USA PARA DETENER EL BUCLE) SI NO LA "NUEVA LIST" NO SE PUEDE LEER                    
                    break;     
                }
            } else {
                var = false;
            }
        }
        if (var = false) {
            System.out.println("NO SE ENCONTRO RESULTADOS");
        }

    }

    public void Mostrar() {
        System.out.println("NUEVA LISTA");
        for (_5_Paises ListPaises2 : ListPaises) {
            System.out.println(ListPaises2);
        }
    }

}
