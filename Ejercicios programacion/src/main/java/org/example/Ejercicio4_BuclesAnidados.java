package org.example;

import java.util.Scanner;

public class Ejercicio4_BuclesAnidados {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("introduce el valor de m:");
        int numero_m= teclado.nextInt();

        primos:
        for (int i = 2; i <= numero_m ; i++) {

            for (int j = 2; j <i ; j++) {

                if (i % j==0){
                    continue primos;
                }
            }
            System.out.print(i + " ");
            
        }

    }
}
