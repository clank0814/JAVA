/*
 Escriba un programa que pida una frase o palabra y valide si la primera letra de esa frase
es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por pantalla que
diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”. Nota: investigar
la función Substring(i, f) y equals() de Java.
 */
package Egg_Java;

/**
 *
 * @author Mario
 */
import java.util.Scanner;
public class _09_Primera_Letra_Igual {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("COLOQUE UNA PALABRA QUE COMIENCE CON (A)");
        
        // TECLADO
        Scanner teclado = new Scanner(System.in);
        String frase = teclado.nextLine();
        
        // SUBCADENA -> INICIA EN 0 , TERMINA EN 1 (PRIMER CARACTER)
        String modif = frase.substring(0 , 1);
        
        // SI LA PRIMERA LETRA ES "A" ES CORRECTO
        if(modif.equals("A")){
            System.out.println("CORRECTO");
        }
        else{
            System.out.println("INCORRECTO");
        }
        
        
    }
    
}
