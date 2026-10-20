package ejercicios;

public class TestProp9 {
	public static void main(String[] args) {
		Propuesto9 coche1 = new Propuesto9(5.2, 90, 103.72, 1.71);
		System.out.println(coche1);
		System.out.println(coche1.getTiempo()+" horas");
		System.out.println(coche1.consumoMedio() + " consumo medio L a los 100km");
		System.out.println(coche1.consumoEuros() + " consumo medio Eur a los 100km");
		
		
	}
}
