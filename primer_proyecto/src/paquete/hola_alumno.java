package paquete;

import java.util.Scanner;

public class hola_alumno {

	public static void main(String[] args) {
		
		//variables a utilizar y crear los objetos	
		Scanner buscaminas = new Scanner(System.in);
		String nome = new String("");
		
		//sacar mensaje de peticion de nombre
		System.out.println("dame tu nombre: ");
		
		//guadar en una variable de tipo cadena
		nome = buscaminas.nextLine();
		
		//mostrar salida
		System.out.println("te gusta programar "+nome);
		
		buscaminas.close();
	
	}	
}
