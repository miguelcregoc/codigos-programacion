package ejercicios;

import java.util.Scanner;

public class DecimalToRomano {
	
	public static String decimalARomano(int num) {
		
		String[] romanos = {"I*V*", "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"}; //14
		int[] decimales = {4000, 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1}; //14
		String res = "";
		for (int i=0; i<=decimales.length-1; i++) {
			while (num >= decimales[i]) {
				res += romanos[i];
				num -= decimales[i];
			}//while
		}//for
		//System.out.println(num);
		return res;
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Dame un numero: ");
		int num = sc.nextInt();

		System.out.println(decimalARomano(num));
		
		sc.close();
	}
}
