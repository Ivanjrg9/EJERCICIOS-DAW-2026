package org.example;

import java.util.Scanner;

public class practicaISBN {
    static void main() {
        Scanner teclado =new Scanner(System.in);

        int suma = 0;
        int resta = 0;

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

        if (opcion.length() >1){
            System.out.println("INTRODUCE UNA UNICA OPCIÓN PORFAVOR");
        }else {

        }

        switch (opcion_mayus){
            case "1":
                System.out.println("INTRODUZCA ISBN");
                String isbn = teclado.nextLine();
                String isbn_mayus = isbn.toUpperCase();

                if (isbn_mayus.length()==10){

                    for (int i= 0; i < 10; i++) {
                        char x = isbn.charAt(i);

                        String numerostring = isbn.substring(i,i + 1);
                        int numero = Integer.parseInt(numerostring);
                        int resultado = numero * (10 - i);
                        int valorx;


                        if ( i == 'x'){
                            valorx = 10;

                        }else {

                        }

                        System.out.println(numero + "x" + (i + 1) + "="  + resultado);
                        suma = suma + resultado;

                    }

                    System.out.println(" La suma total es: " + suma);

                    if (suma % 11 == 0){
                        System.out.println("EL ISBN " + isbn + " ES CORRECTO");

                    }else {
                        System.out.println("EL ISBN " + isbn + " ES INCORRECTO");

                    }


                }else {
                    System.out.println("ERROR: EL ISBN " + isbn + " ES INCORRECTO...");

                }



                break;

            case "2":




                break;

            case "3":
                System.out.println("SALIENDO...");

                break;


            default:
                System.out.println(" INTRODUCE UNA OPCIÓN CORRECTA PORFAVOR...");

        }









    }
}
