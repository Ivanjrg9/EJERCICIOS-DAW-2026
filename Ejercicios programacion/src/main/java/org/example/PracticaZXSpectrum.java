package org.example;

import java.util.Scanner;

public class PracticaZXSpectrum {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("**************************************************************************");
        System.out.println("                 VALIDADOR DE COMPATIBILIDAD ZX SPECTRUM");
        System.out.println("**************************************************************************");

        System.out.println("Introduce la resolución de tu pantalla (Alto x Ancho): ");
        System.out.println(">(Ambos deben ser múltiplos de 8 y no mayores de 48)<");
        System.out.println("--------------------------------------------------------------------------");

        System.out.println("Alto: ");
        int alto = teclado.nextInt();

        System.out.println("Ancho: ");
        int ancho = teclado.nextInt();

        if (alto % 8 == 0 && ancho % 8 == 0 && alto < 48 && ancho < 48){
            System.out.println("----------------------------------------------------------------------");
            System.out.println("                            Correcto!");
            System.out.println("----------------------------------------------------------------------");
            System.out.println("Introduce (línea a línea) los colores de tu imagen para cada píxel: ");

        }else {
            System.out.println("Error: Introduce solo múltiplos de 8 y que no sean mayores de 48...");
        }








    }
}
