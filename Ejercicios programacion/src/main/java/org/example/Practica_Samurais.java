package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Practica_Samurais {
    static void main() {
        Scanner teclado =new Scanner(System.in);
        Random aleatorio = new Random();

        final int POTENCIA_MAX=30;
        final int numero_equipos=2;
        final int numero_samurais=7;

        int equipo1[]= new int[numero_samurais];
        int equipo2[]= new int[numero_samurais];


        System.out.println("-----------------------------------------");
        System.out.println("*** BIENVENID@ A LA BATALLA DE SAMURAIS ***");
        System.out.println("-----------------------------------------");


        for (int i = 1; i < numero_equipos; i++) {
            int equipo[]= new int[numero_samurais];


            if (i == 1) { // Controla qué equipo es del que estás rellenando los datos
                equipo = equipo1;
            } else {
                equipo = equipo2;
            }









        }
    }
}
