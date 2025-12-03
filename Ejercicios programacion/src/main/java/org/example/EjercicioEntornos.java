package org.example;

import java.util.Scanner;

public class EjercicioEntornos {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Cuantas personas no conoce Lotario?");
        int personas = teclado.nextInt();

        System.out.println("Como se llaman?");
        for (int i = 0; i < personas; i++) {
            System.out.println("Soy:");
            String nombres = teclado.next();
            System.out.println("---------------------");
            System.out.println("Hola " + nombres + " ;)");
            System.out.println("---------------------");
        }
    }
}
