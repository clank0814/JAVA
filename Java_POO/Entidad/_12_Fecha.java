// 
// Decompiled by Procyon v0.5.36
// 

package Entidad;

import java.util.Date;

public class _12_Fecha
{
    public String Nombre;
    public Date fechaN;
    public int edad;
    public int edad2;
    public boolean mayor;
    
    public _12_Fecha() {
    }
    
    public _12_Fecha(final String Nombre, final Date fechaN, final int edad, final int edad2, final boolean mayor) {
        this.Nombre = Nombre;
        this.fechaN = fechaN;
        this.edad = edad;
        this.edad2 = edad2;
        this.mayor = mayor;
    }
    
    public String getNombre() {
        return this.Nombre;
    }
    
    public void setNombre(final String Nombre) {
        this.Nombre = Nombre;
    }
    
    public Date getFechaN() {
        return this.fechaN;
    }
    
    public void setFechaN(final Date fechaN) {
        this.fechaN = fechaN;
    }
    
    public int getEdad2() {
        return this.edad2;
    }
    
    public void setEdad2(final int edad2) {
        this.edad2 = edad2;
    }
    
    public int getEdad() {
        return this.edad;
    }
    
    public void setEdad(final int edad) {
        this.edad = edad;
    }
    
    public boolean getMayor() {
        return this.mayor;
    }
    
    public void setMayor(final boolean mayor) {
        this.mayor = mayor;
    }
}
