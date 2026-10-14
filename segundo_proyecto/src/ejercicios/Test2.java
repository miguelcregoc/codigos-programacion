package ejercicios;

public class Test2 {
	public static void main(String[] args) {
		Coche azul = new Coche();
		System.out.println(azul);
		azul.setMatricula("PO-2010-O");
		System.out.println(azul);
		
		Coche rojo = new Coche("OU-2345-V");
		System.out.println(rojo);
		System.out.println(azul.equals(rojo));
		rojo.setVelocidad(100);
		System.out.println(rojo);
		
		Coche amarillo = new Coche(60, "OU-2345-V");
		System.out.println(amarillo);
		System.out.println(amarillo.equals(azul));
		System.out.println(amarillo.equals(rojo));
	}
}
