package org.example.Programame;

import java.util.Arrays;
import java.util.Scanner;

public class Hundirlaflota {
    static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("-----------------------------------------------------");
        System.out.println("*** Bienvenid@ a hundir la flota ***");
        System.out.println("-----------------------------------------------------");

        int flota[]= barcos(teclado);
        int mitablero[][]=tablero(teclado);




    }

    public static int[] barcos(Scanner teclado){
        System.out.println("Cuantos barcos vas a querer en tu flota? (Máximo 10)");
        int numerobarcos = teclado.nextInt();

        int barcos[] = new int [0];
        if (numerobarcos>0 && numerobarcos<=10){
            System.out.println("---------------------------------------------------");
            System.out.println("Introduce el tamaño para cada uno (Mín 2, Máx 5):");
             barcos = new int [numerobarcos];

            for (int i = 0; i < numerobarcos; i++) {
                System.out.print("Barco " + (i+1) + " :");
                    barcos[i] = teclado.nextInt();
                if (barcos[i] < 2 || barcos[i] > 5){
                    System.out.println("Introdúcelo de nuevo, tamaño incorrecto...");
                    i--;
                    continue;
                }
            }

        }else {
            System.out.println("ERROR: Cantidad de barcos incorrecta...");
        }

        return barcos;
    }

    public static int [][] tablero(Scanner teclado) {

        System.out.println("----------------------------------------------------");

        int dimensiones = 0;

        do {
            System.out.print("Introduce las dimensiones del tablero máximo 128x128: ");
            if (teclado.hasNextInt()){
                dimensiones = teclado.nextInt();

            }else {
                System.out.println("ERROR: No se admiten letras...");
            }

        } while (dimensiones < 1 || dimensiones > 128);

        int[][] tablero = new int[dimensiones][dimensiones];

        System.out.println("Rellena tu tablero:");

        for (int i = 0; i < dimensiones; i++) {
            for (int j = 0; j < dimensiones; j++) {
                System.out.print("Valor en [" + i + "][" + j + "]: ");
                tablero[i][j] = teclado.nextInt();
            }
        }

        System.out.println("Tu tablero es:");
        for (int[] fila : tablero) {
            System.out.println(Arrays.toString(fila));
        }
        return tablero;
    }

    public static int[] buscarBarcosHorizontal(int[][] tablero) {
        int[] barcos = new int[10]; // Para guardar tamaños
        int numBarcos = 0;

        for (int fila = 0; fila < tablero.length; fila++) {
            int tamanyo = 0;

            for (int col = 0; col < tablero[fila].length; col++) {
                if (tablero[fila][col] == 1) {
                    tamanyo++;                 // Contamos la longitud del barco
                    tablero[fila][col] = 2;   // Marcamos como visitado
                } else if (tamanyo > 0) {
                    // Terminó un barco horizontal
                    barcos[numBarcos++] = tamanyo;
                    tamanyo = 0;
                }
            }

            // Si el barco llega hasta el final de la fila
            if (tamanyo > 0) {
                barcos[numBarcos++] = tamanyo;
            }
        }

        return barcos; // Devuelve los tamaños de los barcos encontrados
    }

    public static int[] buscarBarcosVertical(int[][] tablero) {
        int[] barcos = new int[10];
        int numBarcos = 0;

        for (int col = 0; col < tablero.length; col++) {
            int tamanyo = 0;

            for (int fila = 0; fila < tablero.length; fila++) {
                if (tablero[fila][col] == 1) {
                    tamanyo++;
                    tablero[fila][col] = 2;
                } else if (tamanyo > 0) {
                    barcos[numBarcos++] = tamanyo;
                    tamanyo = 0;
                }
            }

            if (tamanyo > 0) {
                barcos[numBarcos++] = tamanyo;
            }
        }

        return barcos;
    }



}
