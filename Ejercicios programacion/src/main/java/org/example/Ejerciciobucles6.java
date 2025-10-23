package org.example;

import java.util.Scanner;

public class Ejerciciobucles6 {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Cuantos numeros quieres sumar?");
        int veces = teclado.nextInt();

        for (int i = 0; i <= veces; i++) {
            System.out.println("Inserta numero:");
            int num = teclado.nextInt();
            System.out.println(num + veces);
            
        }
        
        

        


    }
}
