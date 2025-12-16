package com.paymaster.modelo;

public class PagoCripto extends MetodoPago {
    @Override
    public void realizarPago(double monto) {
        System.out.println("--- PAGO CON CRIPTOMONEDAS ---");
        System.out.println("Generando hash de bloque y verificando red...");
        System.out.println("Transacción de $" + monto + " en proceso.");
    }
}
