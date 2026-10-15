package ejercicios;

import java.util.Scanner;

public class Propuesto6 {
	// precio original y precio final
	public static double descubrePorcentaje(double original, double actual) {
		return ((original - actual) / original) * 100;
	}
	
	//sabiendo el precio actual y el porcentaje dime el precio original
	public static double descubreOriginal(double actual, double porcentaje) {
		return ((100 * actual) / (100 - porcentaje));
	}
	public static double descubreActual(double original, double porcentaje) {
		return (original * (1 - (porcentaje / 100)));
	}

	public static void main(String[] args) {
//		System.out.println(descubrePorcentaje(100, 79));
//		System.out.println(descubrePorcentaje(100, 50));
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Dame precio inicial");
		double original = sc.nextDouble();
		System.out.println("Dame precio con descuento");
		double actual = sc.nextDouble();
		System.out.println(descubrePorcentaje(original, actual)+"%");
		
		System.out.println("Dame porcentaje de descuento");
		double porcentaje = sc.nextDouble();
		System.out.println("Dame precio con descuento");
		actual = sc.nextDouble(); 
		System.out.println(descubreOriginal(actual, porcentaje));
		
		System.out.println("Dame porcentaje de descuento");
		porcentaje = sc.nextDouble();
		System.out.println("Dame precio sin el descuento");
		original = sc.nextDouble(); 
		System.out.println(descubreActual(original, porcentaje));
		
		sc.close();
		}
}
