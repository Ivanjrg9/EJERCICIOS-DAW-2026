package org.example;

import java.util.Arrays;

public class Matrices {
    static void main() {

        int matriz[][]= {{1,2,3},{4,5,6},{7,8,9}};

        int matriz2[][]= new int [3][3];

        System.out.println(matriz[1][2]);

        System.out.println(matriz[2][0]);

        System.out.println("-------------------------------------");

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {

                System.out.print(matriz[i][j] + " ");

            }
            System.out.println();
        }
        int vector[]= {1,2,3};
        System.out.println("------------------------------------");


        for (int num: vector){
            System.out.print(num);
        }
        System.out.println();

        System.out.println("-------------------------------");
        for (int fila[] :matriz){
            System.out.println(Arrays.toString(fila));
        }
        System.out.println();

        System.out.println("------------------------------");
        for (int fila[]: matriz){
            for ( int nums : fila){
                System.out.println(nums);
            }

            System.out.println();

        }

        for (int i = 0; i < matriz.length; i++) {
            System.out.println(matriz[i]);

        }
    }
}
