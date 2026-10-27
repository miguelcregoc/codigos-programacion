package ejercicios;

public class TestSatelite {
public static void main(String[] args) {
	Satelite astra = new Satelite(3000.1, 1000.04, 300);
	System.out.println(astra.toString());
	System.out.println("En orbita?: " + astra.enOrbita());
	System.out.println("Altrua -500?: ");
	astra.variaAltura(-500);
	System.out.println("Varia posicion +100, +200: ");
	astra.variaPosicion(100, 200);
	System.out.println(astra);
	
}
}
