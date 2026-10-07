package paquete;

import java.util.Scanner;

public class Ejemplo3 {

	public static int[] PedirNums() {

		Scanner buscaminas = new Scanner(System.in);
		int a, b;

		System.out.println("Dame el primer numero");
		a = buscaminas.nextInt();

		System.out.println("Dame el segundo numero");
		b = buscaminas.nextInt();

		buscaminas.close();
		// devuelvo a y b en un array
		return new int[] { a, b };
	}

	public static void main(String[] args) {

		// dividendo = divisor*cociente + modulo
		//el modulo es el resto
		int[] numeros;
		numeros = PedirNums();
		int a = numeros[0];
		int b = numeros[1];
		int cociente = 0;
		int modulo = 0;

		cociente = a / b;
		modulo = a % b;

		System.out.println("El COCIENTE es: " + cociente);
		System.out.println("El MODULO es: " + modulo);

	}
}
