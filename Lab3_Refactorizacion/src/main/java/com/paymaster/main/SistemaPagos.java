package com.paymaster.main;

import com.paymaster.modelo.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SistemaPagos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            MetodoPago metodo = null;

            System.out.println("\n==================================");
            System.out.println("--- SISTEMA PAYMASTER - MENÚ ---");
            System.out.println("1. Efectivo");
            System.out.println("2. Tarjeta");
            System.out.println("3. PayPal");
            System.out.println("4. Criptomonedas");
            System.out.println("5. Salir");
            System.out.println("==================================");
            System.out.print("Seleccione el método de pago (1-5): ");

            try {
                int opcion = scanner.nextInt();
                switch (opcion) {
                    case 1:
                        metodo = new PagoEfectivo();
                        break;
                    case 2:
                        metodo = new PagoTarjeta();
                        break;
                    case 3:
                        metodo = new PagoPayPal();
                        break;
                    case 4:
                        metodo = new PagoCripto();
                        break;
                    case 5:
                        continuar = false;
                        System.out.println("Gracias por usar PayMaster. ¡Adiós!");
                        break;
                    default:
                        System.out.println(" ERROR: Opción de menú inválida. Intente de nuevo.");
                        break;
                }
                if (metodo != null) {
                    System.out.print("Ingrese el monto a pagar: $");
                    double monto = scanner.nextDouble();
                    metodo.realizarPago(monto);
                }
                if (continuar) {
                    System.out.print("¿Desea realizar otro pago? (S/N): ");
                    String respuesta = scanner.next().trim().toUpperCase();
                    if (!respuesta.equals("S")) {
                        continuar = false;
                        System.out.println("Gracias por usar PayMaster. ¡Adiós!");
                    }
                }

            } catch (InputMismatchException e) {
                System.out.println(" ERROR: Entrada inválida. Por favor, ingrese solo números para la opción.");
                scanner.next();
            }
        }

        scanner.close();
    }
}