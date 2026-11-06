package ejercicios;

public class Propuesto12 {
    
    public static void main(String[] args) {
        //Realiza un programa que muestre por pantalla los nums del 1 al 100 sin mostrar 
        //aquellos nums multiplos de 5

        for (int i = 0; i <= 100; i++) {
            if(i%5 != 0)
                System.out.println(i);
            }
    }
}
