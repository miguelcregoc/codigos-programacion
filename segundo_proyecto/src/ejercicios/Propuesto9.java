package ejercicios;

public class Propuesto9 {

//	Implementa una clase consumo, la cual forma parte de la centralita electrónica de un coche y tiene las siguientes
//	características:
//	Atributos:
//		kms. Kilómetros recorridos por el coche,
//		litros. Litros de combustible consumido,
//		vmed. Velocidad media,
//		pgas. Precio de la gasolina.
//		Métodos:
//		getTiempo. Indicará el tiempo empleado en realizar el viaje.
//		consumoMedio. Consumo medio del vehiculo (en litros cada 100 kilómetros).
//		consumoEuros. Consumo medio del vehiculo (en euros cada 100 kilómetros).
//		No olvides crear un constructor para la clase que establezca el valor de los atributos. Elige el tipo de datos más
//		apropiado para cada atributo.
	
	private double l, km, vmed, pgas;
	
	
	public Propuesto9 (double l, double km, double vmed, double pgas) {
	super();
	this.l = l;
	this.km = km;
	this.vmed = vmed;
	this.pgas = pgas;
}
	

	public double getL() {
		return l;
	}


	public void setL(double l) {
		this.l = l;
	}


	public double getKm() {
		return km;
	}


	public void setKm(double km) {
		this.km = km;
	}


	public double getVmed() {
		return vmed;
	}


	public void setVmed(double vmed) {
		this.vmed = vmed;
	}


	public double getPgas() {
		return pgas;
	}


	public void setPgas(double pgas) {
		this.pgas = pgas;
	}


	public double getTiempo() {
		return this.km / this.vmed;
	}
	public double consumoMedio() {
		return this.l / (this.km / 100);
	}
	public double consumoEuros() {
		return consumoMedio() * this.pgas;
	}

	@Override
	public String toString() {
		return "Propuesto9 [l=" + l + ", km=" + km + ", vmed=" + vmed + ", pgas=" + pgas + "]";
	}
	
	
	
	
}
