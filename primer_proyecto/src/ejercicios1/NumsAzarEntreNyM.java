package ejercicios1;

import java.util.Random;

public class NumsAzarEntreNyM {

	
	public static int SacaNum() {
		return (int) (Math.random()*16+3);//le sumo 16 y no 15 pq como m va a cortar los decimales al castear el (int) redondeo hacia arriba
		}
	
	public static int dameNumEntero() {
		Random aleatorio = new Random();
		int num = aleatorio.nextInt(16)+3;
		return num;
	}
	
	public static void main(String[] args) {
		for(int i=0;i<100;i++) {
			String flecha = (i<10) ? "---------> " : "--------> "; //mariconada para que la maquetacion de la ejecucion, una tiene un (-) menos
				System.out.println(i+flecha+SacaNum());
				System.out.println(i+flecha+dameNumEntero());
		}
		
	}
}
