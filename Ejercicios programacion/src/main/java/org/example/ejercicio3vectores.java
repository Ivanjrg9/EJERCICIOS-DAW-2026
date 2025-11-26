package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ejercicio3vectores {
    static void main() {
        Scanner teclado= new Scanner(System.in);
        Random aleatorio = new Random();

        int vector[] = new int[25];
        int vector2[]= {1,2,3,4,5,6,7};

        for (int i = 0; i < vector.length; i++) {

        }
        System.out.println(Arrays.toString(vector));

        System.out.println("Numero a buscar...");
        int numeri_buscar= teclado.nextInt();

        int contador = 0;

        for (int i = 0; i < vector.length ; i++) {
            if (numeri_buscar==vector[i]){
                contador++;
            }

        }
        System.out.println("El numero " + numeri_buscar + " aparece " + " veces en el vector");
        System.out.println(vector2.length);
    }

}
