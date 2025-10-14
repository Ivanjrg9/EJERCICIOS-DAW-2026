package org.example;

import java.util.Scanner;
public class Practicaencasa {
    static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        boolean repetir = true;
        int suma = 0;
        int num = 0;

        System.out.println( " Sumaremos numeros hasta que introduzcas el numero 0 ");

        do {
            try {
                System.out.print("Introduce un número: ");
                num = teclado.nextInt();
                if (num > 0) {
                    suma += num;
                } else if (num < 0) {
                    System.out.println("Número negativo ignorado.");
                } else if (num == 0) {
                    repetir = false; // cuando es 0, salimos
                }

            } catch (Exception error) {
                System.out.println("Error: entrada no válida.");
                teclado.nextLine(); // limpiar el buffer
            }
        } while (repetir);
        System.out.println("La suma total es: " + suma);



