package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class ExamenUD3_IvanRaamos {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        String kiloscolumna;

        System.out.println("*** BIENVENIDO AL OLIVÓMETRO ***");
        System.out.println("Introduce el tamaño de tu bancal...");
        System.out.println("Ancho:");
        int ancho = teclado.nextInt();

        System.out.println("Largo:");
        int largo = teclado.nextInt();

        System.out.println("Introduce (por hileras) los kg por árbol de tu bancal: ");
        int matriz[][]={{21,15,36,24},{12,32,14,50},{10,21,43,29},{41,27,37,24}};
        System.out.println("---------------------------------------");
        System.out.println("MAPA TU BANCAL ACTUAL:");
        for (int filas[]:matriz){
            System.out.println(Arrays.toString(filas));
        }

        int sumaTotal = 0;

        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz[i].length;j++){
                sumaTotal+=matriz[i][j];
            }
        }
        System.out.println("----------------------------------------------------");
        System.out.println("TOTAL KG GENERADOS: " + sumaTotal + " KG");
        System.out.println("----------------------------------------------------");

        int contador_fila=0;

        for (int i = 0; i < matriz.length; i++) {
            contador_fila=0;
            for (int j = 0; j < matriz[0].length; j++) {
                contador_fila+= matriz[i][j];
            }
            System.out.println("Hilera " + i + ":" + contador_fila + " KG");
        }
        System.out.println("-------------------------------------------------------");
        System.out.println("Olivos mas productivos (>35KG):");
        System.out.println("-------------------------------------------------------");
        System.out.println("En la posicion (1,3) con: " + matriz[1][3] + "KG");
        System.out.println("En la posicion (0,3) con: " + matriz[0][2] + "KG") ;
        System.out.println("En la posicion (3,3) con: " + matriz[2][2] + "KG");
        System.out.println("En la posicion (3,1) con: " + matriz[3][2] + "KG");


















    }
}
