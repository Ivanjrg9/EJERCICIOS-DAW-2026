package org.example;

import java.util.Arrays;
import java.util.Random;

public class EjercicioSumaFilasMatriz {
    static void main() {
        Random aleatorio = new Random();

        int matriz[][]= new int [aleatorio.nextInt(5)+1][aleatorio.nextInt(5)+1];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j]= aleatorio.nextInt(25)+1;
            }
        }

        for (int filas[] :matriz){
            System.out.println(Arrays.toString(filas));

        }

        int contador_columna=0;

        for (int i = 0; i < matriz[0].length; i++) {

            contador_columna=0;
            for (int j = 0; j < matriz.length; j++) {
                contador_columna+= matriz[j][i];
            }
            System.out.println("Columna " + i + ":" + contador_columna);

        }

        int contador_fila=0;

        for (int i = 0; i < matriz.length; i++) {

            contador_fila=0;
            for (int j = 0; j < matriz[0].length; j++) {
                contador_fila+= matriz[i][j];
            }

            System.out.println("Fila " + i + ":" + contador_fila);
        }

        int suma=0;

        for (int i = 0; i < matriz[0].length; i++) {

            suma+= matriz[aleatorio.nextInt(matriz.length-1) + 1][i];
        }

        System.out.println("1 Fila " + suma);


    }
}
