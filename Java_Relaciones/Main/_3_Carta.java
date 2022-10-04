/*
 Realizar una baraja de cartas españolas orientada a objetos. Una carta tiene un número entre 1
y 12 (el 8 y el 9 no los incluimos) y un palo (espadas, bastos, oros y copas). Esta clase debe
contener un método toString() que retorne el número de carta y el palo. La baraja estará
compuesta por un conjunto de cartas, 40 exactamente.
Las operaciones que podrá realizar la baraja son:

• barajar(): cambia de posición todas las cartas aleatoriamente.
• siguienteCarta(): devuelve la siguiente carta que está en la baraja, cuando no haya más o
se haya llegado al final, se indica al usuario que no hay más cartas.
• cartasDisponibles(): indica el número de cartas que aún se puede repartir.
• darCartas(): dado un número de cartas que nos pidan, le devolveremos ese número de
cartas. En caso de que haya menos cartas que las pedidas, no devolveremos nada, pero
debemos indicárselo al usuario.
• cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha salido ninguna
indicárselo al usuario
• mostrarBaraja(): muestra todas las cartas hasta el final. Es decir, si se saca una carta y
luego se llama al método, este no mostrara esa primera carta.
 */
package Main;

import java.util.Scanner;
import Entidad._3_Baraja;

/**
 *
 * @author Mario
 */
public class _3_Carta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

       
        _3_Baraja DATOS = new _3_Baraja();
        
        boolean band = true, VAR = true;
        int suma = 0;
        
        while (band) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("MENU"+
                "\n 1 = MEZCLAR CARTAS"+
                "\n 2 = SIGUIENTE CARTA"+
                "\n 3 = REPARTIR CARTAS" +
                "\n 4 = CARTAS DISPONIBLES CANT"+
                "\n 5 = CARTAS ELEJIDAS"+
                "\n 6 = MOSTRAR CARTAS RESTANTES"+
                "\n 7 = SALIR");
        
        int RESP = teclado.nextInt();
            if (VAR) {
            DATOS.cartas();    
            }
            
        switch (RESP) {
            case 1:
                DATOS.mezclar();
                System.out.println("COMPLETO");
                VAR = false;
                break;
            case 2:
                DATOS.siguienteCarta();
                break;
            case 3:
                suma = DATOS.darCarta();    // VARIABLE CON RETORNO PARA ENVIAR A (cartasDisponibles)
                break;
            case 4:
                DATOS.cartasDisponibles(suma);
                break;
            case 5:
                DATOS.cartasMonton(suma);
                break;
            case 6:
                DATOS.mostrarBaraja(suma);
                break;
            case 7:
                band = false;
                System.out.println("GRACIAS VUELVAS PRONTOS");
                break;
        }
        
            System.out.println("");
            System.out.println("------------------------------");
        }
}
}