package paquete;

public class Suma {

	static int n1 = 50; // variable miembro de la clase

	public static void incrementaInt() {
		n1 = n1 + 150;
		System.out.println("n1 vale: " + n1);
	}

	public static void main(String[] args) {
		int n2 = 30, suma = 0; // variables locales

		incrementaInt(); // 150 + 50 (se guarda en n1)

		suma = n1 + n2; // 200 + 30 NO se guarda en n1
		System.out.println("LA SUMA ES: " + suma);

		incrementaInt(); // 200 + 150 se guarda en n1
	}
}