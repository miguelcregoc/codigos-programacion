package ejercicios;

import java.util.Scanner;

public class DecimalToRomanoSegunda {

	public class NumerosRomanos {

		public static String aRomano(int numero) {
			if (numero < 1 || numero > 3999) {
				throw new IllegalArgumentException("El rango válido es de 1 a 3999");
			}

			String[] millares = { "", "M", "MM", "MMM" };
			String[] centenas = { "", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM" };
			String[] decenas = { "", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC" };
			String[] unidades = { "", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX" };

			return millares[numero / 1000] + centenas[(numero % 1000) / 100] + decenas[(numero % 100) / 10]
					+ unidades[numero % 10];
		}

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);

			System.out.println("Introduce un número entre 1 y 3999");

			int numero = sc.nextInt();

			if (numero >= 1 && numero < 4000) {
				String res = aRomano(numero);
				System.out.println("Número romano: " + res);
			} else {
				System.out.println("Número no válido");
			}

			sc.close();
		}
	}

}
