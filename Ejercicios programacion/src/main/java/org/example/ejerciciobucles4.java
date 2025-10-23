package org.example;

import java.util.Scanner;

public class ejerciciobucles4 {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        String cadena = teclado.nextLine();

        int tamanyo = cadena.length();

        for (int i=tamanyo-1;i>=0;i--){

            System.out.println(cadena.charAt(i));

        }
    }
}
