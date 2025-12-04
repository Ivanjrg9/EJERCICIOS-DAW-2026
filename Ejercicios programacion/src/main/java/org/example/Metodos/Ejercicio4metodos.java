package org.example.Metodos;

import java.util.Scanner;

public class Ejercicio4metodos {
    static void main() {
        System.out.println("Introduce la recaudación:");
        System.out.println();


    }
    public static double[] recaudacion(){
        Scanner teclado = new Scanner(System.in);
        double recaudaciondiaria[]= new double[6];

        for (int i = 0; i < 6; i++) {
            recaudaciondiaria[i]=teclado.nextDouble();
        }
        return recaudaciondiaria;
    }
    public static String diamayorventa(){
        for (int i = 0; i < recaudacion().length; i++) {

        }
        return "";

    }
    public static String diamaximo(double recaudacion[]){

        double maximo = 0;
        int dia;

        for (int i = 0; i < recaudacion.length; i++) {
            if (recaudacion[i]>maximo){
                maximo= recaudacion[i];
                dia=i;
            }
        }
    }
    public static String diasemana(int dia_numero){
        switch (dia_numero){
            case 0:
                return "Martes";
                break;
            case 1:
                return "Miercoles";
                break;
            case 2:
                return "Jueves";
                break;
            case 3:
                return "Viernes";
                break;
            case 4:
                return "Sabado";
                break;
            case 5:
                return "Domingo";
                break;
        }
        return "";
    }
}
