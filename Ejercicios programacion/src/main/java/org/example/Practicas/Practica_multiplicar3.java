package org.example.Practicas;

public class Practica_multiplicar3 {
    static void main(String[] args){

        int num = 433;
        int num2 = 132;

        String num_string = Integer.toString(num); //Pasa de int a string ( hasta ahi hay aun 433) solo 1 vez
        System.out.println(num_string);
        String num_izquierda = num_string.substring(0,1);//coge un trozo de mi string
        String num_central = num_string.substring(1,2);
        String num_derecha = num_string.substring(2,3);
        int num_central_int = Integer.parseInt(num_central);
        int num_derecha_int = Integer.parseInt(num_derecha);
        int num_izquierda_int = Integer.parseInt(num_izquierda);
        System.out.println(num_derecha_int*num);
        System.out.println(num_central_int*num2);
        System.out.println(num_izquierda_int*num2);





        System.out.println(num_izquierda_int*num);

    }
}
