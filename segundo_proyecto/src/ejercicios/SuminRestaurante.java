package ejercicios;

public class SuminRestaurante {
	
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
	
	private double papas = 0;
	private double chocos = 0;

	SuminRestaurante(){
		
	}
	
	
	public void setPapas(double papas) {
		this.papas = papas;
	}

	public void setChocos(double chocos) {
		this.chocos = chocos;
	}

	SuminRestaurante(double papas, double chocos) {
		this.papas = papas;
		this.chocos = chocos;
	}
	
	public void addChocos(double chocos) {
		this.chocos += chocos;
	}
	public void addPapas(double papas) {
		this.papas += papas;
	}
	public double showChocos() {
		return this.chocos;
	}
	public double showPapas() {
		return this.papas;
	}
	
	public int showComensales() {
		double papas = this.papas;
		double chocos = this.chocos;
		int cliente = 0;
		
		while (papas >= 1 && chocos >= 0.5) {
			papas--;
			chocos -= 0.5;
			cliente += 3;
		}
		return cliente;
	}
	
	public void fuiAlMercado(double papas, double chocos) {
		this.addChocos(chocos);
		this.addPapas(papas);
	}
	
	public void showAlmacen() {
		this.showPapas();
		this.showChocos();
	}
	
	


	@Override
	public String toString() {
		return "SuminRestaurante [papas=" + papas + ", chocos=" + chocos + ", Comensales=" + showComensales()
				+ "]";
	}

	
	
}
