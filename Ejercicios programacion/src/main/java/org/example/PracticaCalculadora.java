package org.example;
import java.lang.runtime.SwitchBootstraps;
import java.util.Scanner;

public class PracticaCalculadora {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        double num = 0;
        double num2 = 0;


        System.out.println("---BIENVENID@---");
        System.out.println(" Introduce un número ");
        if (teclado.hasNextDouble()){
            num = teclado.nextDouble();
        }else {
            System.out.println(" Formato incorrecto para el primer número... ");
            return;
        }

        System.out.println(" ELIGE LA OPERACIÓN QUE VAS A REALIZAR ");
        System.out.println(" 1.(+) 2.(-) 3.(/) 4.(*) 5.(R) ");

        String operacion = teclado.next();
        String formato_mayus = operacion.toUpperCase();


        if (formato_mayus.length()== 1){
            if ( formato_mayus.equals("R")){
                System.out.println( " Has elegido la Raíz cuadrada ");
                if ( num < 0 ){
                    System.out.println( " ERROR: No se puede ejecutar la raíz cuadrada de numeros negativos ");

                }else {
                    double resultado_raiz = Math.sqrt(num);
                    System.out.println(" El resultado de la Raíz cuadrada de " + num + " es: " + resultado_raiz);

                }

            }else {
                System.out.println(" Introduce otro número ");
                if (teclado.hasNextDouble()){
                    num2 = teclado.nextDouble();
                }else {
                    System.out.println(" Formato incorrecto para el segundo número... ");
                    return;
                }

            }

        }else {
            System.out.println(" ERROR: Introduce solo un operando porfavor... ");
        }


        switch (formato_mayus){

            case "+":
                System.out.println(" Has elegido sumar ");

                double resultado = num + num2;
                System.out.println(" El resultado de " + num + " + " + num2 + " es: " + resultado);

                break;

            case "-":
                System.out.println(" Has elegido restar ");

                double resultado_resta = num - num2;
                System.out.println(" El resultado de " + num + " - " + num2 + " es: " + resultado_resta);
                break;

            case "/":
                System.out.println(" Has elegido dividir ");

                    if ( num2 == 0 ){
                        System.out.println(" ERROR: Formato de la división incorrecto, divides entre 0... ");
                    }else {
                        double resultado_division = num / num2;
                        System.out.println(" El resultado de " + num + " / " + num2 + " es: " + resultado_division);
                    }
                break;

            case "*":
                System.out.println(" Has elegido multiplicar ");
                double resultado_multiplicacion = num * num2;
                System.out.println(" El resultado de " + num + " * " + num2 + " es: " + resultado_multiplicacion);
                break;

            case "R":

                break;

            default:
                System.out.println(" Elige una opcion correcta porfavor... ");













        }
    }
}
