// 
// Decompiled by Procyon v0.5.36
// 

package Entidad;

public class _05_Cuenta
{
    public int NumeroCuenta;
    public int DNI;
    public int SaldoActual;
    
    public _05_Cuenta() {
    }
    
    public _05_Cuenta(final int NumeroCuenta, final int DNI, final int SaldoActual) {
        this.NumeroCuenta = NumeroCuenta;
        this.DNI = DNI;
        this.SaldoActual = SaldoActual;
    }
    
    public int getNumeroCuenta() {
        return this.NumeroCuenta;
    }
    
    public void setNumeroCuenta(final int NumeroCuenta) {
        this.NumeroCuenta = NumeroCuenta;
    }
    
    public int getDNI() {
        return this.DNI;
    }
    
    public void setDNI(final int DNI) {
        this.DNI = DNI;
    }
    
    public int getSaldoActual() {
        return this.SaldoActual;
    }
    
    public void setSaldoActual(final int SaldoActual) {
        this.SaldoActual = SaldoActual;
    }
}
