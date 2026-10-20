package ejercicios;

public class TestCar {
	
	public static void main(String[] args) {
		
		Car car1 = new Car();
		System.out.println(car1);
		car1.setMarca("BMW");
		car1.setModelo("e30");
		System.out.println(car1);
		
		Car car2 = new Car("Mercedes", "e190");
		System.out.println(car2);
		
	}
}
