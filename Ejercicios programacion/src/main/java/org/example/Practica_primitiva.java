package org.example;

import java.util.Random;
import java.util.Scanner;

public class Practica_primitiva {
    static void main() {
        Scanner teclado= new Scanner(System.in);
        Random aleatorio = new Random();



        do {
            System.out.println("INTRODUCE LOS NÚMEROS DE TU BOLETO (DEL 0 AL 49 Y N-N-N-N-N-N/R)");
            String numeros_boleto= teclado.nextLine();
            boolean formato = numeros_boleto.matches("\\d{1,2}-\\d{1,2}-\\d{1,2}-\\d{1,2}-\\d{1,2}-\\d{1,2}-\\d{1}");

        }while ()

























    }
}
