package org.example.Metodos;

import java.util.Scanner;

public class Ejercicio3metodos {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce una frase:");
        String frase = teclado.nextLine();
        frase=mayusculas(frase);
        System.out.println(frase);
        System.out.println("Hay " + contarvocales(frase) + " vocales");




    }
    public static String mayusculas(String frase){

        return frase.toUpperCase();
    }

    public static int contarvocales(String frase){
        int contadorvocales = 0;
        for (int i = 0; i < frase.length(); i++) {

            switch (frase.charAt(i)){
                case 'A':
                case 'E':
                case'I':
                case 'O':
                case 'U':
                    contadorvocales++;
                    break;

            }
        }
        return contadorvocales;
    }
}
