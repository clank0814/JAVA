// 
// Decompiled by Procyon v0.5.36
// 

package Entidad;

public class _08_Cadena
{
    String Frase;
    int longitud;
    String Letra;
    String Frase2;
    String Modif;
    String Buscar;
    
    public _08_Cadena() {
    }
    
    public _08_Cadena(final String Frase, final int longitud, final String Letra, final String Frase2, final String Modif, final String Buscar) {
        this.Frase = Frase;
        this.longitud = longitud;
        this.Letra = Letra;
        this.Frase2 = Frase2;
        this.Modif = Modif;
        this.Buscar = Buscar;
    }
    
    public String getFrase() {
        return this.Frase;
    }
    
    public void setFrase(final String Frase) {
        this.Frase = Frase;
    }
    
    public int getLongitud() {
        return this.longitud;
    }
    
    public void setLongitud(final int longitud) {
        this.longitud = longitud;
    }
    
    public String getLetra() {
        return this.Letra;
    }
    
    public void setLetra(final String Letra) {
        this.Letra = Letra;
    }
    
    public String getFrase2() {
        return this.Frase2;
    }
    
    public void setFrase2(final String Frase2) {
        this.Frase2 = Frase2;
    }
    
    public String getModif() {
        return this.Modif;
    }
    
    public void setModif(final String Modif) {
        this.Modif = Modif;
    }
    
    public String getBuscar() {
        return this.Buscar;
    }
    
    public void setBuscar(final String Buscar) {
        this.Buscar = Buscar;
    }
}
