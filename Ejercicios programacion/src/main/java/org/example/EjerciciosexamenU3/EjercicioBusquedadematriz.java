package org.example.EjerciciosexamenU3;

import java.util.Arrays;
import java.util.Scanner;

public class EjercicioBusquedadematriz {
    static void main() {
        Scanner teclado=new Scanner(System.in);


        int numerobuscar = 0;

        System.out.println("Rellena la matriz (3x3)");

        int matriz[][] = new int[3][3];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j]= teclado.nextInt();

            }
        }

        for (int nums[]:matriz){
            System.out.println(Arrays.toString(nums));
        }

        System.out.println("Numero a buscar");
        numerobuscar= teclado.nextInt();

        matriz:
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++){
                if (matriz[i][j]==numerobuscar){
                    System.out.println("El numero " + numerobuscar + " se encuentra en la posicion( " + i + "," + j + ".)");
                    break matriz;
                }
            }
        }











    }
}
