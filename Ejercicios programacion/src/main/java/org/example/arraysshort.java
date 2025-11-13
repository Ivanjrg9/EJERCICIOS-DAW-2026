package org.example;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class arraysshort {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        int vector[]= {7,5,10,2,1};
        int vector_copia[] = vector.clone();
        int pos = 0;

        System.out.println(Arrays.toString(vector_copia));

        Arrays.sort(vector_copia);
        int posicion = Arrays.binarySearch(vector_copia,20);
        System.out.println(posicion);

    }
}
