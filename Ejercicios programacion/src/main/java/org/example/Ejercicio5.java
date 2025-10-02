package org.example;

import java.util.Scanner;

public class Ejercicio5 {
    static void main(String[] args){
            Scanner teclado = new Scanner(System.in);
            System.out.println( " introduce el dividendo ");

            double num1 = teclado.nextDouble();

            System.out.println( " introduce el divisor ");

            double num2 = teclado.nextDouble();


            try {
                double resultado = num1 / num2;

                System.out.println(" El resultado es " + resultado);

            }catch (Exception error){
                System.out.println( " ERROR: no se puede dividir entre 0 ");










            }



    }
}







