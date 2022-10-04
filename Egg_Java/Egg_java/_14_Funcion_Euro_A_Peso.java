/*
Crea una aplicación que a través de una función nos convierta una cantidad de euros
introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La
función tendrá como parámetros, la cantidad de euros y la moneda a converir que será
una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio
(void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €
 */
package Egg_Java;

/**
 *
 * @author Mario
 */
import java.util.Scanner;

public class _14_Funcion_Euro_A_Peso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        // TECLADO
        Scanner teclado = new Scanner(System.in);

        System.out.println("CAMBIO DE EURO");

        System.out.println("ELIJA LA MONEDA A CAMBIAR:\n "
                + "-LIBRAS\n "
                + "-DOLAR\n "
                + "-YENES\n ");
        String moneda = teclado.nextLine();

        System.out.println("CANTIDAD:");
        int euro = teclado.nextInt();

        // LLAMADO A LA FUNCION (void)
        funcion(euro, moneda);

    }

    // INICIO DE LA FUNCION (void)
    public static void funcion(int euro, String moneda) {

        String moneda2 = moneda.toLowerCase();     // CAMBIO DE MAYUSCULA A MIN 
        System.out.println("------------------------");

        switch (moneda2) {
            case "libras":
                double libras = euro * 0.86;
                System.out.println("EURO    LIBRAS");
                System.out.println(euro + " = " + libras);
                break;

            case "dolar":
                double dolar = euro * 1.28611;
                System.out.println("EURO    DOLAR");
                System.out.println(euro + " = " + dolar);
                break;

            case "yenes":
                double yenes = euro * 129.852;
                System.out.println("EURO    YENES");
                System.out.println(euro + " = " + yenes);
                break;
        }

    }
}
