package operadores;

import java.util.Scanner;

public class OperadoresRelacionales {
	
	public static void main(String[] args) {
		
		int m, n;
		Scanner buscaminas = new Scanner(System.in);
		

		System.out.println("Dame el primer numero");
		m = buscaminas.nextInt();

		System.out.println("Dame el segundo numero");
		n = buscaminas.nextInt();
		
		boolean res;
		
		res =m > n;//res=false
		System.out.println("m>n: "+res);
		res =m < n;//res=true
		System.out.println("m<n: "+res);
		res =m >= n;//res=false
		System.out.println("m>=n: "+res);
		res =m <= n;//res=true
		System.out.println("m<=n: "+res);
		res =m == n;//res=false
		System.out.println("m==n: "+res);
		res =m != n;//res=true		m distinto que n
		System.out.println("m!=n: "+res);
		
		buscaminas.close();
		
	}

}
