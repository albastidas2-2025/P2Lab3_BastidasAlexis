package com.paymaster.legado;

public class ProcesadorAntiguo {
    // CÓDIGO LEGADO - NO MODIFICAR, SOLO ANALIZAR
    public void procesarPago(String tipo, double monto) {
        if (tipo.equalsIgnoreCase("EFECTIVO")) {
            System.out.println("--- PAGO EN EFECTIVO ---");
            System.out.println("Validando billetes...");
            System.out.println("Pago registrado: $" + monto);
        }
        else if (tipo.equalsIgnoreCase("TARJETA")) {
            System.out.println("--- PAGO CON TARJETA ---");
            System.out.println("Conectando pasarela...");
            double comision = monto * 0.05;
            System.out.println("Cobro total: $" + (monto + comision));
        }
        else if (tipo.equalsIgnoreCase("PAYPAL")) {
            System.out.println("--- PAGO CON PAYPAL ---");
            System.out.println("Redirigiendo a API...");
            System.out.println("Transacción de $" + monto + " completada.");
        }
        else {
            System.out.println("ERROR: Método desconocido.");
        }
    }
}
