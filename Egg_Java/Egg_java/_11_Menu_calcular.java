/*
 Realizar un programa que pida dos números enteros positivos por teclado y muestre por
pantalla el siguiente menú:

MENU
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
5. Salir
Elija opción:

El usuario deberá elegir una opción y el programa deberá mostrar el resultado por pantalla
y luego volver al menú. El programa deberá ejecutarse hasta que se elija la opción 5.
Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del programa
directamente, se debe mostrar el siguiente mensaje de confirmación: ¿Está seguro que
desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale del
programa, caso contrario se vuelve a mostrar el menú.
 */
package Egg_Java;

/**
 *
 * @author Mario
 */
import java.util.Scanner;

public class _11_Menu_calcular {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        System.out.println("COLOQUE 2 NUMEROS");
        Scanner teclado = new Scanner(System.in);
        int num = teclado.nextInt();
        int num2 = teclado.nextInt();

        boolean salir = false;

        // ! = NO ---> MIENTRAS NO DIGA (SALIR = VERDADERO) EL BUCLE SE REPITE 
        while (!salir) {

            System.out.println("MENU\n"
                    + "1. Sumar\n"
                    + "2. Restar\n"
                    + "3. Multiplicar\n"
                    + "4. Dividir\n"
                    + "5. Salir");      // ( \n ) -> SALTA UNA LINEA DE CODIGO
            
            String calcular = teclado.nextLine();
            System.out.println("--------------------------------");

            switch (calcular) {
                case "1":
                    System.out.println("RESULTADO");
                    System.out.println(num + num2);
                    System.out.println("");
                    break;

                case "2":
                    System.out.println("RESULTADO");
                    System.out.println(num - num2);
                    System.out.println("");
                    break;

                case "3":
                    System.out.println("RESULTADO");
                    System.out.println(num * num2);
                    System.out.println("");
                    break;

                case "4":
                    System.out.println("RESULTADO");
                    System.out.println(num / num2);
                    System.out.println("");
                    break;

                case "5":
                    System.out.println("SALIR DEL PROGRAMA S/N");
                    String resp = teclado.nextLine();
                    if (resp.equals("s")) {
                        salir = true;

                    }
                    break;

            }
        }
        System.out.println("SALIR");
    }

}
