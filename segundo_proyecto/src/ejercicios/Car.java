package ejercicios;

public class Car {
//	Crea la clase coche con dos constructores. Uno no toma parámetros y el otro sí. Los dos constructores inicializarán
//	los atributos marca y modelo de la clase. Crea dos objetos (cada objeto llama a un constructor distinto) y verifica
//	que todo funciona correctamente.
	
//	atributos
	private String marca;
	private String modelo;
	
	Car(){
	}
	
	Car(String mar, String mod){
		this.marca = mar;
		this.modelo = mod;
	}

	public void setMarca(String mar) {
		this.marca = mar;
	}
	
	public void setModelo(String mod) {
		this.modelo = mod;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public String getModelo() {
		return modelo;
	}

	@Override
	public String toString() {
		return "Car [marca=" + marca + ", modelo=" + modelo + "]";
	}
	
	
}
