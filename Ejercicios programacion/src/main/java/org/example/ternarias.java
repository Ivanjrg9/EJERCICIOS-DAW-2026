package org.example;

import java.util.Scanner;

public class ternarias {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        int a = 1, b = 2, c = 3;//caso 1
        int resultado = a++ == 2 && c > b++ ? a += b :
                a > 0 && a == b ? a += c :
                        a == c ? a++ : a--;
        System.out.println(resultado);


        resultado = a++ == 1 && a > b++ ? a += b :
                a > 0 && a == b ? a += c :
                        a == c ? a++ : a--;
        System.out.println(resultado);

    }
}
