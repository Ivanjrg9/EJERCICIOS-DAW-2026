package org.example;

import java.util.Scanner;

public class Ejercicio4T2 {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        String texto = "Hola mundo, bienvenido a mundo. Mundo es genial.";
        String palabra = "mundo";

        texto = texto.toUpperCase();
        palabra = palabra.toUpperCase();

        int tamañyo_texto = texto.length();
        texto= texto.replace(palabra, "");

        int nuevo_tamañyo = texto.length();

        int vecesqueaparece = (tamañyo_texto - nuevo_tamañyo) / palabra.length();

        System.out.println(vecesqueaparece);




    }
}
