package bibliotecaMetodos;

import java.io.FileInputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.util.Properties;

public class Metodos {

	public static boolean esPrimo(int num) {
		if (num <= 1)
			return false;
		for (int i = 2; i * i <= num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static int cuentaDigitos(int num) {
		int digitos = 0;
		while (num > 0) {
			num /= 10;
			digitos++;
		}
		return digitos;
	}

	// ejemplo: 7951 a 1597
	public static int invertirNum(int num) {
		int nuevo = 0;
		int potencia = cuentaDigitos(num) - 1;
		while (num > 0) {
			int digito = num % 10;
			nuevo += digito * Math.pow(10, potencia);
			num /= 10;
			potencia--;
		}
		return nuevo;
	}

	public static int sumaDigitos(int num) {
		int suma = 0;
		// mientra pueda dividir entre 10
		// divido entre 10 y guardo ese valor
		// incremento el num de digitos
		while (num > 0) {
			int resto = num % 10;
			suma += resto;
			num /= 10;
		}
		return suma;
	}

	public static String decimalARomano(int num) {

		String[] romanos = { "I*V*", "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" }; // 14
		int[] decimales = { 4000, 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 }; // 14
		String res = "";
		for (int i = 0; i <= decimales.length - 1; i++) {
			while (num >= decimales[i]) {
				res += romanos[i];
				num -= decimales[i];
			} // while
		} // for
			// System.out.println(num);
		return res;
	}

	public static String decimalToBin(int num) {
		String bin = "";
		int resto = 0;

		if (num == 0) {
			bin = "0";
		} else if (num < 0) {
			throw new IllegalArgumentException("El número no puede ser negativo");
		} else {
			while (num > 0) {
				resto = num % 2;
				bin = String.valueOf(resto) + bin;
				num /= 2;
			}
		}
		return bin;
	}

	// devuelve 2 valores x[0] y x[1]
	public static double[] cuadratica(int a, int b, int c) {
		double[] x = new double[2];

		if (a == 0) {
			throw new IllegalArgumentException("En la cuadratica 'a' es 0");
		}
		if ((b * b - 4 * a * c) > 0) {
			x[0] = -b + Math.sqrt((b * b - 4 * a * c)) / 2 * a;
			x[1] = -b - Math.sqrt((b * b - 4 * a * c)) / 2 * a;
		} else if ((b * b - 4 * a * c) == 0) {
			x[0] = 0;
			x[1] = 0;
		} else {
			throw new IllegalArgumentException("En la cuadratica (b*b - 4*a*c) negativo");
		}

		return x;
	}

	public static BigInteger factorial(int num) { // la signatura del metodo indica que entra una variable int y retorna
													// un objeto BigInteger
		if (num <= 0) // si el num introducido es 0 o negativo
			throw new IllegalArgumentException("En el factorial el numero introducido es negativo o 0"); // saca una
																											// excepcion
		if (num == 1) // si el num es 1, condicion de escape
			return BigInteger.ONE; // retorna uno en en el objeto y acaba la recursividad porque el metodo no se
									// llama mas.
		else // si no
			return BigInteger.valueOf(num).multiply(factorial(num - 1)); // return num * factorial(num-1);
		// retorna el num y se multiplica por (se hace una llamada al mismo metodo
		// factorial y se le resta uno)
	}

	/**
	 * Este metodo lee el .env y devuelve un objeto Properties con las claves de entorno
	 *
	 * 
	 */
	public static Properties envIn() {

		Properties env = new Properties(); // creo un objeto Properties para asignar claves valor a los datos
		// que saque en .env

		try (FileInputStream fichero = new FileInputStream(".env")) { // pruebo que entre bien el .env
			env.load(fichero); // si es asi lo cargo en el objeto Properties llamado env
			return env;
		} catch (IOException e) { // capturo la excepcion
			throw new IllegalArgumentException("No se pudo leer el .env" + e.getMessage()); // saco un mensaje para ver el error
		}
	}

}
