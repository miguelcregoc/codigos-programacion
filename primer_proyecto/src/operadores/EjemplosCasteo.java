package operadores;

public class EjemplosCasteo {

	  public static void main(String[] args) {

	        System.out.println("=== CASTEO IMPLÍCITO (AUTOMÁTICO) ===");
	        // 1. De int a double (sin pérdida de datos)
	        int entero = 25;
	        double decimal = entero;
	        System.out.println("1. int a double: " + decimal); // 25.0

	        // 2. De byte a int (cabe holgadamente)
	        byte numeroPequeno = 100;
	        int numeroGrande = numeroPequeno;
	        System.out.println("2. byte a int: " + numeroGrande); // 100

	        // 3. De char a int (obtiene el valor numérico Unicode/ASCII)
	        char letra = 'A';
	        int codigoAscii = letra;
	        System.out.println("3. char a int: " + codigoAscii); // 65


	        System.out.println("\n=== CASTEO EXPLÍCITO (MANUAL) ===");
	        // 1. De double a int (se elimina la parte decimal)
	        double precio = 99.99;
	        int precioEntero = (int) precio;
	        System.out.println("1. double a int: " + precioEntero); // 99

	        // 2. De long a int (reducción de tipo de dato)
	        long distancia = 1500L;
	        int distanciaCorta = (int) distancia;
	        System.out.println("2. long a int: " + distanciaCorta); // 1500

	        // 3. De int a byte (ocurre desbordamiento/overflow porque 300 supera el límite de byte que es 127)
	        int numero = 300;
	        byte numeroByte = (byte) numero;
	        System.out.println("3. int a byte (desbordado): " + numeroByte); // 44
	    }
}
