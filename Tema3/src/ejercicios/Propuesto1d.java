package ejercicios;

import java.util.Scanner;

public class Propuesto1d {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime cuantos numeros tiene la cadena: ");
		int longitud = sc.nextInt();
		int[] miarray = new int[longitud];
	
		for (int i = 0; i < miarray.length; i++) {
			System.out.println("Dame el num "+ i+ ": ");
			miarray[i] = sc.nextInt();
	}
		System.out.println("\nTu cadena: ");
		for (int i = 0; i < miarray.length; i++) {
			System.out.println(i+ ".- "+miarray[i]);
		}
}
}
