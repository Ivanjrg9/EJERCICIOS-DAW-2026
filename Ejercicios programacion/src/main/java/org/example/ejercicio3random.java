package org.example;

import java.util.Random;
import java.util.Scanner;

public class ejercicio3random {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        Random aleatorio= new Random();
        int numero = 0;

        System.out.println("GENERADOR DE NUMEROS ALEATORIOS");
        System.out.println("-------------------------------------");
        System.out.println(" Introduce el rango máximo ");
        int nummax = teclado.nextInt();

        System.out.println("Introduce el rango mínimo");
        int nummin = teclado.nextInt();
        System.out.println("Cuantos numeros aleatorios quieres??");
        int numerosaleatorios = teclado.nextInt();
        for (int i = 0; i < numerosaleatorios ; i++) {
            if (nummax>nummin){
                numero = aleatorio.nextInt(nummax - nummin + 1)+ nummin;
            }else {
                System.out.println(" Introducelo segun se te lo pido porfavor...");
            }
            System.out.println("Tu numero aleatorio es: " + numero);

        }





    }
}
