package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class PracticaZXSpectrum {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        String[] columnapixel;


        System.out.println("**************************************************************************");
        System.out.println("                >VALIDADOR DE COMPATIBILIDAD ZX SPECTRUM<");
        System.out.println("**************************************************************************");

        System.out.println("Introduce la resolución de tu pantalla (Alto x Ancho): ");
        System.out.println(">(Ambos deben ser múltiplos de 8 y no mayores de 48)<");
        System.out.println("--------------------------------------------------------------------------");

        System.out.println("Ancho: ");
        int ancho = teclado.nextInt();

        System.out.println("Alto: ");
        int alto = teclado.nextInt();
        teclado.nextLine();

        if (alto % 8 == 0 && ancho % 8 == 0 && alto < 48 && ancho < 48){
            System.out.println("----------------------------------------------------------------------");
            System.out.println("                            Correcto!");
            System.out.println("----------------------------------------------------------------------");
            System.out.println("Introduce (línea a línea) los colores de tu imagen para cada píxel: ");

            String matriz[][] = new String[alto][ancho];

            for (int i = 0; i < alto; i++) {
                String filapixel= teclado.nextLine();

                if (filapixel.length() != ancho) {
                    System.out.println("ERROR: La línea debe tener exactamente " + ancho + " letras.");
                    i--;
                    continue;
                }
                if (!filapixel.matches("[a-oA-O]+")) {
                    System.out.println("ERROR: Solo puedes usar letras de la A a la O.");
                    i--;
                    continue;
                }
                columnapixel = filapixel.split("");

                for (int j = 0; j < ancho; j++) {
                    matriz[i][j] = columnapixel[j];
                }

            }

            for (String filas[]: matriz){
                System.out.println(Arrays.toString(filas));
            }
            
            


            



        }else {
            System.out.println("Error: Introduce solo múltiplos de 8 y que no sean mayores de 48...");
        }
















    }
}
