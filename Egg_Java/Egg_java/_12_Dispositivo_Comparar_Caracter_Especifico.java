/*
 Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de
dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato
fijo (SIN NUMEROS): tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que ser
X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, la secuencia
especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia distinta
de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e
incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan las
siguientes funciones de Java Substring(), Length(), equals().
 */
package Egg_Java;

/**
 *
 * @author Mario
 */
import java.util.Scanner;

public class _12_Dispositivo_Comparar_Caracter_Especifico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        System.out.println("COLOQUE MENSAJE (CLAVE)");
        System.out.println("EMPICE CON (X) Y FINALISE CON (O)");
        System.out.println("PARA ENVIAR (&&&&&)");

        // VARIABLES
        Scanner teclado = new Scanner(System.in);
        int cont = 0;
        int m = 0, n = 1;
        int correcto = 0, incorrecto = 0;
        boolean fin_envio = false;

        // BUCLE  (MIENTRAS fin_envio = FALSO)
        while (!fin_envio) {

            m = 0; // SE REINICIA CONTADOR (PRIMERA LETRA)

            String clave = teclado.nextLine();    // TECLADO

            cont = clave.length();      //  CONTADOR DE CARACTERES

            // LIMITE DE CARACTER 5
            if (cont <= 5) {

                String primera_letra = clave.substring(m, n);         // PRIMERA LETRA
                String fin_caracter = clave.substring(cont - 1, cont);  // ULTIMA LETRA
                String envio = clave.substring(m, cont);              // TODOS LOS CARACTERES

// 1 CONDICION
                // SI LA PRIMERA LETRA ES (X) Y LA ULTIMA (O) ES CORRECTO
                if (primera_letra.equals("X") && fin_caracter.equals("O")) {
                    System.out.println("CORRECTO");
                    correcto++;                          // CONTADOR + 1 
                } // SI LOS 5 CARACTERES SON (&) ES CORRECTO
                else if (envio.equals("&&&&&")) {
                    System.out.println("MENSAJE ENVIADO");
                    fin_envio = true;
                } else {
                    System.out.println("CLAVE INCORRECTA");
                    incorrecto++;                              // CONTADOR + 1
                }
            }
// 2 CONDICION

            if (cont > 5) {
                System.out.println("MAX 5 LETRAS");
                incorrecto++;                                     // CONTADOR + 1

            }
        }
        System.out.println("------------------------------");
        System.out.println("RESPUESTAS CORRECTAS: " + correcto);
        System.out.println("RESPUESTAS INCORRECTAS: " + incorrecto);
    }
}
