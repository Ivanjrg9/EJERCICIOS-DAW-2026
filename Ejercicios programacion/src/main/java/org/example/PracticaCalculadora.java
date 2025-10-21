package org.example;
import java.lang.runtime.SwitchBootstraps;
import java.util.Scanner;

public class PracticaCalculadora {
    static void main() {
        Scanner teclado = new Scanner(System.in);


        System.out.println("---BIENVENID@---");
        System.out.println(" ELIGE LA OPERACIÓN QUE VAS A REALIZAR ");
        System.out.println(" 1.(+) 2.(-) 3.(/) 4.(X) 5.(R) ");

        System.out.println(" Introduce un número ");
        double num = teclado.nextDouble();

        System.out.println(" Introduce otro número ");
        double num2 = teclado.nextDouble();

        String operacion = teclado.next();
        switch (operacion){

            case "+":



            case "-":

                System.out.println();






        }
    }
}
