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

    }
}
