package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Propuesto1c {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] orden = new int[3];
		
		System.out.println("Dame a: ");
		int a = sc.nextInt();
		System.out.println("Dame b: ");
		int b = sc.nextInt();
		System.out.println("Dame c: ");
		int c = sc.nextInt();
		System.out.println(Arrays.toString(orden));
		int mayor = Math.max(a, Math.max(b, c));;
		int menor = Math.min(a, Math.min(b, c));

		System.out.println("mayor:" + mayor);
		System.out.println("menor:" + menor);
		}
}

