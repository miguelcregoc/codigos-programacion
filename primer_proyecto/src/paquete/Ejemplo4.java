package paquete;

import java.util.Scanner;

public class Ejemplo4 {

	public static float[] PedirNums() {

		Scanner buscaminas = new Scanner(System.in);
		float a, b;

		System.out.println("Dame el primer numero");
		a = buscaminas.nextFloat();

		System.out.println("Dame el segundo numero");
		b = buscaminas.nextFloat();

		buscaminas.close();
		// devuelvo a y b en un array
		return new float[] { a, b };
	}

	//Ejemplo de division de enteros con DECIMALES
	public static void main(String[] args) {

		
		float[] numeros;
		numeros = PedirNums();
		float a = numeros[0];
		float b = numeros[1];
		float resultado = 0;
		//para q el resultado tenga decimales a o/y b tiene q tener decimales, es decir un float
		resultado = a / b;

		System.out.println("El RESULTADO de la division es: " + resultado);

	}
	
}
