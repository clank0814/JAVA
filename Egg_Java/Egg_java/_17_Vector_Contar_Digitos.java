/*
 Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos
de 2 dígitos, etcétera (hasta 5 dígitos).
 */
package Egg_Java;

/**
 *
 * @author Mario
 */
import java.util.Arrays;
import java.util.Scanner;
import jdk.net.Sockets;
public class _17_Vector_Contar_Digitos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("CANTIDAD DE NUMEROS");
        Scanner teclado = new Scanner(System.in);
        int cantidad = teclado.nextInt();
        int vector[] = new int[cantidad];
        
        System.out.println("NUMEROS HASTA 5 DIGITOS");
        for (int i = 0; i < vector.length; i++) {
            int num = teclado.nextInt();
            vector[i] = num;
            
        }
        
        System.out.println("--------------------------");
        System.out.println("CONTADOR");
        int UnDigito = 0;
        int DosDigitos = 0;
        int TresDigitos = 0;
        int CuatroDigitos = 0;
        int CincoDigitos = 0;
        
        Arrays.sort(vector);
        for (int i = 0; i < vector.length; i++) {
            int cont = vector [i];
            
            
            if (cont < 10 ) {                
               UnDigito++;
            }
            else if (cont >= 10 && cont < 99){
                DosDigitos++;
            }
            else if (cont >= 100 && cont < 999){
                TresDigitos++;
            }
            else if (cont >=1000 && cont < 9999){
                CuatroDigitos++;
            }
            else if (cont > 10000 && cont < 99999){
                CincoDigitos++;
            }
            
        }
        System.out.println("1 DIGITO: " + UnDigito);
        System.out.println("2 DIGITO: " + DosDigitos);
        System.out.println("3 DIGITO: " + TresDigitos);
        System.out.println("4 DIGITO: " + CuatroDigitos);
        System.out.println("5 DIGITO: " + CincoDigitos);
    }
    
}
