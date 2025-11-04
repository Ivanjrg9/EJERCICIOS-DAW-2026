package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ejercicio1vectores {
    static void main() {
        Scanner teclado =new Scanner(System.in);
        Random aleatorio = new Random();

        int numeros[] = new int[8];
        int contador=0;

        for (int i = 0; i < numeros.length; i++) {
            numeros[i]= aleatorio.nextInt(501);
            contador+=numeros[i];

        }
        System.out.println(Arrays.toString(numeros));
        System.out.println("El resultado es " + contador);

    }
}
