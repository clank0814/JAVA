/*
ESTATICO
Crear un programa que muestre en pantalla una Matriz de 2 Filas y 2 Columnas con un numero
dentro de cada posición:
[2] [5]
[5] [2]

DINAMICO
Crear un programa que muestre en pantalla una Matriz de 3 x 3:
[1] [2] [3]
[4] [5] [6]
[7] [8] [9]
 */
package java_code;

/**
 *
 * @author Mario
 */
public class Arreglo_Matriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //ESTATICO
        int matriz[][] = new int[2][2];   //INICIO DE LA MATRIZ
        matriz[0][0] = 5;
        matriz[0][1] = 2;
        matriz[1][0] = 2;
        matriz[1][1] = 5;
        
        System.out.print("[" + matriz[0][0] + "]");
        System.out.println("[" + matriz[0][1] + "]");
        System.out.print("[" + matriz[1][0] + "]");
        System.out.println("[" + matriz[1][1] + "]");
        
        //DINAMICO
        System.out.println("DINAMICOS");
        int matriz2[][] = new int[3][3];     //INICIO DE LA MATRIZ
        int cont = 1;
        //BUCLE
        for(int j = 0; j < matriz2.length; j++){
            for(int i = 0 ; i < matriz2.length; i++){
                
                matriz2[j][i]= cont;
                cont++;
                System.out.print("[" + matriz2[j][i] + "]");    
            }
            System.out.println("");
        }
          
        
    }
}
