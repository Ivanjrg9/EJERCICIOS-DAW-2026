package org.example;

import java.util.Scanner;

public class practicaISBN {
    static void main() {
        Scanner teclado =new Scanner(System.in);

        int X = 10;

        System.out.println("***VALIDADOR DE ISBN***");
        System.out.println("-----------------------------");
        System.out.println("ELIGE UNA OPCIÓN");
        System.out.println("-----------------------------");
        System.out.println("{1} VALIDAR");
        System.out.println("{2} REPARAR");
        System.out.println("{3} SALIR...");
        System.out.println("-----------------------------");

        String opcion = teclado.nextLine();
        String opcion_mayus = opcion.toUpperCase();

        switch (opcion_mayus){
            case "1":
                System.out.println("INTRODUZCA ISBN");
                String isbn = teclado.nextLine();
                if (isbn.length()==10){

                }else {
                    System.out.println("ERROR: ISBN INCORRECTO...");
                }



                break;

            case "2":




                break;

            case "3":
                System.out.println("SALIENDO...");

                break;

        }









    }
}
