package ejercicios;

import java.util.Scanner;

public class Examen1 {

	public static double PasarACm(int pulg, int pie) {
		double cm1 = pulg * 2.54;
		double cm2 = pie * 30.48;
		double cm = cm1 + cm2;
		return cm;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int pie = 0;
		int pulg = 0;
		System.out.println("Dime pies:");
		pie = sc.nextInt();
		System.out.println("Dime pulgs:");
		pulg = sc.nextInt();
		System.out.println("La altura en cm es: " + PasarACm(pulg, pie));
		sc.close();
	}
}
