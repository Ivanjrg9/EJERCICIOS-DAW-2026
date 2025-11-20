package org.example;

import java.util.Scanner;

public class Ejercicio3Matricestablaprofes {
    static void main() {
        Scanner teclado = new Scanner(System.in);


        System.out.println("Hola!,cuantos estudiantes tienes?");
        int estudiantes = teclado.nextInt();

        System.out.println("Y cuantas asignaturas tienen??");
        int asignaturas = teclado.nextInt();

        for (int i = 0; i < estudiantes; i++) {
            System.out.println("Introduce el nombre del estudiante " + (i+1));
            String nombres = teclado.next();
        }

        for (int i = 0; i < asignaturas; i++) {
            System.out.println("Introduce la asignatura " + (i+1));
            String asignatura = teclado.next();

        }

        int Malumnosnotas[][]= new int[][]

    }
}
