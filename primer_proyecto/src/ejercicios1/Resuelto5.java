package ejercicios1;

import java.util.Scanner;

public class Resuelto5 {
	
	/*Dentro de una clase joven tenemos las variables enteras edad, nivel_de_estudios e ingresos.
Necesitamos almacenar en la variable booleana jasp el valor:
– Verdadero. Si la edad es menor o igual a 28, el nivel_de_estudios es mayor que tres y los ingresos superan
los 28.000 (euros).
– Falso. En caso contrario.*/
	
	public static void main(String[] args) {
		int edad, nivelEstudios, ingresos;
		Scanner buscaminas = new Scanner(System.in);
		System.out.println("dame edad: ");
		edad = buscaminas.nextInt();
		System.out.println("dame estudios (1-6): ");
		nivelEstudios = buscaminas.nextInt();
		System.out.println("dame ingresos: ");
		ingresos = buscaminas.nextInt();
		
		if (edad<=28 && nivelEstudios>3 && ingresos>2800){
			System.out.println("Verdadero");
		}else System.out.println("Falso");
		buscaminas.close();
		
	}

}
