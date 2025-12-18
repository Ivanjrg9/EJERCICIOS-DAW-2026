package org.example.Programame;

import java.util.Scanner;

public class FlotaJuez {
    static void main() {
        Scanner tecaldo = new Scanner(System.in);

        while (true) {

            int numeroBarcos = tecaldo.nextInt();
            if (numeroBarcos == 0) {
                break;
            }

            int[] tamanosEsperados = new int[numeroBarcos];
            for (int i = 0; i < numeroBarcos; i++) {
                tamanosEsperados[i] = tecaldo.nextInt();
            }

            int tamanoTablero = tecaldo.nextInt();

            int[][] tablero = new int[tamanoTablero][tamanoTablero];
            boolean[][] usado = new boolean[tamanoTablero][tamanoTablero];

            for (int fila = 0; fila < tamanoTablero; fila++) {
                for (int columna = 0; columna < tamanoTablero; columna++) {
                    tablero[fila][columna] = tecaldo.nextInt();
                }
            }

            int[] tamanosEncontrados = new int[numeroBarcos];
            int barcosContados = 0;
            boolean tableroCorrecto = true;

            for (int fila = 0; fila < tamanoTablero && tableroCorrecto; fila++) {
                for (int columna = 0; columna < tamanoTablero && tableroCorrecto; columna++) {

                    if (tablero[fila][columna] == 1 && !usado[fila][columna]) {

                        int tamanoBarco = 0;
                        boolean esHorizontal = false;
                        boolean esVertical = false;

                        if (columna + 1 < tamanoTablero && tablero[fila][columna + 1] == 1) {
                            esHorizontal = true;
                        }
                        if (fila + 1 < tamanoTablero && tablero[fila + 1][columna] == 1) {
                            esVertical = true;
                        }

                        if (esHorizontal && esVertical) {
                            tableroCorrecto = false;
                        } else if (esHorizontal) {

                            int colActual = columna;
                            while (colActual < tamanoTablero && tablero[fila][colActual] == 1) {

                                for (int f = fila - 1; f <= fila + 1; f++) {
                                    for (int c = colActual - 1; c <= colActual + 1; c++) {
                                        if (f >= 0 && f < tamanoTablero && c >= 0 && c < tamanoTablero) {
                                            if (!(f == fila && c == colActual)
                                                    && tablero[f][c] == 1
                                                    && !usado[f][c]) {
                                                tableroCorrecto = false;
                                            }
                                        }
                                    }
                                }

                                if (!tableroCorrecto || usado[fila][colActual]) {
                                    tableroCorrecto = false;
                                    break;
                                }

                                usado[fila][colActual] = true;
                                tamanoBarco++;
                                colActual++;
                            }

                        } else if (esVertical) {

                            int filaActual = fila;
                            while (filaActual < tamanoTablero && tablero[filaActual][columna] == 1) {

                                for (int f = filaActual - 1; f <= filaActual + 1; f++) {
                                    for (int c = columna - 1; c <= columna + 1; c++) {
                                        if (f >= 0 && f < tamanoTablero && c >= 0 && c < tamanoTablero) {
                                            if (!(f == filaActual && c == columna)
                                                    && tablero[f][c] == 1
                                                    && !usado[f][c]) {
                                                tableroCorrecto = false;
                                            }
                                        }
                                    }
                                }

                                if (!tableroCorrecto || usado[filaActual][columna]) {
                                    tableroCorrecto = false;
                                    break;
                                }

                                usado[filaActual][columna] = true;
                                tamanoBarco++;
                                filaActual++;
                            }

                        } else {
                            // Barco de tamaño 1
                            for (int f = fila - 1; f <= fila + 1; f++) {
                                for (int c = columna - 1; c <= columna + 1; c++) {
                                    if (f >= 0 && f < tamanoTablero && c >= 0 && c < tamanoTablero) {
                                        if (!(f == fila && c == columna) && tablero[f][c] == 1) {
                                            tableroCorrecto = false;
                                        }
                                    }
                                }
                            }

                            usado[fila][columna] = true;
                            tamanoBarco = 1;
                        }

                        if (tableroCorrecto) {
                            if (barcosContados >= numeroBarcos) {
                                tableroCorrecto = false;
                            } else {
                                tamanosEncontrados[barcosContados] = tamanoBarco;
                                barcosContados++;
                            }
                        }
                    }
                }
            }

            if (barcosContados != numeroBarcos) {
                tableroCorrecto = false;
            }

            for (int i = 0; i < numeroBarcos && tableroCorrecto; i++) {
                boolean encontrado = false;
                for (int j = 0; j < numeroBarcos; j++) {
                    if (tamanosEsperados[i] == tamanosEncontrados[j]) {
                        tamanosEncontrados[j] = -1;
                        encontrado = true;
                        break;
                    }
                }
                if (!encontrado) {
                    tableroCorrecto = false;
                }
            }

            if (tableroCorrecto) {
                System.out.println("SI");
            } else {
                System.out.println("NO");
            }
        }
    }
}
