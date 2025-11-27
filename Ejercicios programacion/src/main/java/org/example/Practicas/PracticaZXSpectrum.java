package org.example.Practicas;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class PracticaZXSpectrum {
    static void main() {
        Scanner teclado = new Scanner(System.in);


        System.out.println("**************************************************************************");
        System.out.println("                >VALIDADOR DE COMPATIBILIDAD ZX SPECTRUM<");
        System.out.println("**************************************************************************");

        System.out.println("Introduce la resolución de tu pantalla (Alto x Ancho): ");
        System.out.println(">(Ambos deben ser múltiplos de 8 y no mayores de 48)<");
        System.out.println("--------------------------------------------------------------------------");

        String[] columnapixel;

        int ancho = 0;
        int alto = 0;

        try {
            System.out.println("Ancho: ");
            ancho = teclado.nextInt();

            System.out.println("Alto: ");
            alto = teclado.nextInt();
            teclado.nextLine();
        } catch (InputMismatchException E) {
            System.out.println("Error: Debes introducir solo numeros...");
            return;

        }

        if (alto % 8 == 0 && ancho % 8 == 0 && alto < 48 && ancho < 48){//Creamos el filtro para que sean multiplos y no mayores de 48 los datos de la resolucion
            System.out.println("----------------------------------------------------------------------");
            System.out.println("                            Correcto!");
            System.out.println("----------------------------------------------------------------------");
            System.out.println("Introduce (línea a línea) los colores de tu imagen para cada píxel: ");

            String matriz[][] = new String[alto][ancho];//Creamos matriz

            for (int i = 0; i < alto; i++) {
                String filapixel= teclado.nextLine();//Pedimos las filas de letras

                if (filapixel.length() != ancho) {//Comprobamos que coincida exactamente con el numero de ancho que hayamos puesto
                    System.out.println("ERROR: La línea debe tener exactamente " + ancho + " letras.");
                    i--;//Si salta el error la i vuelve 1 para atras para que no cuente el error como dato valido
                    continue;
                }
                if (!filapixel.matches("[a-oA-O]+")) {//Nos aseguramos de que no introduzca ninguna letra que no entre en el rango introducido
                    System.out.println("ERROR: Solo puedes usar letras de la A a la O.");
                    i--;//Igual que antes, si hay error la i vuelve atras y no cuenta
                    continue;
                }
                columnapixel = filapixel.split("");//pasamos a vector los datos introducidos para asi poder utilizarlos en una matriz

                for (int j = 0; j < ancho; j++) { //rellenamos la matriz
                    matriz[i][j] = columnapixel[j];
                }

            }
            for (String filas[]: matriz){ //printeamos la matriz
                System.out.println(Arrays.toString(filas));
            }

            int contador=0; //Y aqui me quedo, he intentado esto que ves a continuacion pero sin exito, antes que usar el chat gpt prefiero entregarte esto... lo siento :(

            for (int i = 0; i < matriz.length; i+=8) {

                for (int j = 0; j < matriz[i].length; j+=8) {
                    if (matriz[i]==matriz[j]){
                        contador++;
                    }
                }
            }
            if (contador>3){
                System.out.println("No es compatible con ZXSpectrum");
            }else {
                System.out.println("Es compatible con ZXSpectrum");
            }

        }else {
            System.out.println("Error: Introduce solo múltiplos de 8 y que no sean mayores de 48...");
        }
    }
}
