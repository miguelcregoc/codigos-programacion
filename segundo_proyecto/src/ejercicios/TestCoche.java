package ejercicios;

public class TestCoche {
public static void main(String[] args) {
	
	Coche fiat = new Coche();
	fiat.setVelocidad(220);
	fiat.setMatricula("CYG2123");
	System.out.println(fiat.toString());
	
	System.out.println("==============================");
	
	Coche multipla = new Coche(40, "KJW2980");
	System.out.println(multipla.toString());
	multipla.frena(30);
	System.out.println(multipla.getVelocidadO()+" Km");
	multipla.acelera(40);
	System.out.println(multipla.getVelocidadO()+" Km");
	multipla.frena(60);
	System.out.println(multipla.getVelocidadO()+" Km");
	multipla.setVelocidad(50);
	multipla.setMatricula("KDD2122");
	System.out.println(multipla.toString());
	}
}
