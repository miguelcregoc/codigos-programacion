package paquete;

import java.util.Scanner;

//Area = 4pi r cuadrado

//Volumen = 4/3pi r cubo

public class EntregableEsferas {

	public static double CalcArea(double num1) {
		double resultArea = 4*Math.PI* Math.pow(num1, 2); // math.pow es para elevar (en este caso al cuadradp) 
		return resultArea;
		
	}
		
	public static double CalcVol(double num1) {
		double resultVol = 4/3d*Math.PI* Math.pow(num1, 3); // math.pow es para elevar y el 
		//4/3d se pone para asegurarse que uno de los dos lleve decimales
		return resultVol;
		
	}
	public static void main(String[] args) {
	
		System.out.println("Dame el radio: ");
		Scanner Buscaminas = new Scanner(System.in);
		double rad = Buscaminas.nextDouble();
		
		double Area = CalcArea(rad);
		double Vol = CalcVol(rad);
		
		System.out.println("El area es: "+ Area);
		System.out.println("El volumen es: "+ Vol);
		
		Buscaminas.close();
		
	}
	
}
