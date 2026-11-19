package boletin;

public class ElementosDuplicados {

	public static void main(String[] args) {

		int[] array = { 1, 2, 2, 3, 3, 4, 4, 5, 2 };
		System.out.println("Elementos del array");
		for (int i = 0; i < array.length; i++) {
			System.out.println("Elemento [" + i + "]" + array[i]);
		}
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length - 1; j++) {
				if (array[i] == array[j]) {
					System.out.println(array[j]);
					
				}
			}
		}
	}
}
