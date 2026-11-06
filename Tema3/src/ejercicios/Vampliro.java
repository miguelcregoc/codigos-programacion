package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Vampliro {

	//	Realiza una clase minumero con un método esVampiro que diga si un número es vampiro o no. Un número es
	//	vampiro si es obtenido a partir del producto de dos números que se obtienen a partir de los dígitos del mismo (los
	//	dos colmillos). Por ejemplo: 2187=27x81 ó 1260=21x60.
	
	public static boolean esVampiro(int numero) {
		String numStr = String.valueOf(numero);
		int longitud = numStr.length();

		// 1. Debe tener una cantidad PAR de dígitos
		if (longitud % 2 != 0) {
			return false;
		}

		int mitad = longitud / 2;
		int minColmillo = (int) Math.pow(10, mitad - 1);
		int maxColmillo = (int) Math.pow(10, mitad) - 1;

		// 2. Buscamos pares de factores (colmillos)
		for (int a = minColmillo; a <= Math.sqrt(numero); a++) {
			if (numero % a == 0) {
				int b = numero / a;

				// Ambos colmillos deben estar en el rango de longitud adecuado
				if (b >= minColmillo && b <= maxColmillo) {

					// Regla de los ceros finales simultáneos
					if (a % 10 == 0 && b % 10 == 0) {
						continue;
					}

					// 3. Comprobar si los dígitos de (a + b) son idénticos a los de N
					if (tienenMismosDigitos(numero, a, b)) {
						System.out.println("colmillo a: " + a);
						System.out.println("colmillo b: " + b);

						return true;
					}
				}
				
			}
		}

		return false;
	}

	// Auxiliar: Convierte a cadenas, ordena sus caracteres y los compara
	private static boolean tienenMismosDigitos(int n, int a, int b) {
		char[] orig = String.valueOf(n).toCharArray();
		char[] colmillos = (String.valueOf(a) + String.valueOf(b)).toCharArray();

		Arrays.sort(orig);
		Arrays.sort(colmillos);

		return Arrays.equals(orig, colmillos);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un número entero para ver si es primo: ");
		int numero = sc.nextInt();

		System.out.println("Número " + numero + " es vampiro??? " + esVampiro(numero));

	}

}
