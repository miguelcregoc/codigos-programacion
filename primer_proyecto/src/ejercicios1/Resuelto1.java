package ejercicios1;

public class Resuelto1 {
	
	//Realiza un método para la clase Test que genere letras de forma aleatoria. Como ejercicio complementario inves-
	//tiga el funcionamiento y uso de la función Math.random().
	//devuelve caracteres entre la a y la z
	
	class Test {
		
		public static char getLetras(){
			double aleatorio = Math.random(); //math.random manda valor entre 0 y 1
			System.out.println("aleatorio entre 0 y 1----------> "+aleatorio);
			double numero = aleatorio*26;//obtengo un num entre 0,0 y 25,99
			System.out.println("numero entre 0 y 25.99---------> "+ numero);
			int valido = (int) numero;
			char letrita= (char) (valido+97); //97 en ASCII----> a
			return letrita;
			
			
		//return (char)(Math.random()*26 +'a');  lo multiplica por 26 para tener letras en ASCII
		
		}
		
		public static void main(String[] args) {
			
			for (int i=0; i<10;i++) {
				System.out.println("llamada a un metodo------------> "+getLetras());
				System.out.println("===============================");
			}
		}
	}
}
