package paquete;

import java.util.Scanner;

public class Ejemplo5 {

	public static void main(String[] args) {
		// dame un numero m (del que voy a sacar los multiplos)
		System.out.println("Dame un numero de 2 a 9:  ");
		Scanner buscaminas= new Scanner(System.in);
		int m = buscaminas.nextInt();

		// cuantos multiplos quieres q le saque? se guarda en n
		System.out.println("Cuantos multiplos de " + m + " quieres? ");
		int n = buscaminas.nextInt();

		// i variable contador
		// n numero de veces q se repite el bucle
		for (int i = 0; i < n; i++) {

			System.out.println(i + "	multplo de "+m+": " + m * i);

		}
		buscaminas.close();
	}
}
