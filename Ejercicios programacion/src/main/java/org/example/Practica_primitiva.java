package org.example;

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



        boolean correcto=true;
        String numeros_boleto;

        do {
            System.out.println("INTRODUCE LOS NÚMEROS DE TU BOLETO (DEL 0 AL 49 Y N-N-N-N-N-N/R)");
            numeros_boleto=teclado.nextLine();
            String num_voleto_vector[] = numeros_boleto.split("-");

            for (int i = 0; i < num_voleto_vector.length; i++) {
                if (i>49 || i<0){
                    System.out.println("ERROR INTRODUCE NUMEROS ENTRE 1 Y 49");
                    correcto=false;
                }
            }

            if (numeros_boleto.matches("\\d{1,2}-\\d{1,2}-\\d{1,2}-\\d{1,2}-\\d{1,2}-\\d{1,2}/\\d{1}")){
                correcto=true;

            }else {
                System.out.println("FORMATO INCORRECTO");
                correcto = false;
            }

        }while (correcto!=true);

        String numeros_boleto_vector[] = numeros_boleto.split("-/");

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

        num_reintegro= aleatorio.nextInt(9);
        System.out.println("*REINTEGRO: " + num_reintegro);
        System.out.println("--------------------------------------------------------------------");








    }

}


