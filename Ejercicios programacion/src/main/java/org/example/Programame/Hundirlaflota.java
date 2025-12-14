package org.example.Programame;

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

            for (int i = 0; i < numerobarcos; i++) {
                System.out.print("Barco " + (i+1) + " :");
                int tamanyobarcos = teclado.nextInt();
                if (tamanyobarcos < 2 || tamanyobarcos > 5){
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
        System.out.println("Ahora introduce tu tablero: ");


    }
}
