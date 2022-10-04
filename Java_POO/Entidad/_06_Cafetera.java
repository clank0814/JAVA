// 
// Decompiled by Procyon v0.5.36
// 

package Entidad;

import java.util.Scanner;

public class _06_Cafetera
{
    public double CapacidadMaxima;
    public double CantidadActual;
    
    public _06_Cafetera() {
    }
    
    public _06_Cafetera(int CapacidadMaxima, int CantidadActual) {
        this.CapacidadMaxima = CapacidadMaxima;
        this.CantidadActual = CantidadActual;
    }
    
    public double getCapacidadMaxima() {
        return this.CapacidadMaxima;
    }
    
    public void setCapacidadMaxima(double CapacidadMaxima) {
        this.CapacidadMaxima = CapacidadMaxima;
    }
    
    public double getCantidadActual() {
        return this.CantidadActual;
    }
    
    public void setCantidadActual(double CantidadActual) {
        this.CantidadActual = CantidadActual;
    }
}
