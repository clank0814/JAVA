// 
// Decompiled by Procyon v0.5.36
// 

package Entidad;

public class _01_Libro
{
    public String ISBN;
    public String Titulo;
    public String Autor;
    public int NumDePaginas;
    
    public _01_Libro() {
    }
    
    public _01_Libro(String ISBN, final String Titulo, String Autor, int NumDePaginas) {
        this.ISBN = ISBN;
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.NumDePaginas = NumDePaginas;
    }
    
    public String getISBN() {
        return this.ISBN;
    }
    
    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }
    
    public String getTitulo() {
        return this.Titulo;
    }
    
    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }
    
    public String getAutor() {
        return this.Autor;
    }
    
    public void setAutor(String Autor) {
        this.Autor = Autor;
    }
    
    public int getNumDePaginas() {
        return this.NumDePaginas;
    }
    
    public void setNumDePaginas(int NumDePaginas) {
        this.NumDePaginas = NumDePaginas;
    }
    
   
}
