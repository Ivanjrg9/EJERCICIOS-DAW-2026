package org.example;

import java.util.Scanner;

public class BuclesAnidados {
    static void main() {


        Bucle_fuera:
        for (int i = 0; i < 10; i++) {
            System.out.println("Bucle fuera " + i);
            Bucle_dentro:
            for (int j = 0; j < 5; j++) {
                System.out.println("Bucle dentro " + j);
                if (i==4){
                    continue Bucle_fuera;
                }

            }

        }
    }
}
