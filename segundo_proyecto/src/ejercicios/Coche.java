package ejercicios;

public class Coche {

	private int velocidad;
	private String matricula;

	Coche() {
		this.velocidad = 0;
	}

	public Coche(int velocidad, String matricula) {
		// super(); ---------> solo cuando usemos herencia
		this.velocidad = velocidad;
		this.matricula = matricula;
	}

	public int getVelocidadO() {
		return velocidad;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setVelocidad(int velocidad) {
		if(velocidad<=120) {
		this.velocidad = velocidad;
	}else{
		System.out.println("Ibas a "+velocidad+", has caido preso manin");
		this.velocidad = 0;
		}
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public void acelera(int mas) {
		velocidad += mas;
	}

	public void frena(int menos) {
		if(velocidad>menos) {
		velocidad -= menos;
		}else{
			System.out.println("has salido por el capó, has frenado mas rapido de lo que podias, ibas a "+velocidad+" y frenaste "+menos);
			velocidad = 0;
		}
	}

	@Override
	public String toString() {
		return "Coche [velocidad=" + velocidad + ", matricula=" + matricula + "]";
	}
	
	
}
	