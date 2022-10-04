// 
// Decompiled by Procyon v0.5.36
// 

package Servicio;

import java.util.Scanner;
import Entidad._01_Libro;

public class _01_LibroService
{
    public _01_Libro Datos() {
        _01_Libro MEMORY = new _01_Libro();
        Scanner teclado = new Scanner(System.in);
        System.out.println("COLOQUE EL ISBN");
        MEMORY.setISBN(teclado.next());
        System.out.println("COLOQUE EL TITULO");
        MEMORY.setTitulo(teclado.next());
        System.out.println("COLOQUE EL AUTOR");
        MEMORY.setAutor(teclado.next());
        System.out.println("COLOQUE NUM DE PAGINA");
        MEMORY.setNumDePaginas(teclado.nextInt());
        return MEMORY;
    }
    
    public void total(_01_Libro MEMORY) {
        System.out.println("ISBN: " + MEMORY.ISBN);
        System.out.println("TITULO: " + MEMORY.Titulo);
        System.out.println("AUTOR: " + MEMORY.Autor);
        System.out.println("NUM DE PAG: " + MEMORY.NumDePaginas);
    }
}
