package ejercicios;

import java.util.Scanner;

public class Propuesto2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime filas");
		int filas = sc.nextInt();
		for (int i = 0; i<filas; i++) {
			
			for (int j=0; j<i+1; j++) {
				System.out.print("*");
			}//end j 
			System.out.println();
		}// end i
	}
}
