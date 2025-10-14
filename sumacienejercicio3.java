import java.io. *;

public class sumacien {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		double contador = 1;
		double num;
		double suma = 0;
		System.out.println("hola ivan");
		System.out.println("Suma hasta cien");
		contador = 100;
		suma = 0;
		while (contador>0) {
			System.out.println("Escribe un numero a sumar...");
			num1 = Double.parseDouble(bufEntrada.readLine());
			suma = suma+num1;
			contador = contador-1;
		}
		System.out.println("el resultado es:"+suma);
	}


}
