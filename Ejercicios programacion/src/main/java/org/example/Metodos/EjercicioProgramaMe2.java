package org.example.Metodos;

public class EjercicioProgramaMe2 {
        static java.util.Scanner in;

        public static void main(String[] args) {
        in = new java.util.Scanner(System.in);
        while (casoDePrueba()) {
        }
             }

             public static boolean casoDePrueba() {
          int x= in.nextInt();
          int y= in.nextInt();
            if (x<0||y<0)
            return false;
        else {
            int perimetro = (x+y)*2;
                System.out.println(perimetro);
                return true;
        }
    }
}
