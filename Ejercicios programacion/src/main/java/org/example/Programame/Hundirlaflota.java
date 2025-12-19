package org.example.Programame;

import java.util.Arrays;
import java.util.Scanner;

public class Hundirlaflota {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("-----------------------------------------------------");
        System.out.println("*** Bienvenid@ a hundir la flota ***");
        System.out.println("-----------------------------------------------------");

        int[] flota = barcos(teclado);
        int[][] tableroJuego = tablero(teclado);
        buscar_barcos(tableroJuego);

        teclado.close();
    }

    /**
     * Author Ivan
     * Version 1.0
     * Aqui se piden los barcos
     * @param teclado
     * @return
     */
    public static int[] barcos(Scanner teclado){

        int numeroBarcos = 0;

        System.out.print("Cuantos barcos vas a querer en tu flota? (Máximo 10): ");
        if (teclado.hasNextInt()) {
            numeroBarcos = teclado.nextInt();
        } else {
            System.out.println("ERROR: No se admiten letras");
            teclado.next();
        }

        int[] tamanosBarcos = new int[0];
        if (numeroBarcos > 0 && numeroBarcos <= 10){
            System.out.println("---------------------------------------------------");
            System.out.println("Introduce el tamaño para cada uno (Mín 2, Máx 5):");
            tamanosBarcos = new int[numeroBarcos];

            for (int i = 0; i < numeroBarcos; i++) {
                System.out.print("Barco " + (i + 1) + " :");
                if (teclado.hasNextInt()){
                    tamanosBarcos[i] = teclado.nextInt();
                    if (tamanosBarcos[i] < 2 || tamanosBarcos[i] > 5){
                        System.out.println("Introdúcelo de nuevo, tamaño incorrecto...");
                        i--;
                        continue;
                    }
                } else {
                    System.out.println("ERROR: Solo se admiten numeros...");
                    teclado.next();
                    i--;
                    continue;
                }
            }

        } else {
            System.out.println("ERROR: Cantidad de barcos incorrecta...");
        }

        return tamanosBarcos;
    }
    /**
     * Author Ivan
     * Version 1.0
     * Aqui se define el tablero
     * @param teclado
     * @return
     */
    public static int[][] tablero(Scanner teclado) {

        System.out.println("----------------------------------------------------");

        int tamanoTablero = 0;

        do {
            System.out.print("Introduce las dimensiones del tablero máximo 128x128: ");
            if (teclado.hasNextInt()){
                tamanoTablero = teclado.nextInt();
            } else {
                System.out.println("ERROR: No se admiten letras...");
                teclado.next();
            }

        } while (tamanoTablero < 1 || tamanoTablero > 128);

        int[][] tablero = new int[tamanoTablero][tamanoTablero];

        System.out.println("Rellena tu tablero:");

        for (int i = 0; i < tamanoTablero; i++) {
            for (int j = 0; j < tamanoTablero; j++) {
                System.out.print("Valor en [" + i + "][" + j + "]: ");
                String valor = teclado.next();

                if (valor.equals("0") || valor.equals("1")) {
                    tablero[i][j] = Integer.parseInt(valor);
                } else {
                    System.out.println("ERROR: Solo se permite 0 o 1.");
                    j--;
                }
            }
        }

        System.out.println("Tu tablero es:");
        for (int[] fila : tablero) {
            System.out.println(Arrays.toString(fila));
        }
        return tablero;
    }
    /**
     * Author Ivan
     * Version 1.0
     * Aqui se compara y se cuentan los barcos en el tablero y te lo printea por pantalla
     */
    public static void buscar_barcos(int[][] tablero) {

        int tamano = tablero.length;
        boolean[][] visitado = new boolean[tamano][tamano];

        int num_barcos_horizontal = 0;

        for (int i = 0; i < tablero.length; i++) {
            int contador_barcos = 0;

            for (int j = 0; j < tablero[i].length; j++) {

                if (tablero[i][j] == 1 && tablero[i + 1][j + 1] == 1){
                    contador_barcos++;
                } else {

                    if (contador_barcos >= 2) {
                        num_barcos_horizontal++;
                        System.out.println("Barco horizontal encontrado en fila " + i + " de tamaño " + contador_barcos);
                    }
                    contador_barcos = 0;
                }
            }

            if (contador_barcos >= 2) {
                num_barcos_horizontal++;
                System.out.println("Barco horizontal encontrado en fila " + i + " de tamaño " + contador_barcos);
            }
        }

        int barcosHorizontales = 0;
        int barcosVerticales = 0;

        for (int i = 0; i < tamano; i++) {
            int contador = 0;
            for (int j = 0; j < tamano; j++) {
                if (tablero[i][j] == 1 && !visitado[i][j]) {
                    contador++;
                } else {
                    if (contador >= 2) {
                        barcosHorizontales++;
                        int inicioBarco = j - contador;
                        for (int pos = inicioBarco; pos < j; pos++) {
                            visitado[i][pos] = true;
                        }
                        System.out.println("Barco horizontal encontrado en fila " + i + " de tamaño " + contador);
                    }
                    contador = 0;
                }
            }

            if (contador >= 2) {
                barcosHorizontales++;
                int inicioBarco = tamano - contador;
                for (int pos = inicioBarco; pos < tamano; pos++) {
                    visitado[i][pos] = true;
                }
                System.out.println("Barco horizontal encontrado en fila " + i + " de tamaño " + contador);
            }
        }

        for (int j = 0; j < tamano; j++) {
            int contador = 0;
            for (int i = 0; i < tamano; i++) {
                if (tablero[i][j] == 1 && !visitado[i][j]) {
                    contador++;
                } else {
                    if (contador >= 2) {
                        barcosVerticales++;
                        int inicioBarco = i - contador;
                        for (int pos = inicioBarco; pos < i; pos++) {
                            visitado[pos][j] = true;
                        }
                        System.out.println("Barco vertical encontrado en columna " + j + " de tamaño " + contador);
                    }
                    contador = 0;
                }
            }

            if (contador >= 2) {
                barcosVerticales++;
                int inicioBarco = tamano - contador;
                for (int pos = inicioBarco; pos < tamano; pos++) {
                    visitado[pos][j] = true;
                }
                System.out.println("Barco vertical encontrado en columna " + j + " de tamaño " + contador);
            }
        }

        int barcosTamanyo1 = 0;
        for (int i = 0; i < tamano; i++) {
            for (int j = 0; j < tamano; j++) {
                if (tablero[i][j] == 1 && !visitado[i][j]) {
                    barcosTamanyo1++;
                    System.out.println("Barco de tamaño 1 encontrado en [" + i + "][" + j + "]");
                    visitado[i][j] = true;
                }
            }
        }

        int total = barcosHorizontales + barcosVerticales + barcosTamanyo1;

        System.out.println("--------------------------------");
        System.out.println("Barcos horizontales: " + barcosHorizontales);
        System.out.println("Barcos verticales: " + barcosVerticales);
        System.out.println("Barcos de tamaño 1: " + barcosTamanyo1);
        System.out.println("TOTAL BARCOS: " + total);
    }
}
