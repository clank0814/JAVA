package java_code;

/**
 *
 * @author Mario
 */
public class condicion_anidada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int cont = 3;
        int num = 10;
        int num2 = 2;
        int res = 0;
    
    //Estructula condicional    
    if (cont == 1){
    res = num + num2;
     System.out.println("Suma = " + res );  
   }
    //Condicional anidada
    else if (cont == 2){
    res = num - num2;
     System.out.println("Resta = " + res );
    }
     else if (cont == 3){
    res = num * num2;
     System.out.println("Multiplicacion = " + res );
    }
     else if (cont == 4){
    res = num / num2;
     System.out.println("Divicion = " + res );
    }
     else 
     System.out.println("NO TIENE SOLUCION");
 }
}
