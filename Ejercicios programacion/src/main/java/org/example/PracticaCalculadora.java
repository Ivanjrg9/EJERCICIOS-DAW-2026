package org.example;
import java.lang.runtime.SwitchBootstraps;
import java.util.Scanner;

public class PracticaCalculadora {
    static void main() {
        Scanner teclado = new Scanner(System.in);


        System.out.println("---BIENVENID@---");

        System.out.println(" Introduce un número ");
        double num = teclado.nextDouble();

        System.out.println(" Introduce otro número ");
        double num2 = teclado.nextDouble();

        System.out.println(" ELIGE LA OPERACIÓN QUE VAS A REALIZAR ");
        System.out.println(" 1.(+) 2.(-) 3.(/) 4.(*) 5.(R) ");



        String operacion = teclado.next();
        switch (operacion){

            case "+":
                System.out.println(" Has elegido sumar ");

                double resultado = num + num2;
                System.out.println("El resultado de la suma es: " + resultado);
                break;

            case "-":
                System.out.println(" Has elegido restar ");

                double resultado_resta = num - num2;
                System.out.println(" El resultado de la resta es:" + resultado_resta);
                break;

            case "/":
                System.out.println(" Has elegido dividir ");
                try {
                    double resultado_division = num / num2;
                    System.out.println(" El resultado de la divión es: " + resultado_division);

                }catch (Exception error){
                    System.out.println(" ERROR: Formato de la división incorrecto... ");
                }
                break;

            case "*":
                System.out.println(" Has elegido multiplicar ");
                double resultado_multiplicacion = num * num2;
                System.out.println( " El resultado de la multiplicación es: " + resultado_multiplicacion);
                break;

            case "R":
                











        }
    }
}
