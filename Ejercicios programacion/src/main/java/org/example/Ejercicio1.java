package org.example;

import java.util.Scanner;

public class Ejercicio1 {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce el numero de horas");
        int NUMERO_HORAS = teclado.nextInt();

        System.out.println("Introduce la tarifa por horas");
        double TARIFA_DE_HORAS = teclado.nextDouble();

        double SALARIO = NUMERO_HORAS * TARIFA_DE_HORAS;

        System.out.println(" El resulado es"+ SALARIO + "€");
        






    }
}
