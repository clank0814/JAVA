/*
 Se necesita una aplicación para una tienda en la cual queremos almacenar los distintos
productos que venderemos y el precio que tendrán. Además, se necesita que la
aplicación cuente con las funciones básicas.
Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio,
eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio.
Realizar un menú para lograr todas las acciones previamente mencionadas.

NO SE USO ENTIDAD
 */
package Service;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Mario
 */
public class _6_TiendaService {

    Scanner teclado = new Scanner(System.in);

    public void Datos() {

       
        Map<String, Double> Lista = new HashMap<String, Double>();

        Lista.put("ServilletaX1", 140.00);
        Lista.put("ServilletaX3", 350.00);
        Lista.put("Cerveza", 200.00);
        Lista.put("Fernet", 1200.00);
        Lista.put("Arroz", 210.00);
        Lista.put("Manteca", 150.00);
        Lista.put("Galletitas", 120.00);
        Lista.put("GalletitasX3", 350.00);
        Lista.put("Milanesa", 300.00);
        Lista.put("Pizza", 310.00);

        for (Map.Entry<String, Double> entry : Lista.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());

        }

        boolean salir = false;
        while (!salir) {

            System.out.println("MENU");
            System.out.println("1 COLOCAR UN ELEMNTO\n2 CAMBIAR PRECIO \n3 ELIMINAR UN PRODUCTO \n4 PRECIOS DE LOS PRODUCTOS \n5 SALIR");

            int resp = teclado.nextInt();

            switch (resp) {
                case 1:
                    System.out.println("PRODUCTO:");
                    String producto = teclado.next();

                    System.out.println("VALOR");
                    double valor = teclado.nextDouble();

                    Lista.put(producto, valor);
                    
                    System.out.println("-----------------------------");

                    break;

                case 2:

                    System.out.println("ELIJA UN PRODUCTO");
                    String PROD = teclado.next();

                    double var = 1;
                    double buscar = Lista.getOrDefault(PROD, var);
                    if (buscar != var) {
                        System.out.println(buscar);
                        System.out.println("NUEVO PRECIO");
                        double VALOR = teclado.nextDouble();
                        Lista.replace(PROD, VALOR);
                    } else {
                        System.out.println("PRODUCTO NO ENCONTRADO");
                    }
                    System.out.println("-----------------------------");
                    break;

                case 3:
                    // NO SE ENCONTRO EL ERROR PARA COMPARAR EL STRING (KEY) 

                    System.out.println("ELIJA UN PRODUCTO");
                    String ELIMINAR = teclado.next();

                    //    boolean band = false;
                    //  for (Map.Entry<String, Double> entry : Lista.entrySet()) {
                    //    if (entry.equals(ELIMINAR )) {
                   
                    Lista.remove(ELIMINAR);
                    
                    System.out.println("PRODUCTO ELIMINADO");
                    System.out.println("SI LO ESCIBISTE CORRECTAMENTE");

                    //     } else {
                    //       band = true;
                    //    }
                    //  }
                    //    if (band) {
                    //        System.out.println("PRODUCTO NO ENCONTRADO");
                    //     }
                    System.out.println("-----------------------------");
                    break;

                case 4:
                    
                    System.out.println("LISTA DE PRODUCTOS");
                    for (Map.Entry<String, Double> entry : Lista.entrySet()) {
                        System.out.println(entry.getKey() + " = " + entry.getValue());
                        
                        System.out.println("-----------------------------");
                    }

                    break;
                case 5:
                    salir = true;
                    break;
                default:
                    throw new AssertionError();
            }

        }

        System.out.println("VUELVAS PRONTOS");
    }
}
