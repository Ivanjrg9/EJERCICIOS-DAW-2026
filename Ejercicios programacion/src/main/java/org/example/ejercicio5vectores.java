package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ejercicio5vectores {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        Random aleatorio= new Random();

        int vectotr[]= {4,5,7,0,3,9};

        int aux = vectotr[0];

        for (int i = 0; i < vectotr.length - 1 ; i++) {
            vectotr[i]=vectotr[i+1];

        }

        vectotr[vectotr.length-1]=aux;
        System.out.println(Arrays.toString(vectotr));



    }
}
