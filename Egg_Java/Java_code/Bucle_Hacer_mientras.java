//Bucle (DO WHILE)
package java_code;

/**
 *
 * @author Mario
 */
public class Bucle_Hacer_mientras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i = 1000;
        do{
            System.out.print(i + ", ");
            i-=200;
        }
        while(i >= 0);
    }
    
}
