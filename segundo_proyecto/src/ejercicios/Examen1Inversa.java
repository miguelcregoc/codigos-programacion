package ejercicios;

import java.util.Scanner;

//pies 30.48cm 		pulg 2.54cm
public class Examen1Inversa {

	public static int[] PasarAPies(double cm) {
		int pies = 0;
		int pulg = 0;
		while (cm >= 30.48) {
			pies++;
			cm = cm - 30.48;
		}
		while (cm >= 2.54) {
			pulg++;
			cm = cm - 2.54;
		}
		int[] altura = { pies, pulg };
		return altura;
	}/*
	public static String CadenaPiesACm(double cm) {
		int pies = 0;
		int pulg = 0;
		String altura;
		while (cm >= 30.48) {
			pies++;
			cm = cm - 30.48;
		}
		while (cm >= 2.54) {
			pulg++;
			cm = cm - 2.54;
		}
		altura = pies + " pies " + pulg + " pulgadas";
		return altura;
	}				OTRA FORMA DE HACERLO CON STRINGS */


	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double cm = 0;
		System.out.println("Dime cm:");
		cm = sc.nextDouble();
		int[] altura = PasarAPies(cm);
		System.out.println(altura[0] + " pies " + altura[1] + " pulgadas");

		sc.close();

	}
}
