package paquete;

import java.util.Scanner;

public class Ejemplo6 {
	final static double pi = 3.14152;

	
	public static double CalcRadio(double num1) {
		double resultRad= pi* Math.pow(num1, 2); // math.pow es para elevar
		return resultRad;
		
	}
	public static void main(String[] args) {
	
		System.out.println("Dame el radio: ");
		Scanner Buscaminas = new Scanner(System.in);
		double rad = Buscaminas.nextDouble();
		
		double result = CalcRadio(rad);
		
		System.out.println("El area es: "+ result);
		
		Buscaminas.close();
		
	}
	
}
