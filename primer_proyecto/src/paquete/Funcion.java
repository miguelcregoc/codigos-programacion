package paquete;

import java.util.Scanner;

public class Funcion {

	// NO DECLARO UN CONSTRUCTOR PQ USO EL CONSTRUCTOR POR DEFECTO

	// funcion o metodo que sume 2 enteros
	public int sumaEnteros(int num1, int num2) {
		int suma = num1 + num2;
		return suma;
	}

	public int MultiplicarNumeros(int num1, int num2) {
		int multiplica = num1 * num2;
		return multiplica;
	}
	
	// metodo main
	public static void main(String[] args) {

		int a, b; // dos variables enteras
		Scanner buscaminas = new Scanner(System.in);
		int resultado = 0;
		int resMul = 0;

		// pido el primer num
		System.out.println("introduce el primer entero:");
		a = buscaminas.nextInt();

		// pido el segundo num
		System.out.println("introduce el segundo entero:");
		b = buscaminas.nextInt();

		// llamo a la funcion suma
		Funcion objetito = new Funcion();
		
		resultado = objetito.sumaEnteros(b, a);
		resMul = objetito.MultiplicarNumeros(a, b);

		// imprimo lo q m salga d los huevos en pantalla
		System.out.println("El total de " + a + "+" + b + " es: " + resultado);
		System.out.println("El total de " + a + "*" + b + " es: " + resMul);

		buscaminas.close();

	}

}
