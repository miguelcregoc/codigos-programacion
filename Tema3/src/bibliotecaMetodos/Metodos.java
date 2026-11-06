package bibliotecaMetodos;

public class Metodos {

	public static boolean esPrimo(int num) {
		if(num <= 1) return false;
		for (int i = 2; i*i <= num; i++) {
			if(num % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static int cuentaDigitos(int num) {
		int digitos = 0;
		while (num > 0) {
			num /= 10;
			digitos ++;
		}
		return digitos;
	}

	//ejemplo: 7951 a 1597
	public static int invertirNum(int num) {
		int nuevo = 0;
		int potencia = cuentaDigitos(num)-1;
		while (num > 0) {
			int digito = num % 10;
			nuevo += digito*Math.pow(10, potencia);
			num /= 10;
			potencia --;
		}
		return nuevo;
	}

	public static int sumaDigitos(int num) {
		int suma = 0;
		//mientra pueda dividir entre 10
		//divido entre 10 y guardo ese valor
		//incremento el num de digitos
		while (num > 0) {
			int resto = num % 10;
			suma += resto;
			num /= 10;
		}
		return suma;
	}

	public static String decimalARomano(int num) {
		
		String[] romanos = {"I*V*", "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"}; //14
		int[] decimales = {4000, 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1}; //14
		String res = "";
		for (int i=0; i<=decimales.length-1; i++) {
			while (num >= decimales[i]) {
				res += romanos[i];
				num -= decimales[i];
			} //while
		} //for
		//System.out.println(num);
		return res;
	}


	public static String decimalToBin(int num) {
		String bin = "";
		int resto = 0;
		
		if(num == 0) {
			bin = "0";
		}else if (num < 0){
			  throw new IllegalArgumentException("El número no puede ser negativo");
		}else {
		while(num > 0) {
			resto = num%2;
			bin = String.valueOf(resto) + bin;
			num /= 2;
		}
		}
		return bin;
	}





}
