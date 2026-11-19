package boletin;

import bibliotecaMetodos.Metodos;

public class Test {
	
	public static void main(String[] args) {
		String nombre = Metodos.envIn().getProperty("NOMBRE");
		String apellidos = Metodos.envIn().getProperty("APELLIDOS");
		
		
		System.out.println(nombre);
		System.out.println(apellidos);
	}
}

