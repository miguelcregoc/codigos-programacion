package ejercicios;

import java.util.Scanner;

public class Propuesto9 {
	
	// Realiza una clase minumero de un metodo esOmirp si un num es Omirp o no
	//un numero es omirp si es un num primo y, ademas,al invertir sus digitosd da otro num primo
	//ej 7951 y 1597
	
	public static boolean esOmirp(int num) {
//		2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97
		if(num <= 1) return false;
		
		for (int i = 2; i*i <=num; i++) {
			if(num % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dame num para ver si es primo: ");
		int num = sc.nextInt();
		
		
		
	}
}
