package org.example.Metodos;

import java.util.Scanner;

public class Ejercicio4metodos {
    static void main() {

        double recaudacion[] = introducirRecaudacion();

        for (double reca : recaudacion){
            System.out.println(reca + " ");
        }

        System.out.println(diaMaximo(recaudacion));
    }

    public static double[] introducirRecaudacion(){

        Scanner teclado = new Scanner(System.in);

        double recaudacion[] =  new double[6];

        for (int i = 0; i < recaudacion.length; i++) {
            recaudacion[i] = teclado.nextDouble();
        }

        return recaudacion;

    }

    public static String diaMaximo(double recaudacion[]){

        double maximo = recaudacion[0];
        int dia = 0;

        for (int i = 0; i < recaudacion.length ; i++) {

            if (recaudacion[i]>maximo){
                maximo = recaudacion[i];
                dia = i;
            }
        }
        return diaSemana(dia);
    }

    public static String diaSemana (int dia_numero){

        switch(dia_numero){

            case 1:
                return "MARTES";

            case 2:
                return "MIÉRCOLES";

            case 3:
                return "JUEVES";

            case 4:
                return "VIERNES";

            case 5:
                return "SÁBADO";

            case 6:
                return "DOMINGO";

        }
        return " ";
    }
}

