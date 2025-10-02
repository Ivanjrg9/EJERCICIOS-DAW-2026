package org.example;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println(" Escribe un numero ");
        int num1 = teclado.nextInt();

        System.out.println(" Escribe otro numero ");
        int num2 = teclado.nextInt();

        System.out.println( " Escribe otro numero ");
        int num3 = teclado.nextInt();

        if (num1 == num2 || num1 == num3 || num2 == num3) {
            System.out.println("ERROR hay numeros introducidos que son iguales ");
        }else {
            if (num1 < num2 && num1 < num3) {
                System.out.println(" El numero " + num1 + " es el menor ");

                } else if (num2 < num1 && num2 < num3){
                    System.out.println(" El numero " + num2 + " es el menor ");

                }else {
                System.out.println(" El numero " + num3 + " es el menor ");

            }
        }










    }


}
