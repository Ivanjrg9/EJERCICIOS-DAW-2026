package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Actividad_duplicados {
    static void main() {
        Scanner Teclado = new Scanner(System.in);

        int vector[] = {1,5,5,4,4,2,3};

        int vector_limpio[] = new int[vector.length];
        int tam =1;
        int aux[] = new int[vector.length];
        aux[0]=0;

        for (int i = 1; i < vector.length; i++){
            if (vector[i]!=vector[i-1]){
                aux[i] = vector[i];
                tam++;

            }
        }
        System.out.println(Arrays.toString(vector));

    }
}
