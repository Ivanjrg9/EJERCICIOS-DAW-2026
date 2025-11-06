package org.example;

import java.util.Scanner;

public class ejercicio6vectores {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        int vector[] = {1,2,3,2,1};

        for (int i = 0; i < vector.length; i++) {

            if (vector[i]!=vector[vector.length - 1 - i]){
                System.out.println("No es");
                break;
            }
        }

        System.out.println("Es palindromo");
    }
}
