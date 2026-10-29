package ejercicios;

import java.util.Scanner;

public class Armstrong {

	public static int potencia(int base, int expo) {
		int resultado = 1;
		for (int i=0; i<expo; i++)
			resultado *= base;
		return resultado;
	}
	
	
	public static boolean isArmstrong(int num) {
		int original=num;
		int digitos = cuentaDigitos(num);
		int calc = 0;
		
	
		while(num > 0) {
			int resto = num%10;
			int parcial = (int) Math.pow(resto, digitos);
			calc += parcial;
			num /= 10;
		}
			if (original==calc) {
				return true;
			}else return false;
		}
	
	// 8325 = (8*10 al 3) + (3 * 10 al 2) + (2 * 10 al 1) + (5 * 10 al 0 (que es 1))
	public static int cuentaDigitos(int num) {
		int digitos = 0;
		//mientra pueda dividir entre 10
		//divido entre 10 y guardo ese valor
		//incremento el num de digitos
		while (num > 0) {
			num /= 10;
			digitos ++;
		}
		
		return digitos;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dame un num para ver si es Armstrong: ");
		int num = sc.nextInt();
		System.out.println(isArmstrong(num));
		
		sc.close();
	}
}

