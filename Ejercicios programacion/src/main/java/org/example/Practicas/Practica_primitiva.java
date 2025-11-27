package org.example.Practicas;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Practica_primitiva {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        Random aleatorio = new Random();

        int num_sorteo[] = new int[6];
        int num_complementario = 0;
        int num_reintegro = 0;
        String numeros_boleto_vector[];

        boolean correcto=true;
        String numeros_boleto;


        do {
            correcto = true;

            System.out.println("INTRODUCE LOS NÚMEROS DE TU BOLETO (DEL 0 AL 49 Y N-N-N-N-N-N/R)");
            numeros_boleto = teclado.nextLine();
            numeros_boleto_vector = numeros_boleto.split("[-/]");

            if (!numeros_boleto.matches("\\d{1,2}-\\d{1,2}-\\d{1,2}-\\d{1,2}-\\d{1,2}-\\d{1,2}/\\d{1}")) {
                System.out.println("FORMATO INCORRECTO");
                correcto = false;
            }

            if (correcto) {
                for (int i = 0; i < numeros_boleto_vector.length; i++) {

                    int valor = Integer.parseInt(numeros_boleto_vector[i]);

                    if (valor < 1 || valor > 49) {
                        System.out.println("ERROR: LOS NÚMEROS INTRODUCIDOS TIENEN QUE ESTAR ENTRE 1 Y 49.");
                        correcto = false;
                        break;
                    }
                }
            }

        } while (!correcto);



        System.out.println("--------------------------------------------------------------------");
        System.out.println("TU ELECCIÓN ES: " + Arrays.toString(numeros_boleto_vector));
        System.out.println("--------------------------------------------------------------------");

        for (int i = 0; i < num_sorteo.length; i++) {
            num_sorteo[i] = aleatorio.nextInt(49) + 1;

            for (int j = 0; j < i; j++) {
                if (num_sorteo[i] == num_sorteo[j]) {
                    i--;
                    break;
                }
            }
        }

        Arrays.sort(num_sorteo);

        int auxiliar[] = new int[num_sorteo.length];
        int tam = 1;

        auxiliar[0] = num_sorteo[0];

        for (int i = 1; i < num_sorteo.length; i++) {
            if (num_sorteo[i] != num_sorteo[i - 1]) {
                auxiliar[tam] = num_sorteo[i];
                tam++;
            }
        }

        int limpio[] = new int[tam];
        int j = 0;

        for (int i = 0; i < auxiliar.length; i++) {
            if (auxiliar[i] != 0) {
                limpio[j] = auxiliar[i];
                j++;
            }
        }

        System.out.println("*HA SALIDO: ");
        System.out.println(Arrays.toString(limpio));

        num_complementario= aleatorio.nextInt(49)+1;
        System.out.println("*COMPLEMENTARIO: " + num_complementario);

        num_reintegro= aleatorio.nextInt(9)+1;
        System.out.println("*REINTEGRO: " + num_reintegro);
        System.out.println("--------------------------------------------------------------------");

        int acierto= 0;
        int reintegro= num_reintegro;
        int complementario= num_complementario;


        int boleto_original[]= new int[6];

        for (int i = 0; i < boleto_original.length; i++) {
            boleto_original[i]=Integer.parseInt(numeros_boleto_vector[i]);

            for (int k = 0; k < limpio.length; k++) {
                if (boleto_original[i]==limpio[k]){
                    acierto++;
                }
            }
        }
        boolean acierto_complementario = false;

        for (int i = 0; i < boleto_original.length; i++) {
            if (boleto_original[i] == complementario) {
                acierto_complementario = true;
                break;
            }
        }

        int reintegro_boleto = Integer.parseInt(numeros_boleto_vector[6]);

        boolean acierto_reintegro = false;
        if (reintegro_boleto == reintegro) {
            acierto_reintegro = true;
        }

        System.out.println("EL RESULTADO ES...");
        System.out.println("------------------------------------");
        System.out.println("ACERTADOS: " + acierto);
        System.out.println("COMPLEMENTARIO: " + acierto_complementario);
        System.out.println("REINTEGRO: " + acierto_reintegro);
        System.out.println("------------------------------------");

        switch (acierto) {
            case 6:
                System.out.println("¡HAS ACERTADO 6! — PREMIO: CATEGORÍA ESPECIAL");
                break;
            case 5:
                if (acierto_complementario) {
                    System.out.println("¡5 + COMPLEMENTARIO! — SEGUNDA CATEGORÍA");
                } else {
                    System.out.println("¡HAS ACERTADO 5! — TERCERA CATEGORÍA");
                }
                break;
            case 4:
                System.out.println("HAS ACERTADO 4 — CUARTA CATEGORÍA");
                break;
            case 3:
                System.out.println("HAS ACERTADO 3 — QUINTA CATEGORÍA (PREMIO PEQUEÑO)");
                break;
            case 2:
                if (acierto_reintegro) {
                    System.out.println("2 ACIERTOS + REINTEGRO — PREMIO");
                } else {
                    System.out.println("HAS ACERTADO 2 — SIN PREMIO");
                }
                break;
            case 1:
            case 0:
                if (acierto_reintegro) {
                    System.out.println("REINTEGRO ACIERTADO — TE DEVUELVEN EL DINERO");
                } else {
                    System.out.println("SIN PREMIO");
                }
                break;
        }


















    }

}


