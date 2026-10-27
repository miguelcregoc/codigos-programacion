package ejercicios;

import java.util.Scanner;

public class DiasDelMes {
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		String mes;
		
		System.out.println("mes: ");
		mes = sc.nextLine();
		
		int dias = switch (mes.toLowerCase()) {
			case "enero", "marzo", "mayo", "julio", "agosto", "octubre", "diciembre" -> 31;
		
			case "abril", "juio", "septiembre", "noviembre" -> 30;
			
			case "febrero" -> 28;
			
			default -> {
				System.out.println("Mes no valido");
				yield 0;
			}
		}; //fin del switch
		
		if (dias > 0) {
			System.out.println(mes + " tiene " + dias +" dias.");
		}
	}
}
