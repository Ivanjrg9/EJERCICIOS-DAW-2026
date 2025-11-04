package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class ejercicio2vectores {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        int numeros[]={1,2,3,4,5};
        int aux=0;
        System.out.println(Arrays.toString(numeros));

        for (int i =0; i<numeros.length ; i++) {

            aux=numeros[i];
            numeros[i] =numeros[numeros.length-1];
            numeros[numeros.length-1-i]=aux;

        }
        System.out.println(Arrays.toString(numeros));
    }
}
