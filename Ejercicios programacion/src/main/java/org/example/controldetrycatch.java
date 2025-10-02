package org.example;

import java.util.Scanner;

public class controldetrycatch {
    static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.println( "Vamos a ver lo que he aprendido ");
        System.out.println(" Ejercicio para el try y el catch");

        System.out.println( " Vamos a realizar una sencilla division!! ");

        System.out.println( " Escribeme un numero el cual quieras dividir ");

        int num1 = teclado.nextInt();

        System.out.println( "Muy bien!!, ahora el numero por el cual lo quieras dividir ");

        int num2 = teclado.nextInt();

        try {
            int resultado = (num1 / num2);

            System.out.println(" El resultado es " + resultado );

        }catch (Exception error){

            System.out.println( " ERROR: No se puede dividir entre 0 ");

        }
        }




}
