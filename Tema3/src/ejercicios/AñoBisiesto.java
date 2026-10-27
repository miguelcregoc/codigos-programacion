package ejercicios;

import java.util.Scanner;


public class AñoBisiesto {
	//para saber si anno es bisiesto:
	//divisible entre 4
	//Excepcion de los siglos (divisibles entre 100)
	//Excepcion a la excepcion (divisible entre 400)

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Integer año;
		System.out.println("año (yyyy):");
		año = sc.nextInt();
		
		if(año%4 == 0 && año%100 != 0 || año%400 == 0 ) {
			System.out.println("el año " + año + " es bisiesto");
		}else {
			System.out.println("el año " + año + " NO es bisisesto");
		}
	}
}
