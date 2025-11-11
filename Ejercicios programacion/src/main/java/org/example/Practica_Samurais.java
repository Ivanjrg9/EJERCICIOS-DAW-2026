package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Practica_Samurais {
    static void main() {
        Scanner teclado =new Scanner(System.in);
        Random aleatorio = new Random();

        final int POTENCIA_MAX = 30;
        final int NUM_EQUIPOS = 2;
        final int NUM_SAMURAIS = 7;

        int[] equipo1 = new int[NUM_SAMURAIS];
        int[] equipo2 = new int[NUM_SAMURAIS];

        System.out.println("-----------------------------------------");
        System.out.println("*** BIENVENID@ A LA BATALLA DE SAMURAIS ***");
        System.out.println("-----------------------------------------");

        for (int numEquipo = 1; numEquipo <= NUM_EQUIPOS; numEquipo++) {

            int[] equipo;
            if (numEquipo == 1) {
                equipo = equipo1;
            } else {
                equipo = equipo2;
            }

            boolean correcto = false;

            do {
                System.out.println("* EQUIPO " + numEquipo + ", TU TURNO *");
                System.out.println("INTRODUCE LAS 7 POTENCIAS DE TUS SAMURAIS (SEPARADOS POR COMAS):");

                String potencia = teclado.nextLine();
                String[] potencia_vector = potencia.split(",");

                if (potencia_vector.length != NUM_SAMURAIS) {
                    System.out.println("ERROR: DEBES INTRODUCIR EXACTAMENTE 7 NÚMEROS SEPARADOS POR COMAS (,)");
                    continue;
                }

                int suma = 0;
                try {
                    for (int i = 0; i < NUM_SAMURAIS; i++) {
                        int valor_potencia= Integer.parseInt(potencia_vector[i]);

                        if (valor_potencia < 1 || valor_potencia > 24) {
                            System.out.println("ERROR: CADA SAMURAI DEBE TENER LA POTENCIA ENTRE 1 Y 24...");
                            break;
                        }

                        equipo[i] = valor_potencia;
                        suma += valor_potencia;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("ERROR: SOLO PUEDES INTRODUCIR NUMEROS ENTEROS...");
                    continue;
                }

                if (suma == POTENCIA_MAX) {
                    System.out.println("EQUIPO " + numEquipo + " CREADO CORRECTAMENTE.");
                    correcto = true;
                } else {
                    System.out.println("ERROR: LA SUMA TOTAL DEBE SER 30 Y HAS PUESTO: " + suma);
                }

            } while (!correcto);
        }

        System.out.println("-------------------------------------------------");
        System.out.println("*** ¡¡EMPIEZA LA BATALLA!! ***");
        System.out.println("-------------------------------------------------");

        int batalla = aleatorio.nextInt(7);
        System.out.println(" LA BATALLA COMIENZA CON EL SAMURAI " + (batalla + 1) + ".");

        int muertos1 = 0;
        int muertos2 = 0;

        while (muertos1 < 4 && muertos2 < 4){

            if (equipo1[batalla] == 0 && equipo2[batalla] == 0) {
                batalla++;
                if (batalla == 7) {
                    batalla = 0;
                }
                continue;
            }

            int samuraie1 = equipo1[batalla];
            int samuraie2 = equipo2[batalla];

            System.out.println(" * SAMURAI " + (batalla + 1) + ".");
            if (samuraie1 == samuraie2) {
                System.out.println("EMPATE... AMBOS SAMURAIS MUEREN. " + samuraie1 + " vs " + samuraie2);
                equipo1[batalla] = 0;
                equipo2[batalla] = 0;
                muertos1++;
                muertos2++;

            } else if (samuraie1 > samuraie2) {
                System.out.println("GANA EL EQUIPO 1. " + samuraie1 + " vs " + samuraie2);
                equipo2[batalla] = 0;
                muertos2++;

            } else {
                System.out.println("GANA EL EQUIPO 2. " + samuraie1 + " vs " + samuraie2);
                equipo1[batalla] = 0;
                muertos1++;
            }

            batalla++;

            if (batalla == 7) {
                batalla = 0;
            }
        }

        if (muertos1 >= 4 && muertos2 >= 4) {
            System.out.println("> EMPATE. LOS DOS EQUIPOS HAN PERDIDO DEMASIADOS SAMURAIS.");

        } else if (muertos1 >= 4) {
            System.out.println("> ¡EQUIPO 2 GANA! EL EQUIPO 1 HA TENIDO " + muertos1 + " MUERTOS.");

        } else {
            System.out.println("> ¡EQUIPO 1 GANA! EL EQUIPO 2 HA TENIDO " + muertos2 + " MUERTOS.");
        }
    }
}
