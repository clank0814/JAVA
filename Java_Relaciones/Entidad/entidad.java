/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/**
 *
 * @author Mario
 */
public class entidad {
    public String ISBN;
    public String Titulo;
    public String Autor;
    public int NumDePaginas;
    
    public int PosicionActual;
    public int PosicionAgua;
    
    public entidad() {
    }
    
    public entidad( String ISBN,  String Titulo,  String Autor,  int NumDePaginas, int PosicionActual, int PosicionAgua ) {
        this.ISBN = ISBN;
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.NumDePaginas = NumDePaginas;
        this.PosicionActual = PosicionActual;
        this.PosicionAgua = PosicionAgua;
    }
    
    public String getISBN() {
        return this.ISBN;
    }
    
    public void setISBN( String ISBN) {
        this.ISBN = ISBN;
    }
    
    public String getTitulo() {
        return this.Titulo;
    }
    
    public void setTitulo( String Titulo) {
        this.Titulo = Titulo;
    }
    
    public String getAutor() {
        return this.Autor;
    }
    
    public void setAutor( String Autor) {
        this.Autor = Autor;
    }
    
    public int getNumDePaginas() {
        return this.NumDePaginas;
    }
    
    public void setNumDePaginas( int NumDePaginas) {
        this.NumDePaginas = NumDePaginas;
    }

    public int getPosicionActual() {
        return PosicionActual;
    }

    public void setPosicionActual(int PosicionActual) {
        this.PosicionActual = PosicionActual;
    }

    public int getPosicionAgua() {
        return PosicionAgua;
    }

    public void setPosicionAgua(int PosicionAgua) {
        this.PosicionAgua = PosicionAgua;
    }

    @Override
    public String toString() {
        return "entidad{" + "ISBN=" + ISBN + ", Titulo=" + Titulo + ", Autor=" + Autor + ", NumDePaginas=" + NumDePaginas + ", PosicionActual=" + PosicionActual + ", PosicionAgua=" + PosicionAgua + '}';
    }
    
}
