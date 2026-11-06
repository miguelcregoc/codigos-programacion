package ejercicios;

import java.util.Scanner;

public class Propuesto9 {
	
	// Realiza una clase minumero de un metodo esOmirp si un num es Omirp o no
	//un numero es omirp si es un num primo y, ademas,al invertir sus digitosd da otro num primo
	//ej 7951 y 1597
	//	2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97
	
	public static boolean esPrimo(int num) {
		if(num <= 1) return false;
		for (int i = 2; i*i <= num; i++) {
			if(num % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static int cuentaDigitos(int num) {
		int digitos = 0;
		while (num > 0) {
			num /= 10;
			digitos ++;
		}
		return digitos;
	}
	
	public static int invertirNum(int num) {
		int nuevo = 0;
		int potencia = cuentaDigitos(num)-1;
		while (num > 0) {
			int digito = num % 10;
			nuevo += digito*Math.pow(10, potencia);
			num /= 10;
			potencia --;
		}
		return nuevo;
	}
	
	public static boolean esOmirp(int num) {
		if(esPrimo(num) == true) {
			invertirNum(num);
			if(esPrimo(num) == true) {
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dame num para ver si es primo: ");
		int num = sc.nextInt();
		
		System.out.println("Es primo?: "+esOmirp(num));
		System.out.println(invertirNum(num));
		sc.close();
		
		
		
	}
}
