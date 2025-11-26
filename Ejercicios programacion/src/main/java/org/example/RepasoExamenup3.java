package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class RepasoExamenup3 {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        Random aleatorio = new Random();

        int numbolas = aleatorio.nextInt(30)+10;
        int vectorbolassorteo[] = new int[numbolas];

        for (int i = 0; i < vectorbolassorteo.length; i++) {
            vectorbolassorteo[i]=aleatorio.nextInt(90)+1;
        }



        System.out.println("BIENVENIDO AL CASINO");

        int vectorsinduplicados []= Arrays.stream(vectorbolassorteo).distinct().toArray();
        Arrays.sort(vectorsinduplicados);

        System.out.println(numbolas + " extraidas hasta ahora: " + Arrays.toString(vectorsinduplicados));



    }
}
