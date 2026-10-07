package ejercicios;

public class Propuesto1 {
	
		public static double celsiusToFarenheit(double temp){
		return (1.8)*temp + 32;
		}
		public static double farenheitToCelsius(double temp){
		return (temp - 32)/(1.8);
		}
		public static void main(String[] args) {
		System.out.println ( "0 gradosargs Celsius son "+celsiusToFarenheit(0)+" GradosFarenheit");
		System.out.println("15 grados Celsius son "+celsiusToFarenheit(15)+" GradosFarenheit");
		System.out.println("20 grados Celsius son "+celsiusToFarenheit(20)+" GradosFarenheit");
		System.out.println("0 grados Farenheit son "+farenheitToCelsius(0)+" GradosCelsius");
		System.out.println("40 grados Farenheit son "+farenheitToCelsius(45)+" GradosCelsius");
		System.out.println("70 grados Farenheit son " + farenheitToCelsius(70)+" GradosCelsius");
		}
	}

