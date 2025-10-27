package org.example;

import java.util.Scanner;

public class practicaISBN {
    static void main() {
        Scanner teclado =new Scanner(System.in);


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


        switch (opcion_mayus){
            case "1":
                System.out.println("INTRODUZCA ISBN");
                String isbn = teclado.nextLine();
                String isbn_mayus = isbn.toUpperCase();

                if (isbn_mayus.length()==10){
                    int suma = 0;
                    boolean xnovalid = false;

                    for (int i= 0; i < 10; i++) {
                        String letrax = isbn_mayus.substring(i,i + 1);
                        int numero;

                        if (letrax.equals("X") && i != 9){
                            xnovalid = true;
                            break;
                        }

                        if (letrax.equals("x") || letrax.equals("X")){
                            numero = 10;
                        }else {
                            numero = Integer.parseInt(letrax);
                        }

                        int resultado = numero * (i + 1);
                        suma = suma + resultado;

                        System.out.println(numero + "x" + (i + 1) + "=" + resultado);

                    }

                    if (xnovalid){
                        System.out.println(" ERROR: LA LETRA (X) SOLO PUEDE IR EN LA ULTIMA POSICIÓN ");
                    }else {
                        System.out.println(" La suma total es: " + suma);

                    }

                    if (suma % 11 == 0){
                        System.out.println("EL ISBN " + isbn + " ES CORRECTO");

                    }else {
                        System.out.println("EL ISBN " + isbn + " ES INCORRECTO");

                    }

                }else {
                    System.out.println("ERROR: EL ISBN " + isbn + " ES INCORRECTO, DEBE TENER EXACTAMENTE 10 CARACTERES...");

                }

                break;

            case "2":
                System.out.println("INTRODUCE EL ISBN QUE DESEAS REPARAR PORFAVOR...");
                System.out.println("EL DIGITO FALTANTE MÁRCALO CON '?'");
                String isbnrepar = teclado.nextLine();

                if (isbnrepar.length()== 10 && isbnrepar.contains("?")){
                    int suma = 0;
                    int faltante = isbnrepar.indexOf("?");
                    int numfaltante = -1;


                    for (int i = 0; i < 10 ; i++) {
                        String letra = isbnrepar.substring(i, i + 1);
                        int numero;

                        if (letra.equals("?")){
                            numero = 0;
                        } else if (letra.equals("X")) {
                            numero = 10;

                        }else {
                            numero = Integer.parseInt(letra);

                        }

                        suma = suma + numero * (i + 1);

                    }

                    for (int j = 0; j < 10; j++) {
                        int total = suma + j * (faltante + 1);
                        if ( total % 11 == 0){
                            numfaltante = j;
                            break;

                        }
                    }

                    if (numfaltante == 10){
                        System.out.println(" EL HUECO FALTANTE ES IGUAL A: X");
                        System.out.println(" ISBN COMPLETO" + isbnrepar.substring(0,faltante) + "X" + isbnrepar.substring(faltante + 1));
                    } else if (numfaltante >= 0) {
                        System.out.println("EL DIGITO FALTANTE ES: " + numfaltante);
                        System.out.println("ISBN REPARADO " + isbnrepar.substring(0,faltante) + numfaltante + isbnrepar.substring(faltante + 1));

                    }else {
                        System.out.println(" NO SE HA PODIDO CALCULAR EL DIGITO CORRECTO ");

                    }

                }else {
                    System.out.println(" ERROR: EL ISBN DEBE TENER EXACTAMENTE 10 DIGITOS Y UN '?' INDICANDO LA POSICIÓN FALTANTE PARA PODER REPARARLO... ");
                }

                break;

            case "3":
                System.out.println("SALIENDO...");

                break;


            default:
                System.out.println(" INTRODUCE UNA OPCIÓN CORRECTA PORFAVOR...");

        }









    }
}
