/*
 Definir una Clase que contenga algún tipo de dato de tipo array y agregue el código para
generar y capturar una excepción ArrayIndexOutOfBoundsException (índice de arreglo fuera
de rango).
 */
package Main;

/**
 *
 * @author Mario
 */
public class _2_Exception_Array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int vector[] = new int[4];

        try {
            for (int i = 0; i < 5; i++) {
                vector[i] = 1;
            }
        } catch (ArrayIndexOutOfBoundsException e) {    
            System.out.println("ERROR: ARRAY FUERA DE RANGO");
        }

    }

}
