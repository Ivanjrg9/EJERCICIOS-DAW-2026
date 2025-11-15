package org.example;

import java.util.Random;
import java.util.Scanner;

public class Practica_primitiva {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        Random aleatorio = new Random();

        boolean correcto=true;
        String numeros_boleto;


        do {
            System.out.println("INTRODUCE LOS NÚMEROS DE TU BOLETO (DEL 0 AL 49 Y N-N-N-N-N-N/R)");
            numeros_boleto=teclado.nextLine();
            String num_voleto_array[] = numeros_boleto.split("-");

            for (int i = 0; i < num_voleto_array.length; i++) {
                if (i>49 || i<0){
                    System.out.println("ERROR INTRODUCE NUMEROS ENTRE 1 Y 49");
                    correcto=false;
                }
            }

            if (numeros_boleto.matches("\\d{1,2}-\\d{1,2}-\\d{1,2}-\\d{1,2}-\\d{1,2}-\\d{1,2}-\\d{1}")){
                correcto=true;

            }else {
                System.out.println("FORMATO INCORRECTO");
                correcto=false;
            }

        }while (correcto!=true);










    }

}
