package org.example.Metodos;

import java.util.Scanner;

public class EjercicioProgramame1 {
    static Scanner Teclado;

    public static void main(String[] args) {
        Teclado = new Scanner(System.in);

        int numCasos = Teclado.nextInt();
        Teclado.nextLine();

        for (int i = 0; i < numCasos; i++){
            casoDePrueba();
        }

    }

    public static void casoDePrueba() {

        String persona[]= Teclado.nextLine().split(" ");
        System.out.println("Hola, " + persona[1] + ".");
    }
}

