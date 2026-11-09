package boletin;

import java.util.Scanner;


public class BinToDec {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String opcion;

        do {
            System.out.println("Ingrese un número binario (ej. 101100101):");
            String binario = sc.nextLine();

            int decimal = 0;
            int peso = 1; // equivale a 2^0
            int longitud = binario.length();
            int digito;

            
            for (int i = longitud - 1; i >= 0; i--) {
            	

                if (binario.charAt(i) == '1') {
                    digito = 1;
                } else if (binario.charAt(i) == '0') {
                    digito = 0;
                } else {
                	throw new IllegalArgumentException("Un digito de los introducidos no era ni 1 ni 0");
                }

                if (digito == 1) {
                    decimal = decimal + peso;
                }

                peso = peso * 2;
            }

            System.out.println("El equivalente decimal de " + binario + " es: " + decimal);

            System.out.println("¿Desea convertir otro binario? (S/N):");
            opcion = sc.nextLine();

        } while (!opcion.equalsIgnoreCase("N"));

        System.out.println("Programa finalizado.");
        sc.close();
    }
}
