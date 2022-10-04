// 
// Decompiled by Procyon v0.5.36
// 

package Entidad;

public class _07_Persona
{
    public String Nombre;
    public int Edad;
    public String sexo;
    public int peso;
    public double altura;
    
    public _07_Persona() {
    }
    
    public _07_Persona(final String Nombre, final int Edad, final String sexo, final int peso, final int altura) {
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }
    
    public String getNombre() {
        return this.Nombre;
    }
    
    public void setNombre(final String Nombre) {
        this.Nombre = Nombre;
    }
    
    public int getEdad() {
        return this.Edad;
    }
    
    public void setEdad(final int Edad) {
        this.Edad = Edad;
    }
    
    public String getSexo() {
        return this.sexo;
    }
    
    public void setSexo(final String sexo) {
        this.sexo = sexo;
    }
    
    public int getPeso() {
        return this.peso;
    }
    
    public void setPeso(final int peso) {
        this.peso = peso;
    }
    
    public double getAltura() {
        return this.altura;
    }
    
    public void setAltura(final double altura) {
        this.altura = altura;
    }
}
