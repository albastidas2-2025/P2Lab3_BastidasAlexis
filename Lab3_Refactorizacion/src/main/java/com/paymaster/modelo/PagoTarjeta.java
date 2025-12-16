package com.paymaster.modelo;

public class PagoTarjeta extends MetodoPago {
    @Override
    public void realizarPago(double monto) {
        System.out.println("--- PAGO CON TARJETA ---");
        System.out.println("Conectando pasarela...");
        double comision = monto * 0.05;
        System.out.println("Cobro total: $" + (monto + comision));
    }
}
