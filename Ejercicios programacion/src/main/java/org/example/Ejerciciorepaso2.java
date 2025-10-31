package org.example;

import java.util.Scanner;

public class Ejerciciorepaso2 {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        //Ejercicio 2. Programa que dados dos números introducidos por teclado, uno real (base)
        // -que puede ser positivo o negativo- y un entero positivo (exponente), saque por pantalla el resultado de la potencia.
        // Por ejemplo: 56

        System.out.println("Introduce el primer numero...");
        int numbase = teclado.nextInt();

        System.out.println("Introduce el segundo numero...");
        int numexp = teclado.nextInt();
        int resultado = 1;

        if (numexp >0){

            for (int i = 0; i < numexp; i++) {
                resultado = numbase * resultado;

            }
            System.out.println(resultado);
        }else {
            System.out.println("El numero exponente debe de ser positivo... ");
        }


    }
}
