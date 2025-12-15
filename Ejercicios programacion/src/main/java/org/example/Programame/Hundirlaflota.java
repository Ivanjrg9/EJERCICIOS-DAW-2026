package org.example.Programame;

import java.util.Arrays;
import java.util.Scanner;

public class Hundirlaflota {
    static void main(String[] args) {
        System.out.println("-----------------------------------------------------");
        System.out.println("*** Bienvenid@ a hundir la flota ***");
        System.out.println("-----------------------------------------------------");
        barcos();
        tablero();


    }

    public static void barcos(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Cuantos barcos vas a querer en tu flota? (Máximo 10)");
        int numerobarcos = teclado.nextInt();

        if (numerobarcos>0 && numerobarcos<=10){
            System.out.println("---------------------------------------------------");
            System.out.println("Introduce el tamaño para cada uno (Mín 2, Máx 5):");
            int barcos[] = new int [numerobarcos];

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
    }

    public static void tablero(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("----------------------------------------------------");
        System.out.println("Ahora introduce las dimensiones de tu tablero máximo 128x128:");

        System.out.println("Dimensiones:");
        int dimensiones = teclado.nextInt();

        System.out.println("Relleta tu tablero");
        int tablero[][]=new int[dimensiones][dimensiones];

        for (int i = 0; i < dimensiones; i++) {
            for (int j = 0; j < dimensiones; j++) {
                tablero[i][j]= teclado.nextInt();
            }
        }

        for (int filas[]:tablero){
            System.out.println("Tu tablero " + Arrays.toString(filas));
        }
    }
}
