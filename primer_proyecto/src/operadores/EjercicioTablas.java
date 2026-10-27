package operadores;

public class EjercicioTablas {
	
	public static void main(String[] args) {
		
		for(int m=0;m<=10;m++) { //empieza el primer bucle (el q va a ser el numero a multiplicar)
			System.out.println("TABLA DEL "+m); //syso diciendo de que num es la tabla (se pone aqui para que se imprima en la tabla del 1) 
			for(int i=0;i<=10;i++) { //segundo bucle, el que va a determinar cuantas multiplicaciones va a tener cada tabla (aqui 10)
				System.out.println(m+" * "+i+" es: "+m*i); //syso y operacion
				}
			System.out.println("========================="); //separacion entre tablas
		}
		
	}

}
