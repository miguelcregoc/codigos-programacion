package ejercicios;

public class Propuesto11 {

//	(Ejercicio de dificultad alta) El restaurante mejicano de Israel cuya especialidad son las papas con chocos nos pide
//	diseñar un método con el que se pueda saber cuántos clientes pueden atender con la materia prima que tienen en el
//	almacén. El método recibe la cantidad de papas y chocos en kilos y devuelve el número de clientes que puede atender
//	el restaurante teniendo en cuenta que por cada tres personas, Israel utiliza un kilo de papas y medio de chocos.
	
	int cliente = 0;
	public int numeroClientes(double papas, double chocos) {
		while(papas>=1 && chocos>= 0.5) {
			papas --;
			chocos -= 0.5;
			cliente ++;	
		}
		return cliente;
	}
}
