package ejercicios;

import java.util.Scanner;

public class Propuesto11 {

//	(Ejercicio de dificultad alta) El restaurante mejicano de Israel cuya especialidad son las papas con chocos nos pide
//	diseñar un método con el que se pueda saber cuántos clientes pueden atender con la materia prima que tienen en el
//	almacén. El método recibe la cantidad de papas y chocos en kilos y devuelve el número de clientes que puede atender
//	el restaurante teniendo en cuenta que por cada tres personas, Israel utiliza un kilo de papas y medio de chocos.
//	Modifica el programa anterior creando una clase que permita almacenar los kilos de papas y chocos del
//	restaurante. Implementa los siguientes métodos:
//	public void addChocos(int x). Añade x kilos de chocos a los ya existentes.
//	public void addPapas(int x). Añade x kilos de papas a los ya existentes.
//	public int getComensales(). Devuelve el número de clientes que puede atender el restaurante (este es el
//	método anterior).
//	public void showChocos(). Muestra por pantalla los kilos de chocos que hay en el almacén.
//	public void showPapas(). Añade Muestra por pantalla los kilos de papas que hay en el almacén.

	
	public static void main(String[] args) {
		SuminRestaurante israel = new SuminRestaurante();
		Scanner sc = new Scanner(System.in);
		
		System.out.println(israel);
		System.out.println("Dime chocos: ");
		israel.addChocos(sc.nextDouble());
		System.out.println("Dime papas: ");
		israel.addPapas(sc.nextDouble());
		System.out.println(israel.showChocos() + " chocos");
		System.out.println(israel.showPapas() + " papas");
		System.out.println(israel.showComensales() + " comensales");
		System.out.println(israel);
		israel.fuiAlMercado(2, 3);
		System.out.println();
		
		sc.close();
}

}

