package org.example;

import java.util.Scanner;

public class Practicaencasa {
    static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
       System.out.println( "Vamos a realizar una sencilla division ");
       System.out.println( " introduce el dividendo ");

       int num1 = teclado.nextInt();

       System.out.println( " introduce el divisor ");

       try {
           int num2 = teclado.nextInt();

           int resultado = num1 / num2;

           System.out.println(" El resultado es " + resultado);

       }catch (Exception error){

         System.out.println( " Error: No se puede dividir entre 0 ");

       }

    }


}
