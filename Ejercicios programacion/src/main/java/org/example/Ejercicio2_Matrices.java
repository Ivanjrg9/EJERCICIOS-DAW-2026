package org.example;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio2_Matrices {
    static void main() {


        int matriz_a[][]={{3,5,6},{3,8,5},{9,1,5}};
        int matriz_b[][]={{9,5,2},{7,5,1},{2,5,8}};

        int matriz_m[][]= new int[matriz_a.length][matriz_a[0].length];

        for (int i = 0; i < matriz_a.length; i++) {
            for (int j = 0; j < matriz_a[i].length; j++) {

                if (matriz_a[i][j]>matriz_b[i][j]){
                    matriz_m[i][j]=matriz_a[i][j];
                }else {
                    matriz_m[i][j]=matriz_b[i][j];
                }

            }

        }
        for (int fila[]:matriz_m){
            System.out.println(Arrays.toString(fila));
        }





    }
}
