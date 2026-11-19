package boletin;

public class ArrayMaxMin {

	//dado un array determinar el max y el min
	
	public static void main(String[] args) {
		
		int[] array = {1, 1, 2, 3, 0, 5, 1, 2, 4, 4};
		int max = array[1];
		int min = array[1];
		
		for (int i= 0; i < array.length; i++) {
				if (max > array[i])
					max = array[i];
				if (min < array[i])
					min = array[i];
				System.out.println("min: " + min + " max: " + max);
			}

		System.out.println("El min es: " + min);
		System.out.println("El max es: " + max);
	}
}

