package ejercicios;

import java.util.Objects;

public class Coche {

	private int velocidad;
	private String matricula;
	private Motor motor;

	Coche() {
		this.velocidad = 0;
	}

	public Coche(int velocidad, String matricula) {
		// super(); ---------> solo cuando usemos herencia
		this.velocidad = velocidad;
		this.matricula = matricula;
	}
	
	public Coche(String matricula) {
		// super(); ---------> solo cuando usemos herencia
		this.matricula = matricula;
	}

	public int getVelocidadO() {
		return velocidad;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setVelocidad(int velocidad) {
		if (velocidad <= 120) {
			this.velocidad = velocidad;
		} else {
			System.out.println("Ibas a " + velocidad + ", has caido preso manin");
			this.velocidad = 0;
		}
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public void acelera(int mas) {
		velocidad += mas;
	}

	public Motor getMotor() {
		return motor;
	}

	public void setMotor(Motor motor) {
		this.motor = motor;
	}

	public void frena(int menos) {
		if (velocidad > menos) {
			velocidad -= menos;
		} else {
			System.out.println("has salido por el capó, has frenado mas rapido de lo que podias, ibas a " + velocidad
					+ " y frenaste " + menos);
			velocidad = 0;
		}
	}


	@Override
	public int hashCode() {
		return Objects.hash(matricula, motor, Integer.valueOf(velocidad));
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (this.getClass() != obj.getClass())
			return false;
		Coche otro = (Coche) obj;
		return Objects.equals(matricula, otro.matricula);
	}
	@Override
	public String toString() {
		return "Coche [velocidad=" + velocidad + ", matricula=" + matricula + ", motor=" + motor + "]";
	}	

	
	

}
