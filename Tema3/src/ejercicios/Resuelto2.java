package ejercicios;

import java.util.Scanner;

public class Resuelto2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("dime filas: ");
		int num = sc.nextInt(); 
		
	 for (int i=0; i<num; i++) {
		for (int k=num-1; k>i; k--) {
			System.out.print(" ");
		}//variable k
		 	for (int j=0; j<=2*i; j++) {
		 		System.out.print("*");
		 	}//variable j
		 	System.out.println();
	 	}//variable i
	 
}
}
