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
package Entidad;

import java.util.Scanner;

/**
 *
 * @author Mario
 */
public class _3_Baraja {

   private int num;
    private String palo;

    public _3_Baraja() {
    }

    public _3_Baraja(int num, String palo) {
        this.num = num;
        this.palo = palo;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getPalo() {
        return palo;
    }

    public void setPalo(String palo) {
        this.palo = palo;
    }

    @Override
    public String toString() {
        return  num + " " + palo;
    }

    _3_Baraja vector[] = new _3_Baraja[40];
    String oro = "ORO";
    String basto = "BASTO";
    String copa = "COPA";
    String espada = "ESPADA";
    
    
// METODO 1
    public void cartas() {
        int j = 1;
        for (int i = 0; i < 40;) {

            vector[i] = new _3_Baraja(j, oro);
            i++;
            vector[i] = new _3_Baraja(j, basto);
            i++;
            vector[i] = new _3_Baraja(j, copa);
            i++;
            vector[i] = new _3_Baraja(j, espada);
            i++;
            j++;
            if (j == 8) {
                j = 10;
            }
        }
    }

    
    
// METODO 2    
    public void mezclar() {

// CREAMOS UN VECTOR CON INDICE ALEATORIO
// LOS NUM RANDOM NO SE REPITEN
        int vectorLista[] = new int[40];
        int h = 0;
        vectorLista[h] = (int) Math.floor(Math.random()* 40);
        for (h = 1 + suma; h < 40 ; h++) {

            vectorLista[h] = (int) Math.floor(Math.random() * 40);
            for (int k = 0; k < h; k++) {
                if (vectorLista[h] == vectorLista[k]) {

                    h--;
                }

            }
        }

        int j = 1;
        for (int i = 0; i < 40;) {

            vector[vectorLista[i]] = new _3_Baraja(j, oro);
            i++;
            vector[vectorLista[i]] = new _3_Baraja(j, basto);
            i++;
            vector[vectorLista[i]] = new _3_Baraja(j, copa);
            i++;
            vector[vectorLista[i]] = new _3_Baraja(j, espada);
            i++;
            j++;
            if (j == 8) {
                j = 10;
            }
        }

     //      for (int i = 0; i < 40; i++) {
     //        System.out.println(vector[i]);
      //   }
    }

    
    
// METODO 3    
    int siguienteCarta = 0;  // VARIABLE GLOBAL

    public void siguienteCarta() {

        System.out.println(vector[siguienteCarta]);
        siguienteCarta++;
    }

    
    
// METODO 4    
    Scanner teclado = new Scanner(System.in);    // VARIABLE GLOBAL
    int suma;
    
    public int darCarta() {

        String resp = "s";

        while (resp.equals("s") || resp.equals("S")) {

            int cartaRestante = 40 - suma;
            System.out.println("CANTIDAD: " + cartaRestante);

            System.out.println("CUANTAS CARTAS QUIERE MAESTRO?");
            int numCartas = teclado.nextInt();

            if (suma + numCartas <= 40) {

                for (int i = suma; i < suma + numCartas; i++) {
                    System.out.println(vector[i]);
                }
                
                suma = numCartas + suma;
                
            } else if (cartaRestante < suma || cartaRestante < numCartas) {
                System.out.println("NO HAY SUFICIENTES CARTAS");
            }

            if (0 == suma - 40) {
                System.out.println("YO NO HAY CARTAS");
                resp = "";
            } else {
                System.out.println("QUIERE MAS CARTAS? S/N");
                resp = teclado.next();
            }
        }
        return suma;
    }

    
    
// METODO 5
    public void cartasDisponibles(int suma) {    // EL PARAMETRO ESTA EN MAIN 

        suma = 40 - suma;
        System.out.println("QUEDAN " + suma + " CARTAS PARA REPARTIR");
    }

    
    
// METODO 6
    public void cartasMonton(int suma) {       // EL MISMO PARAMETRO QUE SE ENIVIA A (MAIN)

        System.out.println("CARTAS ELEJIDAS: " + suma);
        for (int i = 0; i < suma; i++) {
            System.out.println(vector[i]);
        }
    }

    
    
// METODO 7    
    public void mostrarBaraja(int suma) {      // EL MISMO PARAMETRO QUE SE ENIVIA A (MAIN)
        int val = 40 - suma;
        System.out.println("TODAS LAS CARTAS (RESTANTES): " + val);
        for (int i = suma; i < 40; i++) {
            System.out.println(vector[i]);
        }

    }

// METODO MEZCLAR 
    // CREAR UN VECTOR VOID CON INDICES RANDOM (1 - 40)
    // LUEGO CON UN FOR REEMPLAZAR LOS INDICES DEL VECTOR ANTERIOR (ORDENADO) PARA QUE EL VECTOR CON LOS VALORES SE MEZCLE
    // VECTOR[i] = VECTOR[vectorRandom] ----> (ERROR NO ENCONTRADO) ---->  LOS VALORES SE REPITEN
    /*
    public void mezclar() {

        System.out.println("---------------");
            int vectorLista[] = new int[40];
        int h = 0;
        vectorLista[h] = (int) Math.floor(Math.random() * 40);
        for (h = 1; h < 40; h++) {

            vectorLista[h] = (int) Math.floor(Math.random() * 40);
            for (int k = 0; k < h; k++) {
                if (vectorLista[h] == vectorLista[k]) {
                    
                    h--;
                }
               
                }
            }
        
        
        System.out.println("-----------");
        for (int i = 0; i < 40; i++) {
            int val = vectorLista[i];
            vector[i] = vector[val];
        }
    
        System.out.println("----------LISTA-------------");
        for (int i = 0; i < vector.length; i++) {
            System.out.println(vector[i]);
        }
    }
     */
    }
