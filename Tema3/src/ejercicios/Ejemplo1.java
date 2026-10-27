package ejercicios;

public class Ejemplo1 {
	public static void main(String[] args) {
		System.out.println("While");
		int num = 1;
		while (num <= 10) {
			System.out.println(num);
			num++;
		}
		System.out.println("do while");
		num = 1;
		do {
			System.out.println(num);
			num ++;
		} while (num <= 10);
	}
}
