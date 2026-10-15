package ejercicios;

public class Satelite {
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

	@Override
	public String toString() {
		return "Satelite [meridiano=" + meridiano + ", paralelo=" + paralelo + ", distancia_tierra=" + distancia_tierra
				+ "]";
	}
	
}
