package org.example;

import java.util.Scanner;

public class Ejercicio1 {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        final int JORNADA_SIN_EXTRAS = 40;
        final double TARIFA_PLUS = 1.5;

        System.out.println("Introduce el numero de horas");
        int NUMERO_HORAS = teclado.nextInt();

        System.out.println("Introduce la tarifa por horas");
        double TARIFA_DE_HORAS = teclado.nextDouble();


        if (NUMERO_HORAS>JORNADA_SIN_EXTRAS) { //si

            double HORAS_EXTRAS= NUMERO_HORAS - JORNADA_SIN_EXTRAS;
            double TARIFA_EXTRA = TARIFA_DE_HORAS * TARIFA_PLUS;
            double SALARIO_TOTAL = HORAS_EXTRAS * TARIFA_EXTRA;

            System.out.println("El salario es" + (SALARIO_TOTAL + JORNADA_SIN_EXTRAS * TARIFA_DE_HORAS )+ "€");


        }else { //sino

            double SALARIO = NUMERO_HORAS * TARIFA_DE_HORAS;

            System.out.println("El resulado es" + SALARIO + "€");

        }






    }
}
