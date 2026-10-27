package ejercicios;

import java.util.Scanner;

public class TenisChatGPT {

//	//¡Ese es un ejemplo perfecto! La lógica de la ventaja en el tenis (o en el tie-break)
//	es un caso excelente para practicar condicionales compuestas, 
//	porque no basta con alcanzar una puntuación, sino que hay que
//	comprobar dos condiciones a la vez:
//  1 Llegar al mínimo de puntos/juegos (por ejemplo, 6 juegos).
//  2 Tener una diferencia de 2 o más sobre el rival.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer nadal, federer;
		System.out.println("nadal juegos: ");
		nadal = sc.nextInt();
		System.out.println("federer juegos: ");
		federer = sc.nextInt();

		int diferencia = nadal - federer;
        int absDiferencia = Math.abs(diferencia); //queda siempre positivo
        int maxJuegos = Math.max(nadal, federer); //saca el maximo de ambos

        String estadoSet;

        // 1. Validar si el marcador es imposible en tenis
        if (maxJuegos > 6 && absDiferencia > 2) {
            estadoSet = "MARCADOR_INVALIDO";
        } 
        // 2. Condición de victoria (al menos 6 juegos 
        //y diferencia de 2 exacta o superior si se acaba de alcanzar)
        else if (nadal >= 6 && diferencia >= 2) {
            estadoSet = "GANA_NADAL";
        } else if (federer >= 6 && -diferencia >= 2) { //en fin...
            estadoSet = "GANA_FEDERER";
        } 
        // 3. Empate o ventaja mínima a partir del 5-5
        else if (nadal >= 5 && federer >= 5) {
            estadoSet = "EN_JUEGO_IGUALADO";
        } 
        // 4. Set en curso normal (ej. 3-2, 4-1)
        else {
            estadoSet = "EN_JUEGO";
        }
        System.out.println(estadoSet);

     
    }

}
