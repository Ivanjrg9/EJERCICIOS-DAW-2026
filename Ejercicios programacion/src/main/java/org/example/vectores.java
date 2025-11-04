package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class vectores {
    static void main() {
        Scanner teclado= new Scanner(System.in);

        int vector[]= {5,6,8,7,4};
        System.out.println(Arrays.toString(vector));

        String vector2 []= {"ivan" , "Jose", "Manu"};
        System.out.println(Arrays.toString(vector2));

        String vector3 []= new String[6];
        System.out.println(Arrays.toString(vector3));

        System.out.println(vector3);

        vector2=vector3.clone();



        int vectorito[]= new int[4];
        System.out.println(Arrays.toString(vectorito));
        System.out.println(vectorito.length);

        for (int i = 0; i < vectorito.length ; i++) {

            System.out.println("Numerito " + vectorito.length);

        }
    }
}
