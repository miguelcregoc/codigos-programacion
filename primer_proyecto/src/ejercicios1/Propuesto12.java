package ejercicios1;

import java.util.Scanner;

public class Propuesto12 {
	/*
	 * (Ejercicio de dificultad alta) Realiza un programa que dado un importe en
	 * euros nos indique el mínimo número de billetes y la cantidad sobrante que se
	 * pueden utilizar para obtener dicha cantidad. Por ejemplo: 232 euros: 1
	 * billete de 200. 1 billete de 20. 1 billete de 10 Sobran 2 euros.
	 */
	
	public static void main(String[] args) {
		Scanner buscaminas = new Scanner(System.in);
		System.out.println("Dame dinero: ");
		int dinero = buscaminas.nextInt();
		int b200=0, b100=0, b50=0, b20=0, b10=0, b5=0;
		
		
		while(dinero>=5) {
		if (dinero>=200) {
			dinero -=200;
			b200++;
		} else if (dinero<200 && dinero>=100) {
			dinero -=100;
			b100++;	
			} else if (dinero<100 && dinero>=50) {
			dinero -=50;
			b50++;
				}else if (dinero<50 && dinero>=20) {
				dinero -=20;
				b20++;
					}else if (dinero<20 && dinero>=10) {
						dinero -=10;
						b10++;
						}else if (dinero<10 && dinero>=5) {
							dinero -=5;
							b5++;}
		}	
		
		/*
		
		while(dinero>=200) {
			b200++;
			dinero-=200;
		}while(dinero>=100) {
			b100++;
			dinero-=100;
		}while(dinero>=50) {
			b50++;
			dinero-=50;
		}while(dinero>=20) {
			b20++;
			dinero-=20;
		}while(dinero>=10) {
			b10++;
			dinero-=10;
		}while(dinero>=5) {
			b5++;
			dinero-=5;
		} 
		*/
		System.out.println(b200+" billete de 200");
		System.out.println(b100+" billete de 100");
		System.out.println(b50+" billete de 50");
		System.out.println(b20+" billete de 20");
		System.out.println(b10+" billete de 10");
		System.out.println(b5+" billete de 5");
		System.out.println("y sobran "+dinero+"€");
		
	}
}
