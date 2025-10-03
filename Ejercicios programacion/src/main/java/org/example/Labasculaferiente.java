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
        System.out.println("LEYENDO ALTURA (CM)... ");
        System.out.println(" MIDES: " + altura + "cm");

        if (altura < 0 || altura > altura_maxima) {
            System.out.println(" ERROR DE LECTURA: VUELVE A SUBIRTE A LA BASCULA ");
        }else{


            if (altura < altura_minima){
                System.out.println( " LO SENTIMOS MUCHO... PERO TE FALTAN " + (altura_minima - altura)+ " CM PARA PODER SUBIR :( ");

            }else{
                System.out.println( " CUANTO PESAS (KG) ?");

                double peso = teclado.nextDouble();
                double peso_minimo = (altura *2) / 8;

                if (peso < peso_minimo || peso > peso_maximo){
                    System.out.println( " LO SIENTO... PESAS " + (peso - peso_maximo) + " (KG) MÁS DEL LIMITE DE LA ATRACCION " );
                }else{
                    System.out.println(" TU PESO ES: " + peso + " KG ");
                    System.out.println(" ADELANTE GRANDULLÓN!!");

                }









            }




        }































    }
}
