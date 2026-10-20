package ejercicios;

public class Satelite {

//	Modifica la clase satélite y añádele los siguientes métodos:
//		Método void variaAltura(double desplazamiento). Este método acepta un parámetro que será positivo o
//		negativo dependiendo de si el satélite tiene que alejarse o acercarse a La Tierra.
//		Método boolean enOrbitaQ. Este método devolverá false si el satélite está en tierra y true en caso
//		contrario.
//		Método void variaPosicion(double variap, double variam). Este método permite modificar los atributos de
//		posición (meridiano y paralelo) mediante los parámetros variap y variam. Estos parámetros serán valores
//		positivos o negativos relativos que harán al satélite modificar su posición.

	private double meridiano;
	private double paralelo;
	private double distancia_tierra;

	Satelite(double m, double p, double d) {
		meridiano = m;
		paralelo = p;
		distancia_tierra = d;
	}

	Satelite() {
		meridiano = paralelo = distancia_tierra = 0;
	}

	public void setPosicion(double m, double p, double d) {
		meridiano = m;
		paralelo = p;
		distancia_tierra = d;
	}
//
//	public void printPosicion() {
//		System.out.println("Satelite se encuentra en el meridiano " + meridiano + " en el paralelo " + paralelo
//				+ " a una distancia de la+" + "tierra de " + distancia_tierra + " Km");
//	}

	public double getMeridiano() {
		return meridiano;
	}

	public void setMeridiano(double meridiano) {
		this.meridiano = meridiano;
	}

	public double getParalelo() {
		return paralelo;
	}

	public void setParalelo(double paralelo) {
		this.paralelo = paralelo;
	}

	public double getDistancia_tierra() {
		return distancia_tierra;
	}

	public void setDistancia_tierra(double distancia_tierra) {
		this.distancia_tierra = distancia_tierra;
	}

	public void variaAltura(double desplazamiento) {
		if (this.distancia_tierra + desplazamiento < 0)
			System.out.println("Cuidado que te estrellas");
		else
			this.distancia_tierra += desplazamiento;
	}

	public boolean enOrbita() {
		return (this.distancia_tierra != 0) ? true : false;
	}

	public void variaPosicion(double variap, double variam) {
		this.setPosicion(this.getMeridiano() + variam, this.getParalelo() + variap, this.getDistancia_tierra() + 0);
	}

	@Override
	public String toString() {
		return "Satelite [meridiano=" + meridiano + ", paralelo=" + paralelo + ", distancia_tierra=" + distancia_tierra
				+ "]";
	}

}
