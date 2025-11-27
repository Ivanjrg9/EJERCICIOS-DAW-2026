package org.example.EjerciciosexamenU3;

import java.util.Scanner;

public class Ejercicio2_BuclesAnidados {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce la altura: ");
        int altura=teclado.nextInt();

        for (int i = 0; i < altura; i++) {

            for (int j = 0; j <= i; j++) {
                System.out.print("*");

            }
            System.out.println();

        }
    }
}
