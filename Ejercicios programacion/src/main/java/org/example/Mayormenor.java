package org.example;

import java.util.Scanner;

public class Mayormenor {
    static void main() {
        System.out.println("Introduce un numero");
             Scanner teclado = new Scanner(System.in);

        int numero = teclado.nextInt();

        if (numero > 0){
            System.out.println("El numero " + numero + " Es POSITIVO");

        }else{
            if (numero<0) {
                System.out.println("El numero " + numero + " es NEGATIVO");
            }else {
                System.out.println("El numero " + numero + " es NATURAL");

            }



        }


}
    }
