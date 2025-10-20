package org.example;

import java.util.Scanner;

public class Switccase {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        int dia_semana = 2;

        switch (dia_semana){
            case 1:
                System.out.println("LUNES");

            case 2:
                System.out.println("MARTES");

            case 3:
                System.out.println("MIERCOLES");

            case 4:
                System.out.println("JUEVES");

            case 5:
                System.out.println("VIERNES");
                System.out.println("ENTRE SEMANA");
                break;

            case 6:
                System.out.println("SABADO");

            case 7:
                System.out.println("DOMINGO");
                System.out.println("FIN DE SEMANA");
                break;


            default:
                System.out.println("DIA NO VALIDO");





        }



    }
}
