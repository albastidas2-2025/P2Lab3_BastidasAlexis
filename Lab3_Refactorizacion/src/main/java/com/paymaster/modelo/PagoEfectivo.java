package com.paymaster.modelo;

public class PagoEfectivo extends MetodoPago {
    @Override
    public void realizarPago(double monto) {
        System.out.println("--- PAGO EN EFECTIVO ---");
        System.out.println("Validando billetes...");
        System.out.println("Pago registrado: $" + monto);
    }
}
