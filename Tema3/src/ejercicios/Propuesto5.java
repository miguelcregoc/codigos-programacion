package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

//Se desea conocer el lucky number (número de la suerte) de cualquier persona. El
//número de la suerte se consigue reduciendo la fecha de nacimiento a un número de un solo dígito. Por ejemplo,
//la fecha de nacimiento de Emma es la siguiente: 16-08-1973 —► 16+8+1973 = 1997 —► 1+9+9+7=26 —► 2+6 =8. El
//número de la suerte de Emma será el 8.


public class Propuesto5 {
	
	public static int sumaDigitos(int num) {
		int suma = 0;
		//mientra pueda dividir entre 10
		//divido entre 10 y guardo ese valor
		//incremento el num de digitos
		while (num > 0) {
			int resto = num % 10;
			suma += resto;
			num /= 10;
		}
		return suma;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dame dia: ");
		int dia = sc.nextInt();
		System.out.println("Dame mes: ");
		int mes = sc.nextInt();
		System.out.println("Dame año: ");
		int año = sc.nextInt();
		int total = dia+mes+año;
		System.out.println(total);
		
		do {
			total = sumaDigitos(total);
			//System.out.println(lucky);
		}while(total > 9);
		
		System.out.println(total);
		
		
		sc.close();
		}
		
	}

