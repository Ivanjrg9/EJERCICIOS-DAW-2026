package org.example;

import java.util.Scanner;

public class practicaISBN {
    static void main() {
        Scanner teclado =new Scanner(System.in);


<<<<<<< HEAD
        System.out.println("***VALIDADOR DE ISBN***");
=======
        System.out.println("***VALIDADOR DE ISBN***"); //INTRODUCIMOS EL PROGRAMA
>>>>>>> bfb0fb05e92cbd97be59e7bd9fbd9e32f633dcfa
        System.out.println("-----------------------------");
        System.out.println("ELIGE UNA OPCIÓN");
        System.out.println("-----------------------------");
        System.out.println("{1} VALIDAR");
        System.out.println("{2} REPARAR");
        System.out.println("{3} SALIR...");
        System.out.println("-----------------------------");

        String opcion = teclado.nextLine();
        String opcion_mayus = opcion.toUpperCase();//Pasamos la eleccion a mayuscula


        switch (opcion_mayus){
            case "1":
                System.out.println("INTRODUZCA ISBN");
                String isbn = teclado.nextLine();
                String isbn_mayus = isbn.toUpperCase();

                if (isbn_mayus.length()==10){//Si el isbn introducido mno tiene exactamente 10 caracteres dara error
                    int suma = 0;
                    boolean xnovalid = false;

                    for (int i= 0; i < 10; i++) {//Comenzamos el bucle dandole 10 vueltas, una por cada numero
                        String letrax = isbn_mayus.substring(i,i + 1);
                        int numero;

                        if (letrax.equals("X") && i != 9){// Si la letra actual es "X" y no está en la última posición (posición 9)
                            xnovalid = true;// Marca que hay un error porque la X solo puede ir al final

                        }

<<<<<<< HEAD
                        if (letrax.equals("X")){
                            numero = 10;
=======
                        if (letrax.equals("x") || letrax.equals("X")){// Si la letra es "x" o "X"
                            numero = 10;// La X vale 10

>>>>>>> bfb0fb05e92cbd97be59e7bd9fbd9e32f633dcfa
                        }else {
                            numero = Integer.parseInt(letrax);// Si no, convierte la letra en número
                        }

                        int resultado = numero * (i + 1);// Multiplica el número por su posición (i + 1)
                        suma = suma + resultado;// Suma el resultado total

                        System.out.println(numero + "x" + (i + 1) + "=" + resultado);

                    }

                    if (xnovalid){// Si la X no estaba al final
                        System.out.println(" ERROR: LA LETRA (X) SOLO PUEDE IR EN LA ULTIMA POSICIÓN ");

                    }else {
                        System.out.println(" La suma total es: " + suma);

                    }

                    if (suma % 11 == 0){// Comprueba si el ISBN es correcto
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
                String isbnrepar = teclado.nextLine();// Pide el ISBN con un '?'

                if (isbnrepar.length()== 10 && isbnrepar.contains("?")){// Comprueba que tenga 10 caracteres y contenga '?'
                    int suma = 0;
                    int faltante = isbnrepar.indexOf("?");// Guarda la posición del '?'
                    int numfaltante = -1;// Inicializa el número faltante


                    for (int i = 0; i < 10 ; i++) {
                        String letra = isbnrepar.substring(i, i + 1);
                        int numero;

                        if (letra.equals("?")){
                            numero = 0;// El signo de pregunta vale 0 temporalmente
                        } else if (letra.equals("X")) {
                            numero = 10;// La X vale 10

                        }else {
                            numero = Integer.parseInt(letra);// Convierte a número

                        }

                        suma = suma + numero * (i + 1);

                    }

                    for (int j = 0; j < 10; j++) { // Prueba los valores del 0 al 10 para encontrar el correcto
                        int total = suma + j * (faltante + 1);

                        if ( total % 11 == 0){
                            numfaltante = j;// Si el ISBN es válido, guarda el número

                        }
                    }

                    if (numfaltante == 10){  // Si el número faltante es 10, se representa como X
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
                System.out.println("SALIENDO...");// Sale del programa

                break;


            default:
                System.out.println(" INTRODUCE UNA OPCIÓN CORRECTA PORFAVOR..."); // Opción inválida

        }

    }
}
