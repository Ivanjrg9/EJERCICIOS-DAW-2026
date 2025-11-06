package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ejercicio4vectores {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        Random aleatorio = new Random();

        int vectororiginal[] = {3,4,5,4,9};

        int nuevovector[]= new int[vectororiginal.length-1];
        int posicion_borrar =3;


        for (int i = 0; i < nuevovector.length; i++) {

            if (i>=posicion_borrar){
                nuevovector[i]=vectororiginal[i+1];

            }else {
                nuevovector[i]=vectororiginal[i];

            }

        }
        System.out.println(Arrays.toString(nuevovector));

    }
}
