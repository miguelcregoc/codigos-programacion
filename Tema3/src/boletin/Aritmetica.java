package boletin;

import java.util.Scanner;

public class Aritmetica {
	
	//dame la suma de todos los nums de la sucesion aritmetica hasta uno pedido al usuario
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("dame repeticiones");
		int n = sc.nextInt();
		int suma = 0;
		for (int i = 1; i <= n; i++) {
			suma += i;
			System.out.println(suma);
		}
		sc.close();
	}
}
