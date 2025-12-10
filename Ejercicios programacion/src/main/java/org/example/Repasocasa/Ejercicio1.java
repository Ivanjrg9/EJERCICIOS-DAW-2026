package org.example.Repasocasa;

import java.util.Scanner;

public class Ejercicio1 {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Dime tu nombre:");
        String nombre = teclado.nextLine();

        System.out.println("Dime tu edad:");
        int edad = teclado.nextInt();

        System.out.println("Hola " + nombre + " , tienes " + edad + " años."  );
    }
}
