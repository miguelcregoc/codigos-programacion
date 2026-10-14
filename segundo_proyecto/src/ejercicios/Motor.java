package ejercicios;

public class Motor {
	double cilindrada;
	double potencia;
	String numero_bastidor;
	String tipo_combustible;

	Motor() {
		this.cilindrada = 0;
		this.potencia = 0;
	}

	public double getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(double cilindrada) {
		this.cilindrada = cilindrada;
	}

	public double getPotencia() {
		return potencia;
	}

	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}

	public String getNumero_bastidor() {
		return numero_bastidor;
	}

	public void setNumero_bastidor(String numero_bastidor) {
		this.numero_bastidor = numero_bastidor;
	}

	public String getTipo_combustible() {
		return tipo_combustible;
	}

	public void setTipo_combustible(String tipo_combustible) {
		this.tipo_combustible = tipo_combustible;
	}

	@Override
	public String toString() {
		return "Motor [cilindrada=" + cilindrada + ", potencia=" + potencia + ", numero_bastidor=" + numero_bastidor
				+ ", tipo_combustible=" + tipo_combustible + "]";
	}
}
