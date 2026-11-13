package boletin;

import java.util.Scanner;

public class FibonacciIter {
	
	//se define
	// F(0) = 0
	// F(1) = 1
	// F(n) = (n-1) + (n-2) ; n > 1
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime repeticiones");
		int repeticiones = sc.nextInt();
		long ultimo = 1;
		long penultimo = 0;
		System.out.println("0 \n1");
		for(int i = 0; i <= repeticiones - 3; i++) {
			long aux = ultimo + penultimo; 
			penultimo = ultimo;
			ultimo = aux;
			System.out.println(aux);
		}
			
	}
}
