package org.example;

import java.util.Scanner;

public class Multiplicandos {
    static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        boolean repetir = false;
        int multiplicando = 0;
        int multiplicador = 0;

        do {
            repetir = false;
            try {
                System.out.println( " Introduce el Multiplicando (3 cifras): ");
                multiplicando = teclado.nextInt();

                System.out.println( " Introduce el Multiplicador (3 cifras): ");
                multiplicador = teclado.nextInt();

                if (multiplicando > 999 || multiplicando < 100 || multiplicando < 0 || multiplicador > 999 || multiplicador < 100 || multiplicador < 0){
                    System.out.println( " ERROR: Los numeros deben de ser positivos y de exactamente 3 cifras ");
                    repetir = true;
                }

            }catch (Exception error){
                System.out.println(" ERROR: Introduce un formato correcto");
                teclado.nextLine();
                repetir = true;
            }


        }while (repetir);

        // Convertir a string
        String multiplicanding = Integer.toString(multiplicando);
        String multiplicadoring = Integer.toString(multiplicador);

        // Sacar las cifras del multiplicador
        int cifra1 = Integer.parseInt(multiplicadoring.substring(2,3));
        int cifra2 = Integer.parseInt(multiplicadoring.substring(1,2));
        int cifra3 = Integer.parseInt(multiplicadoring.substring(0,1));

        // Productos parciales
        int parcial1 = multiplicando * cifra1; // Unidades
        int parcial2 = multiplicando * cifra2; // Decenas
        int parcial3 = multiplicando * cifra3; // Centenas

        // Total
        int total = multiplicando * multiplicador; // El Total final

        // Mostrar los resultados
        System.out.println();
        System.out.println("  " + multiplicando);
        System.out.println(" x " + multiplicador);
        System.out.println("_______");
        System.out.println("   " + parcial1); // Unidades
        System.out.println("  " + parcial2); // Decenas
        System.out.println(" " + parcial3); // Centenas
        System.out.println("______");
        System.out.println(" " + total); // El Total final


















}
    }



