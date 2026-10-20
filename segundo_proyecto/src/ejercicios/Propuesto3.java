package ejercicios;

public class Propuesto3 {
		/*
		 * 2. Realiza una clase minumero que proporcione el doble, triple y cuádruple de
		 * un número proporcionado en su constructor (realiza un método para doble, otro
		 * para triple y otro para cuádruple). Haz que la clase tenga un métodp main y
		 * comprueba los distintos métodos.
		 */

		// atributos
		int numero;
		
		public void añade (int otronum) {
		this.numero += otronum;
		}
		
		public void resta (int otronum) {
			this.numero -= otronum;
			}
		
		
		
		Propuesto3(int n){
			this.numero=n;
		}

		Propuesto3(){
			this.numero=0;
		}

		public int getNumero() {
			return numero;
		}

		public void setNumero(int numero) {
			this.numero = numero;
		}

		// metodos propios
		public int calculaCuadrado() {
			return (int) Math.pow(numero, 2);
		}

		public int calculacubo() {
			return (int) Math.pow(numero, 3);
		}

		public int calculaCuartapotencia() {
			return (int) Math.pow(numero, 4);
		}

		public int calcDouble() {
			return this.numero * 2;
		}

		public int calcTriple() {
			return this.numero * 3;
		}

		public int calcCuadrubple() {
			return this.numero * 4;
		}
		// algo asi falta de propuesto 2

		@Override
		public String toString() {
			return "Prop2 [numero=" + numero + "]";
		}

	}

