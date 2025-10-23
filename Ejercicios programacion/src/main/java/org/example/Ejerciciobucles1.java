package org.example;

import java.util.Scanner;

public class Ejerciciobucles1 {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        String contrasenya = "admin1234";



        do {
            System.out.println(" Introduce una contraseña ");
            String respuesta = teclado.nextLine();

            if (respuesta.equals(contrasenya)){
                System.out.println(" Contraseña correcta ");
                break;

            }
            System.out.println(" Contraseña incorrecta");

        }while (true);


        while (true){


            System.out.println(" Inserte una palabra (o salir): ");
            String palabra = teclado.nextLine();

            if (palabra.equals("salir")){
                System.out.println(" Saliendo... ");
                break;
            }

            if (palabra.equals("Anulado")){
                System.out.println("Palabra prohibida");
                continue;
            }

            System.out.println(palabra + " GOL ");
        }

        for (int i=0; i<20; i++){

            if (i %2 ==0){
                continue;

            }
            System.out.println(i);




        }










    }
}
