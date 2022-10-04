/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Main_Collections;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Mario
 */
public class test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
  
    
    TreeSet<Integer> Lista = new TreeSet<>();
        Lista.add(1);  
     Lista.add(20);  
     Lista.add(43);  
     Lista.add(50);  
     Lista.add(13);
     
     for (Integer AUX : Lista) {
             System.out.println("LISTA"+ AUX);
         }
     
     for(NewEnum aux: NewEnum.values()){
         System.out.println(aux);
     }
     
     Scanner teclado = new Scanner(System.in);
     String dia = teclado.next();
     String mes = teclado.next();
     String año = teclado.next();
     
        System.out.println(new Date(dia + "/" + mes + "/" +año));
     }
    
    
    }