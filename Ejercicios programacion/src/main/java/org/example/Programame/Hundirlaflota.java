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
        buscar_barcos(mitablero);

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

    public static void buscar_barcos(int[][] tablero) {

        int num_barcos_horizontal = 0;

        for (int i = 0; i < tablero.length; i++) {
            int contador_unos = 0;

            for (int j = 0; j < tablero[i].length; j++) {

                if (tablero[i][j] == 1) {
                    contador_unos++;
                } else {

                    if (contador_unos >= 2) {
                        num_barcos_horizontal++;
                        System.out.println("Barco horizontal encontrado en fila " + i + " de tamaño " + contador_unos);
                    }
                    contador_unos = 0;
                }
            }

            if (contador_unos >= 2) {
                num_barcos_horizontal++;
                System.out.println("Barco horizontal encontrado en fila " + i + " de tamaño " + contador_unos);
            }
        }

        int num_barcos_vertical = 0;

        for (int j = 0; j < tablero.length; j++) {
            int contador_unos = 0;

            for (int i = 0; i < tablero.length; i++) {

                if (tablero[i][j] == 1) {
                    contador_unos++;
                } else {
                    if (contador_unos >= 2) {
                        num_barcos_vertical++;
                        System.out.println("Barco vertical en columna " + j + " de tamaño " + contador_unos);
                    }
                    contador_unos = 0;
                }
            }

            if (contador_unos >= 2) {
                num_barcos_vertical++;
                System.out.println("Barco vertical en columna " + j + " de tamaño " + contador_unos);
            }
        }
        int total_barcos = num_barcos_horizontal + num_barcos_vertical;

        System.out.println("--------------------------------");
        System.out.println("Barcos horizontales: " + num_barcos_horizontal);
        System.out.println("Barcos verticales: " + num_barcos_vertical);
        System.out.println("TOTAL BARCOS: " + total_barcos);
    }
}
