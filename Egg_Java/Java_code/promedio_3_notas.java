package java_code;

/**
 *
 * @author Mario
 */
public class promedio_3_notas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float nota1 = 8;
        float nota2 = 7;
        float nota3 = 5;
        float res = (nota1 + nota2 + nota3) / 3;
        
        if (res <= 6){
            System.out.println("Aprobo con: " + res );
        }
        else{
              System.out.println("desaprobo con : " + res);
        }
    }
    
}
