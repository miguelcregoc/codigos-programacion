package intro;

import java.util.Scanner;

public class EjemploEntrada {

	public static void main(String[] args) {
		Scanner buscaminas = new Scanner(System.in);
		int lectura = buscaminas.nextInt();
		System.out.println("la linea introducida por teclado es: "+lectura);
		
		int a=8,b=0;
		int c;
		
		try {
		c=a/b;
		System.out.println("la division entera (/) es "+c);
		}catch(Exception ex) {
			System.out.println("menuda bomba");
			ex.printStackTrace();
		}
		System.out.println("fin del programa");
		
	}
}
