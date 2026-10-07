package ejercicios1;

public class Swap {
	
	/* Realiza un programa en Java que dada dos variables a y b, intercambie los valores de a y b. */
	
		public static void main(String[] args) {
		int a= 5, b= 8;
		int tmp;
		
		System.out.println("El valor de a inicial es: "+a);
		System.out.println("El valor de b inicial es: "+b);
		//SWAP
		tmp=a; //tmp 5
		a=b; // a 8
		b=tmp; // b 5
		System.out.println("El valor de a ahora es: "+a);
		System.out.println("El valor de b ahora es: "+b);
		}
}
