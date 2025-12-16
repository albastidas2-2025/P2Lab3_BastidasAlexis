package com.paymaster.modelo;

public class PagoPayPal extends MetodoPago {
    @Override
    public void realizarPago(double monto) {
        System.out.println("--- PAGO CON PAYPAL --");
        System.out.println("Redirigiendo a API...");
        System.out.println("Transacción de $" + monto + " completada.");
    }
}