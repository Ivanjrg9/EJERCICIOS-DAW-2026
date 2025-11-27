package org.example;

import java.util.Arrays;
import java.util.Formattable;
import java.util.Random;
import java.util.Scanner;

public class RepasoExamenup3 {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        Random aleatorio = new Random();


        System.out.println("BIENVENIDO AL CASINO");
        int numbolas = aleatorio.nextInt(30)+10;
        int vectorbolassorteo[] = new int[numbolas];

        for (int i = 0; i < vectorbolassorteo.length; i++) {
            vectorbolassorteo[i]=aleatorio.nextInt(89)+1;
        }

        boolean comprobar=true;

        while (comprobar) {
            comprobar=false;
            for (int i = 0; i <vectorbolassorteo.length -1; i++) {
                if (vectorbolassorteo[i]==vectorbolassorteo[i+1]) {
                    vectorbolassorteo[i] = aleatorio.nextInt(89) + 1;
                    Arrays.sort(vectorbolassorteo);
                    comprobar = true;
                }
            }
        }
        Arrays.sort(vectorbolassorteo);
        System.out.println(numbolas + " extraidas hasta ahora: " + Arrays.toString(vectorbolassorteo));

        System.out.println("INTRODUCE LOS DATOS DE TU CARTON:");

        String carton[][] = new String[3][3];

        for (int i = 0; i < 3; i++) {

            String filacarton;
            String[] filacartonvector;

            while (true) {
                System.out.println("Fila " + (i + 1) + ": (formato N-N-N)");

                filacarton = teclado.nextLine();
                filacartonvector = filacarton.split("-");

                // Validar formato exacto
                if (!filacarton.matches("\\d{1,2}-\\d{1,2}-\\d{1,2}")) {
                    System.out.println("ERROR → Formato incorrecto. Usa N-N-N");
                    continue;
                }
                // Validar rango 1–90
                boolean valido = true;
                for (int j = 0; j < filacartonvector.length; j++) {
                    int numero = Integer.parseInt(filacartonvector[j]);

                    if (numero < 1 || numero > 90) {
                        System.out.println("ERROR: Los números deben estar entre 1 y 90.");
                        valido = false;
                        break;
                    }
                }
                if (valido) break;   // Todo OK → salimos del while
            }

            // Rellenar la matriz 3x3
            for (int j = 0; j < 3; j++) {
                carton[i][j] = filacartonvector[j];
            }
        }
        System.out.println("Datos del carton introducidos:");
        for (String filas[] : carton){
            System.out.println(Arrays.toString(filas));
        }
        boolean hayLinea = false;

        for (int i = 0; i < 3; i++) {
            int aciertosFila = 0;

            for (int j = 0; j < 3; j++) {
                int valorCasilla = Integer.parseInt(carton[i][j]);

                // ¿Está esta casilla en el bombo?
                for (int bola : vectorbolassorteo) {
                    if (valorCasilla == bola) {
                        aciertosFila++;
                        break;
                    }
                }
            }

            if (aciertosFila == 3) {
                hayLinea = true;
                break;
            }
        }
        if (hayLinea) {
            System.out.println("¡HAS HECHO LÍNEA!");
        }

        int aciertosTotales = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                int valorCasilla = Integer.parseInt(carton[i][j]);

                for (int bola : vectorbolassorteo) {
                    if (valorCasilla == bola) {
                        aciertosTotales++;
                        break;
                    }
                }
            }
        }

        if (aciertosTotales == 9) {
            System.out.println("¡BINGO!");
        }
    }
}
