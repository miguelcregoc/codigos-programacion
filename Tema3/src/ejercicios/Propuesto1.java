package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Propuesto1 {

	// Realiza un programa que pida tres variables de tipo int a,b y c
	// el programa debera mostrar por pantalla el valor menor y mayor
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] orden = new int[3];
		
		System.out.println("Dame a: ");
		orden[0] = sc.nextInt();
		System.out.println("Dame b: ");
		orden[1] = sc.nextInt();
		System.out.println("Dame c: ");
		orden[2] = sc.nextInt();
		System.out.println(Arrays.toString(orden));
		int mayor = orden[0];
		int menor = orden[0];

		for (int i = 0; i < orden.length; i++) {
			if (orden[i] > mayor)
				mayor = orden[i];

			if (orden[i] < menor)
				menor = orden[i];
			
		System.out.println(Arrays.toString(orden));	
		System.out.println("mayor:" + mayor);
		System.out.println("menor:" + menor);
		}
	}
}
