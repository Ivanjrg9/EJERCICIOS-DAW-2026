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
            int equipo[];
            int suma = 0;

            if (i == 1) {
                equipo = equipo1;
            } else {
                equipo = equipo2;
            }

            do {
                System.out.println("EQUIPO " + i);
                System.out.println(" INTRODUCE TUS 7 SAMURAIS, POTENCIA MÁXIMA DEL EQUIPO:(30). ");
                String potencia = teclado.nextLine();
                String potencia_vector[] = potencia.split(" ");

                if (potencia_vector.length == numero_samurais){
                    for (int j = 0; j < numero_samurais; j++) {

                        try {
                            int potencia_num = Integer.parseInt(potencia);
                            
                        }catch (NumberFormatException error){

                        }

                    }
                }

                suma = 0;


            }while ();











        }
    }
}
