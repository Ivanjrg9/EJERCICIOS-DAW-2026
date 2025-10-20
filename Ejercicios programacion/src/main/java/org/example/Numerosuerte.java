package org.example;
import java.util.Scanner;

public class Numerosuerte{
    static void main(){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce tu fecha de nacimineto (dd/mm/aaaa)");//Pedimos la fecha
        String fecha = teclado.nextLine();

        if (fecha.length() == 10 && fecha.charAt(2) == '/' && fecha.charAt(5) == '/') { //Asi evitamos que la fecha no sea incorrecta tipo: (aaaa/dd/mm)

            try {
                int  dia = Integer.parseInt(fecha.substring(0,2));
                int  mes = Integer.parseInt(fecha.substring(3,5));//convertimos a numero entero
                int  anyo = Integer.parseInt(fecha.substring(6,10));
                if (dia>= 1 && dia <= 31 && mes >=1 && mes <= 12){ //Asi evitamos que los dias y los meses no excedan el limite natural
                    int total = dia + mes + anyo;

                    System.out.println(fecha + " = " + total);

                    String Suerte = Integer.toString(total);

                    int cifra1 = Integer.parseInt(Suerte.substring(0,1));
                    int cifra2 = Integer.parseInt(Suerte.substring(1,2));//Mismo proceso que con los dias, meses, años
                    int cifra3 = Integer.parseInt(Suerte.substring(2,3));
                    int cifra4 = Integer.parseInt(Suerte.substring(3,4));


                    int total2 = cifra1 + cifra2 + cifra3 + cifra4; //Calculamos el numero de la suerte

                    System.out.println(cifra1 + "+" + cifra2 + "+" + cifra3 + "+" + cifra4 + " = " + total2 );
                    System.out.println(" Tu numero de la suerte es el " + total2);
                }else{
                    System.out.println(" ERROR: Introduce una fecha válida... "); // Si los dias o meses exceden el límite natural salta este error
                }

            }catch (Exception err){ //Si introducimos letras en lugar de números dara error
                System.out.println(" ERROR: Introduce el formato correctamente ");
            }

        }else{ //Si el formato no es correcto o introducimos números negativos o cualquier otra cosa dara error también
            System.out.println(" ERROR: Introduce el formato correctamente... ");
        }
























    }
}
