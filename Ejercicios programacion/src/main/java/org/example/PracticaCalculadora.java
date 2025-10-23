package org.example;
import java.lang.runtime.SwitchBootstraps;
import java.util.Scanner;

public class PracticaCalculadora {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        //Definimos las variables
        double num = 0;
        double num2 = 0;
        double resultado_raiz;


        System.out.println("---BIENVENID@---");
        System.out.println(" Introduce un número ");
        if (teclado.hasNextDouble()){ //Pedimos exclusivamente un numero
            num = teclado.nextDouble();
        }else {
            System.out.println(" Formato incorrecto para el primer número... ");//Sino saltara este error
            return;
        }

        System.out.println(" ELIGE LA OPERACIÓN QUE VAS A REALIZAR ");
        System.out.println(" 1.(+) 2.(-) 3.(/) 4.(*) 5.(R) ");

        String operacion = teclado.next(); //Nos introducen la operacion a realizar
        String formato_mayus = operacion.toUpperCase();//El programa leerá siempre la operacion en formato mayuscula (en el caso de la R)


        if (formato_mayus.length()== 1){ //Para que no nos introduzcan varias operaciones a la vez
            if ( formato_mayus.equals("R")){ //En el caso de que el usuario elija la raiz cuadrada
                if ( num < 0 ){ //Por si se le ocurre hacer la raiz cuadrada de negativos
                    System.out.println( " ERROR: No se puede ejecutar la raíz cuadrada de numeros negativos ");

                }else {
                    System.out.println( " Has elegido la Raíz cuadrada ");// Aqui se ejecutara la raiz cuadrada en caso de que haya presionado la "R" y haya pasado los filtros del if del principio
                    resultado_raiz = Math.sqrt(num);
                    System.out.println(" El resultado de la Raíz cuadrada de " + num + " es: " + resultado_raiz);
                }

            }else {
                System.out.println(" Introduce otro número ");
                if (teclado.hasNextDouble()){ // Mismo proceso que arriba pero para pedir un segundo numero
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
                System.out.println(" Has elegido sumar ");// Aqui se ejecutara la suma en caso de que haya presionado el "+"

                double resultado = num + num2;
                System.out.println(" El resultado de " + num + " + " + num2 + " es: " + resultado);

                break;

            case "-":
                System.out.println(" Has elegido restar ");// Aqui se ejecutara la resta en caso de que haya presionado el "-"

                double resultado_resta = num - num2;
                System.out.println(" El resultado de " + num + " - " + num2 + " es: " + resultado_resta);
                break;

            case "/":
                System.out.println(" Has elegido dividir ");// Aqui se ejecutara la division en caso de que haya presionado el "/"

                    if ( num2 == 0 ){
                        System.out.println(" ERROR: Formato de la división incorrecto... ");
                    }else {
                        double resultado_division = num / num2;
                        System.out.println(" El resultado de " + num + " / " + num2 + " es: " + resultado_division);
                    }
                break;

            case "*":
                System.out.println(" Has elegido multiplicar ");// Aqui se ejecutara la multiplicacion en caso de que haya presionado el "*"
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
