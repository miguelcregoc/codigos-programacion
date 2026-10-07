package paquete;

import java.util.Scanner;

public class EjemploDeFuncion {

	// funcion o metodo que sume 2 enteros
	public static int sumaEnteros(int num1, int num2) {
		// declaro una variable local
		// local es q solo existe entre las llaves de sumaEnteros
		int suma;
		// algoritmo de la suma
		suma = num1 + num2;
		return suma;
	}

	// metodo main
	public static void main(String[] args) {

		int a, b; // dos variables enteras
		Scanner buscaminas = new Scanner(System.in);
		int resultado = 0;

		// pido el primer num
		System.out.println("introduce el primer entero:");
		a = buscaminas.nextInt();

		// pido el segundo num
		System.out.println("introduce el segundo entero:");
		b = buscaminas.nextInt();

		// llamo a la funcion suma
		resultado = sumaEnteros(b, a);

		// imprimo lo q m salga d los huevos en pantalla
		System.out.println("El total de " + a + "+" + b + " es: " + resultado);

		buscaminas.close();

	}
}
