package org.example;

import java.util.Arrays;
import java.util.Random;

public class duplicados_distinct {
    static void main() {
        Random aleatorio = new Random();


       // int numeritos[]= {1,2,2,3,4,5,6,6};
        //int numeritos_limpio[]= Arrays.stream(numeritos).distinct().toArray();

        //System.out.println(Arrays.toString(numeritos_limpio));

        int numeros[]= new int[20];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] =aleatorio.nextInt(18)+1;
        }
        System.out.println(Arrays.toString(numeros));
        Arrays.sort(numeros);
        System.out.println(Arrays.toString(numeros));

        boolean comprobar=true;

        while (comprobar) {
            comprobar=false;
            for (int i = 0; i < numeros.length -1; i++) {
                if (numeros[i]==numeros[i+1]) {
                    System.out.println("duplicado: " + numeros[i]);
                    numeros[i] = aleatorio.nextInt(50) + 1;
                    Arrays.sort(numeros);
                    comprobar = true;
                }
            }
        }
        System.out.println(Arrays.toString(numeros));
    }
}

