package org.example;

import java.util.Scanner;

public class Actividad {

    static void main() {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Escribe tu nombre"); // Escribir

        String nombre = teclado.nextLine();

        System.out.println("En que curso te encuentras?");
        String curso = teclado.next();

        System.out.println("Bienenido al curso!");

        System.out.println("introduce un numero...");
        int num1 = teclado.nextInt();

        System.out.println("introduce un segundo numero...");
        int num2 = teclado.nextInt();

        System.out.println("El resultado es..."+ num1 + num2);



        int resultado = num1+num2;
        System.out.println("El resultado es..." + resultado);

    }
}
