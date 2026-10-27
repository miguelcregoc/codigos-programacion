package ejercicios;

import java.util.Scanner;

public class Tenis {

	public static void main(String[] args) {
		boolean check = false;
		Scanner sc = new Scanner(System.in);

		while (check == false) {
			System.out.println("dame puntos de P1: ");
			int p1 = sc.nextInt();
			System.out.println("dame puntos de P2: ");
			int p2 = sc.nextInt();

			if ((p1 >= 6 || p2 >= 6) && p1 > p2 + 1 ) {
				check = true;
				System.out.println("Gana P1");
			} else if (p2 > p1 + 1) {
				check = true;
				System.out.println("Gana P2");
			} else if (p2 > p1 + 2 || p1 > p2 + 2) {
				System.out.println("Resultado no valido");
			
			} else
				System.out.println("Siguen jugando \n");
		}
		sc.close();
	}
}
