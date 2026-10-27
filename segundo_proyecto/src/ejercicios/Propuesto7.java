package ejercicios;

	public class Propuesto7 {
		
//	Crea una clase con un método millasAMetros() que toma como parámetro de entrada un valor en millas marinas
//	y las convierte a metros.
//	Una vez tengas este método escribe otro millasAKilometros() que realice la misma conversión, pero esta vez
//	exprese el resultado en kilómetros.
//	Nota: 1 milla marina equivale a 1852 metros.
		
		public static final double MILLAS_EN_METROS = 1852;
		
		public static double millasAMetros(double millas){
			return millas * MILLAS_EN_METROS;
		}
		public static double millasAKm(double millas) {
			return millasAMetros(millas) / 1000;
		}
}
