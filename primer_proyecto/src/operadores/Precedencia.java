package operadores;

public class Precedencia {

	 public static void main(String[] args) {

	        // Ejemplo 1: Aritmética básica (* sobre +)
	        int res1 = 5 + 3 * 2; // 5 + (3 * 2) = 11
	        System.out.println("Ejemplo 1 (* sobre +): " + res1);

	        // Ejemplo 2: Relacionales vs. Lógicos (> y == sobre &&)
	        boolean res2 = 10 > 5 && 3 + 2 == 6; // true && false = false
	        System.out.println("Ejemplo 2 (Relacionales sobre &&): " + res2);

	        // Ejemplo 3: Lógicos (&& sobre ||)
	        boolean res3 = false || true && true; // true || (false && false) = true
	        System.out.println("Ejemplo 3 (&& sobre ||): " + res3);

	        // Ejemplo 4: Incremento prefijo, Aritmética y Asignación compuesta (++a, * y +=)
	        int a = 2;
	        int b = 3;
	        b += ++a * 4; // b = 3 + (3 * 4) = 15
	        System.out.println("Ejemplo 4 (++a y * sobre +=): " + b);

	        // Ejemplo 5: Operador Ternario vs. Aritmética (+ y * sobre ? :)
	        int x = 4;
	        int res5 = x * 2 > 10 ? 100 : 200 + 5; // (8 > 10) ? 100 : 205 -> 205
	        System.out.println("Ejemplo 5 (Aritmética sobre ? :): " + res5);

	    }
	}
