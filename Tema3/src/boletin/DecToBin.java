package boletin;

import java.util.Scanner;

import bibliotecaMetodos.Metodos;

public class DecToBin {

	public static void main(String[] args) {
		int num, aux = 0, resto;
		String bin = "";
		String opcion;
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("Dame numero positivo a convertir");
			num = Integer.parseInt(sc.nextLine()); // llama a la clase Integer para hacer el metodo .parseInt que busca
													// ints en la linea escaneada
			if (num < 0) {
				System.out.println("Vuelve a darme un numero, esta vez positivo");
			} else if (num == 0) {
				bin = "0";
			} else {
				bin = "";
				aux = num;
			}
			
			while (aux > 0) {
				resto = aux%2;
				bin = String.valueOf(resto) + resto;
				aux /= 2;
			}
			System.out.println("El quivalente bin es: "+bin);

			System.out.println("Quieres convertir otro num (S/N): ");
			opcion = sc.nextLine();

		} while (!opcion.toUpperCase().equals("N")); // hasta que mayusculas(N)
		System.out.println("Fin de programa");
		
		sc.close();
	}
}
