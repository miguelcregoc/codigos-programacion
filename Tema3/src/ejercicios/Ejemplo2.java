package ejercicios;

public class Ejemplo2 {

	public static void main(String[] args) {

		int i = 0;
		while (i < 10) { // este programa muestra los números del 1 al 10
			i++; // sin mostrar el 5
			if (i == 5) {
				continue;
			}
			System.out.println("numero: " + i);
		} // fin del while

		int j = 0;
		bucleext: while (j < 100) {
			j++;
			for (int k = 0; k < j; k++) {
				System.out.print("*");
				if (j == 5) {
					break bucleext;
				}
			}
			System.out.println("");
		} // fin del bucle
	}
}
