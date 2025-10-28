package org.example;

import java.util.Scanner;

public class Repasoexamen1 {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        int positivos =0;
        int menores = 0;
        int iguales = 0;


        System.out.println("Cuantos numeros quieres introducir?");
        int eleccionnums = teclado.nextInt();


        for (int i = 0; i < eleccionnums ; i++) {
            System.out.println("Ahora introduce los numeros");
            int nums = teclado.nextInt();


            if (nums > 0) {
                positivos++;

            } else if (nums < 0) {
                menores++;

            }else {
                iguales++;
            }


        }
        System.out.println(" positivos " + positivos + " negativos " + menores + " Iguales " + iguales);


    }
}
