package ejercicios;

import java.util.Scanner;

public class TestProp7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime millas: ");
		double millas = sc.nextDouble();
		
		System.out.println("en metros " + Propuesto7.millasAMetros(millas));
		System.out.println("en Km " + Propuesto7.millasAKm(millas));
		
		sc.close();
	}
}
