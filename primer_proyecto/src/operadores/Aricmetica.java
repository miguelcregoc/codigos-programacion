package operadores;

public class Aricmetica {
	
	public static void main(String[] args) {
		int n1=2, n2;
		
		
		n2=n1 * n1; // n2=4
		System.out.println("producto: "+n2);
		n2=n2-n1; // n2=2
		System.out.println("resta: "+n2);
		n2=n2+n1+15; // n2=19
		System.out.println("suma: "+n2);
		n2=n2/n1; // n2=9
		System.out.println("cociente de un entero: "+n2);
		n2=n2%n1; // n2=1
		System.out.println("modulo o resto: "+n2);
	}

}
