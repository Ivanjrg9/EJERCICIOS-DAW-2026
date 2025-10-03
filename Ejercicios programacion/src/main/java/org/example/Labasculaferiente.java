package org.example;

import java.util.Scanner;

public class Labasculaferiente {
    static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);


        final int altura_minima = 140;
        final double peso_maximo = 120;
        final int altura_maxima = 230;

        System.out.println(" BIENVENIDO AL RATÓN JUGUETÓN ");
        System.out.println("Introduce tu altura en centímetros porfavor ");

        int altura = teclado.nextInt();

        System.out.println("GENIAL!! TU ALTURA ES: " + altura + "cm");

        if (altura > altura_minima)
            System.out.println(" ADELANTE!! TODO UN GRANDULLÓN ");

        else if (altura < altura_minima) {
            System.out.println( " LO SENTIMOS MUCHO... PERO TE FALTAN " + (altura_minima - altura)+ " CM PARA PODER SUBIR :( ");
        }














    }
}
