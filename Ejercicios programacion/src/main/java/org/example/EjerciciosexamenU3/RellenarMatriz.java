package org.example.EjerciciosexamenU3;

import java.util.Arrays;
import java.util.Scanner;

public class RellenarMatriz {
    static void main() {
        Scanner teclado= new Scanner(System.in);

        String matriz[][]= new String[3][4];

        for (int i = 0; i < matriz.length; i++) {

            String fila[]= teclado.next().split(",");
            if (fila.length== matriz[i].length){
                for (int j = 0; j < matriz[i].length; j++) {
                    matriz[i][j]= fila[j];
                }

            }else {
                System.out.println("El tamaño no es el correcto");
                i--;
            }
        }
        for (String filas[] : matriz){
            System.out.println(Arrays.toString(filas));

        }
    }
}
