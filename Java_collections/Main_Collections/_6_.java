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
package Main_Collections;

import Service._6_TiendaService;
/**
 *
 * @author Mario
 */
public class _6_ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        _6_TiendaService RESPUESTA = new _6_TiendaService();
        
        RESPUESTA.Datos();
    }
}   
    
