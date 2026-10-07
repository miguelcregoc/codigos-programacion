package operadores;

import java.util.Scanner;

public class ProbarExpresionesLogicas {

	public static void main(String[] args) {
		int m, n;
		Scanner buscaminas = new Scanner(System.in);
		System.out.println("Dame el primer numero");
		m = buscaminas.nextInt();
		System.out.println("Dame el segundo numero");
		n = buscaminas.nextInt();
		boolean res;
		
		res = (m >= n) && (m <= n); //AND
		System.out.println(m+">="+n+" && "+m+"<="+n+": "+res);
		res = (m > n) ^ (m < n);//OR
		System.out.println(m+">"+n+" ^ "+m+"<"+n+": "+res);
		res = !(m >= 0) || !(n >= 0); //XOR m o n distinto de 0
		System.out.println("!"+m+">=0 || ! "+n+">=0: "+res);
		res = (m > 0) && (n > 0) && (m != n);// AND m > 0 y n > 0 y m distinto de n
		System.out.println(m+">0 && "+n+">0 && "+m+"!="+n+": "+res);
		res = (m % 2 == 0) || (n % 2 == 0);//OR modulo de m/2 = 0 o modulo de n/2 =0
		System.out.println(m+"%2 == 0 || "+n+"%2 == 0: "+res);
		
		buscaminas.close();
	}
	
}
