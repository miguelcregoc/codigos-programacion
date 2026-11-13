package boletin;

import java.util.Scanner;

public class NumPerfecto {
		
		public static boolean esPerfecto(int num) {
			int suma = 0;
			for (int i = 1; i < num; i++) {
				if (num%i == 0)
					suma += i;
			}
			return (suma == num) ? true : false;
		}

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Dame numero");
			int num = sc.nextInt();
			System.out.println("El numero: " + num + " es perfecto?: " + esPerfecto(num));
			
			sc.close();
		}
}
