// 
// Decompiled by Procyon v0.5.36
// 

package java_poo;

import Entidad._05_Cuenta;
import Servicio._05_CuentaService;

public class _05_
{
    public static void main(final String[] args) {
        final _05_CuentaService RESPUESTA = new _05_CuentaService();
        final _05_Cuenta DatosCuenta = RESPUESTA.DatosCuenta();
        RESPUESTA.Sumar(DatosCuenta);
        RESPUESTA.Restar(DatosCuenta);
        RESPUESTA.ExtraccionRapida(DatosCuenta);
        RESPUESTA.ConsultarSaldo(DatosCuenta);
        RESPUESTA.ConsultarDatos(DatosCuenta);
    }
}
