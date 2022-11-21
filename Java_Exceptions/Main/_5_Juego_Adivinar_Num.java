/*
 Escribir un programa en Java que juegue con el usuario a adivinar un número. La computadora
debe generar un número aleatorio entre 1 y 500, y el usuario tiene que intentar adivinarlo. Para
ello, cada vez que el usuario introduce un valor, la computadora debe decirle al usuario si el
número que tiene que adivinar es mayor o menor que el que ha introducido el usuario. Cuando
consiga adivinarlo, debe indicárselo e imprimir en pantalla el número de veces que el usuario
ha intentado adivinar el número. Si el usuario introduce algo que no es un número, se debe
controlar esa excepción e indicarlo por pantalla. En este último caso también se debe contar el
carácter fallido como un intento.
 */
package Main;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Mario
 */
public class _5_Juego_Adivinar_Num {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner teclado = new Scanner(System.in);

        System.out.println("------------ADIVINA EL NUMERO (1 - 500)------------");
        int cont = 0;

        int num = (int) (Math.random() * (500 - 1 + 1) + 1);

        //  System.out.println(num);
        boolean band = true;

        while (band) {

            try {

                System.out.println("COLOQUE EL NUMERO");

                int var = teclado.nextInt();

                cont++;

                if (var < num) {

                    System.out.println("MAYOR");
                } else if (var > num) {

                    System.out.println("MENOR");
                } else {
                    System.out.println("CORRECTO");
                    band = false;
                }
            } catch (InputMismatchException e) {
                System.out.println("ERROR: SOLO SE ADMITEN NUMEROS ENTEROS");
                cont++;

                // TECLADO DE SALTO DE LINEA 
                String test = teclado.next();   // ERROR NO ENCONTRADO: EL BUCLE SIGUE ESCRIBIENDO EL MISMO "CARACTER DEL ERROR"  

            }
        }

        System.out.println("INTENTOS REALIZADOS" + cont);
    }

}
