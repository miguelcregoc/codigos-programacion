package boletin;

import java.util.Arrays;
import java.util.Scanner;

public class EcuacionCuadratica {
	
	public static double[] cuadratica(int a, int b, int c) {
		double[] x= new double[2];
		
		if (a == 0) {
			throw new IllegalArgumentException("En la cuadratica 'a' es 0");
		}
		
		if ((b*b - 4*a*c) > 0) {
			x[0] = -b + Math.sqrt((b*b - 4*a*c)) / (2*a);
			x[1] = -b - Math.sqrt((b*b - 4*a*c)) / (2*a);
		}
		else if ((b*b - 4*a*c) == 0){
			x[0] = 0;
			x[1] = 0;
		}
		else {
			throw new IllegalArgumentException("En la cuadratica (b*b - 4*a*c) negativo"); 
		}
		
		return x;
	}
	
	public static void main(String[] args) {
		int a, b, c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Dame a");
		a = sc.nextInt();
		System.out.println("Dame b");
		b = sc.nextInt();
		System.out.println("Dame c");
		c = sc.nextInt();
		
		System.out.println(Arrays.toString(cuadratica(a, b, c)));
		
		sc.close();
	}
}
