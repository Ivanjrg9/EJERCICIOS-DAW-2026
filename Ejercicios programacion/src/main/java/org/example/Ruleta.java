package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Ruleta {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        Integer vector[]= {3, 4, 4, 6, 3, 22, 33};

        if (Arrays.asList(vector).contains(22)){
            System.out.println("Esta");
        }else {
            System.out.println("No esta");
        }
    }
}
