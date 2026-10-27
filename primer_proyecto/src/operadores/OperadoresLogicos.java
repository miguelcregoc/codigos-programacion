package operadores;

import java.util.Scanner;

public class OperadoresLogicos {

	public static void main(String[] args) {
		int m, n;
		Scanner buscaminas = new Scanner(System.in);
		System.out.println("Dame el primer numero");
		m = buscaminas.nextInt();
		System.out.println("Dame el segundo numero");
		n = buscaminas.nextInt();
		boolean res;
		
		res =m > n && m >= n;//AND
		System.out.println(m+">"+n+" && "+m+">="+n+": "+res);
		res =!(m < n || m != n);//XOR= (NOT de =!)+(OR de ||)
		System.out.println(m+"<"+n+" || "+m+"!="+n+": "+res);
		
		buscaminas.close();
	}
}
