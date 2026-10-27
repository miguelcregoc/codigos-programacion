package paquete;

import java.util.Scanner;

public class pedirDosNumeroEnterosYMultiplicar {

	public static int MultiplicarNumeros(int num1, int num2) {
		int multiplica = num1 * num2;
		return multiplica;

	}

	public static int[] PedirNums() {

		Scanner buscaminas = new Scanner(System.in);
		int a, b;

		System.out.println("Dame el primer numero");
		a = buscaminas.nextInt();

		System.out.println("Dame el segundo numero");
		b = buscaminas.nextInt();

		buscaminas.close();
		//devuelvo a y b en un array 
		return new int[] { a, b };

	}

	public static void main(String[] args) {
		int resultado;
		// tengo q pillar el array del return de PedirNums
		int[] productos;
		productos = PedirNums();
		// meto cada numero del array en una variable, en este caso en n y m
		int n = productos[0];
		int m = productos[1];

		resultado = MultiplicarNumeros(n, m);
		System.out.println("El resultado de " + n + "*" + m + " es: " + resultado);

	}
}
