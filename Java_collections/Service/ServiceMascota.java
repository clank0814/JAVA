/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Entidad.Mascota;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Mario
 */
public class ServiceMascota {

    //  private String nombre;
    
    boolean val = true;
    private ArrayList<Mascota> mascotas;

    public ServiceMascota() {
        this.mascotas = new ArrayList();
    }
    
    

    Scanner teclado = new Scanner(System.in);

    
    
    public Mascota crearMascota() {
        
        while (val) {
        
        System.out.println("NOMBRE");
        String nom = teclado.next();
        
        System.out.println("APODO");
        String apodo = teclado.next();
        
        System.out.println("TIPO");
        String tipo = teclado.next();
        
            System.out.println("EDAD");
            int edad = teclado.nextInt();
        
        Mascota creada = new Mascota(nom, apodo, tipo, edad);
        
        mascotas.add(creada);

        System.out.println("COLOCAR OTRO ALUMNO?  S/N");

        String resp = teclado.next();

        if (resp.equals("N")) {
            val = false;
            System.out.println("el bucle funciona");

        } else {
            val = true;
        }
        }
        
        return null;
        
    }

    


public void mostrar() {
        System.out.println("LISTA");
        for (Mascota aux : mascotas) {
        System.out.println(aux);
    }
            
        }

public void buscar(){
    System.out.println("BUSCAR");
    String buscar = teclado.next();
    
    for (Mascota mascota : mascotas) {
        if(mascota.getNombre().equals(buscar)){
            System.out.println("SI ESTA");
            System.out.println(mascota);
            break;
        }
        else{
            System.out.println("NO ESTA");
        }
    }
            
            }
    }
    
    /*
    public void buscar(){
        
        Alumno buscar = new Alumno();
        System.out.println("buscar");
        String nomb = teclado.next();
        for (Alumno alumno : AlumnosList) {
            if(buscar.getNombre().equalsIgnoreCase(nomb)){
                System.out.println("si esta");
                
                
            }
            else {
                System.out.println("no esta");
            }
        }
        
    }
    
    
    
    
    public void bucle(){
        System.out.println("bucle");
        boolean test = true;
        int cont = 1;
        while (test) {            
            System.out.println("coloque su nombre " + cont);
            String nombre = teclado.next();
            System.out.println("nombre: "+ nombre );
            
            Integer NUM1 = teclado.nextInt();
            System.out.println(NUM1);
            Integer NUM2 = teclado.nextInt();
            System.out.println(NUM2);
            Integer NUM3 = teclado.nextInt();
            System.out.println(NUM3);
            
            System.out.println("OTRO NOMBRE?");
            String res = teclado.nextLine();
            String resp = teclado.next();
            if (resp.equals("S")) {
                test = false;
                
            }
           // this.AlumnosList.add(new Alumno(nombre, NUM1, NUM2, NUM3));
        }
        
    }
    */

