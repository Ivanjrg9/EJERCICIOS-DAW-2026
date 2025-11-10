package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Practica_Samurais {
    static void main() {
        Scanner teclado =new Scanner(System.in);
        Random aleatorio = new Random();

        final int POTENCIA_MAX=30;
        int suma =0;


        System.out.println("BIENVENID@ A LA BATALLA DE SAMURAIS");
        System.out.println("-----------------------------------------");
        System.out.println("EQUIPO 1");
        System.out.println("INTRODUCE LA POTENCIA DE TUS 7 SAMURAIS (POTENCIA MÁX 24 Y SEPARADOS POR ESPACIOS...):");
        String potencia= teclado.nextLine();
        String vpotencia[] = potencia.split(" ");

        if (vpotencia.length ==7){
            System.out.println(Arrays.toString(vpotencia));

            for (int i = 0; i < vpotencia.length; i++) {
                suma += Integer.parseInt(vpotencia[i]);
            }

        }else {
            System.out.println("ERROR: INTRODUCE SOLO 7 SAMURAIS...");
        }
        if (suma>POTENCIA_MAX){
            System.out.println("ERROR: LA SUMA TOTAL NO SUMA 30...");

        }else {
            System.out.println("Equipo 1 completo!");
        }
        System.out.println("----------------------------------");

        System.out.println("EQUIPO 2, TU TURNO...");
        System.out.println("INTRODUCE LA POTENCIA DE TUS 7 SAMURAIS (POTENCIA MÁX 24 Y SEPARADOS POR ESPACIOS...):");
        String potencia2 = teclado.nextLine();
        String vpotencia2[]= potencia2.split(" ");








































    }
}
