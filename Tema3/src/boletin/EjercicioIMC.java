package boletin;

import java.util.Scanner;

public class EjercicioIMC {

//	Se desea desarrollar un programa que calcule el índice de masa corporal de una persona. Para ello, se requiere 
//	definir el peso de la persona (en kilogramos) y su estatura (en metros). El índice de masa corporal (IMC) se calcula 
//	utilizando la siguiente fórmula:
//	IMC 5
//	peso estatura2
//	Luego, a partir del IMC obtenido se pueden calcular si una persona tiene un peso normal, inferior o superior al 
//	normal u obesidad. Para generar estos resultados el IMC calculado debe estar en los rangos de la tabla 
//	< 16		Delgadez severa
//	[25-30)		Sobrepeso
//	[16-17)		Delgadez moderada	
//	[30-35)		Obesidad leve	
//	[17-18.5)	Delgadez leve	
//	[35-40)		Obesidad moderada
//	[18.5-25)	Peso normal	
//	>=40		Obesidad mórbida


	public static double calcIMC(double peso, double estatura) {
		return peso / Math.pow(estatura, 2);
	}
	
	public static void main(String[] args) {
		double peso, estatura, imc;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("dime peso:");
		peso = sc.nextDouble();
		System.out.println("dime altrua:");
		estatura = sc.nextDouble();
		
		imc = calcIMC(peso, estatura);
		
		
		
	}
	
}
