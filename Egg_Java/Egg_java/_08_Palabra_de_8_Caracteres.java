/*
 Realizar un programa que solo permita introducir solo frases o palabras de 8 de largo. Si el
usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir un mensaje por
pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”.
Nota: investigar la función Lenght() en Java.
 */
package Egg_Java;

/**
 *
 * @author Mario
 */
import java.util.Scanner;
public class _08_Palabra_de_8_Caracteres {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("COLOQUE UNA PALABRA DE 8 CARACTERES");
        
        // TECLADO
        Scanner teclado = new Scanner(System.in);
        String frase = teclado.nextLine();
        
        // length() -> CONTADOR DE CARACTERES
        int cont = frase.length();
        
        // SI LA PALABRA TIENE MENOS O 8 CARACTERES ES CORRECTO
        if (cont <= 8){
            System.out.println("CORRECTO");
        }
        else{
            System.out.println("INCORRECTO");
        }
        
    }
    
}
