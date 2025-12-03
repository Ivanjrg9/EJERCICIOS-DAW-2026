package org.example.EjerciciosdeEntornos;

import java.util.Scanner;

public class Ejercicio2 {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("***Bienvenido al intercambiador de letras***");
        System.out.println("-----------------------------------------------------");

        System.out.println("Cuantos casos de uso vas a introducir?");
        int casosdeuso = 0;
        try {
            casosdeuso = teclado.nextInt();
        } catch (Exception e) {
            System.out.println("Error, introduce solo numeros");
        }

        for (int i = 0; i < casosdeuso; i++) {
            String frases = teclado.nextLine();
            if (frases.length()>40){
                System.out.println("Error: La frase/palabra debe de tener maximo 40 letras");
            }

        }


    }
}
