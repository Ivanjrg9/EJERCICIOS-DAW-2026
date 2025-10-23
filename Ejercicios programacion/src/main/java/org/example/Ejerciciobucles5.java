package org.example;

import java.util.Scanner;

public class Ejerciciobucles5 {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        System.out.println(" introduce un numero ");
        int num = teclado.nextInt();

        for (int i = 0; i <= 10 ; i++) {
            System.out.println(i * num);

        }


    }
}
