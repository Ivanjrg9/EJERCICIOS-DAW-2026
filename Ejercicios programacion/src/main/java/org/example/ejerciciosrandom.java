package org.example;

import java.util.Random;
import java.util.Scanner;

public class ejerciciosrandom {
    static void main() {

        Random aleatoio = new Random();
        System.out.println(" El dado ha sacado el: ");

        int numerodado = aleatoio.nextInt(6)+ 1;
        System.out.println(numerodado);


    }
}
