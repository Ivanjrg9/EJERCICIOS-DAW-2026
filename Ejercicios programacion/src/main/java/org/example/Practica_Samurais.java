package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Practica_Samurais {
    static void main() {
        Scanner teclado =new Scanner(System.in);
        Random aleatorio = new Random();

        final int POTENCIA_MAX=30;



        System.out.println("BIENVENID@ A LA BATALLA DE SAMURAIS");
        System.out.println("-----------------------------------------");
        System.out.println("EQUIPO 1");
        System.out.println("INTRODUCE LA POTENCIA DE TUS 7 SAMURAIS (POTENCIA MÁX 24 Y SEPARADOS POR ESPACIOS...):");
        String potencia= teclado.nextLine();


        if (potencia.length()==13){
            String vpotencia[] = potencia.split(" ");
            System.out.println(Arrays.toString(vpotencia));
        }else {
            System.out.println("ERROR: INTRODUCE SOLO 7 SAMURAIS...");

        }
        






























    }
}
