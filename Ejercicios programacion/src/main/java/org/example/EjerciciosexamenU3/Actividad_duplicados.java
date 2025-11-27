package org.example.EjerciciosexamenU3;

import java.util.Arrays;
import java.util.Scanner;

public class Actividad_duplicados {
    static void main() {
        Scanner Teclado = new Scanner(System.in);

        int original[] = {1,1,2,2,3,4,4,4,5,5,6};

        int auxiliar[] = new int[original.length];
        int tam=1;

        auxiliar[0]=original[0];

        for (int i=1;i<original.length;i++){

            if (original[i]!=original[i-1]){
                auxiliar[i] = original[i];
                tam++;
            }

        }

        System.out.println(Arrays.toString(auxiliar));

        int limpio[] = new int[tam];
        int j=0;

        for (int i=0;i< auxiliar.length;i++){

            if (auxiliar[i]!=0){
                limpio[j] = auxiliar[i];
                j++;
            }

        }

        System.out.println(Arrays.toString(limpio));

    }
}
