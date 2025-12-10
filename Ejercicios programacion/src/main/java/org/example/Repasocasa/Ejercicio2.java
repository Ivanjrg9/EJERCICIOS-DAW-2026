package org.example.Repasocasa;

import java.util.Scanner;

public class Ejercicio2 {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce el primer numero:");
        int num1 = teclado.nextInt();

        System.out.println("Introduce el segundo numero:");
        int num2 = teclado.nextInt();

        int suma = num1+num2;
        System.out.println("Suma: " + suma);

        int resta = num1-num2;
        System.out.println("Resta: " + resta);

        int multiplicacion = num1*num2;

        System.out.println("Multiplicación: " + multiplicacion);

        try {
            int division = num1/num2;
            System.out.println("División: " + division);
        }catch (Exception error){
            System.out.println("Error, no se puede dividir entre 0...");
        }
    }
}
