package ejercicios;

public class TestProp2 {
	public static void main(String[] args) {
		Prop2 num1 = new Prop2();
		num1.setNumero(2);   
		Prop2 num2 = new Prop2(10);
		System.out.println(num1.toString());
		System.out.println(num2.toString());
		
		num1.calculacubo();
		num2.calcCuadrubple();
		System.out.println(num1.toString());
		System.out.println(num2.toString());
		
		int usoNum1 = num1.getNumero();
		int usoNum2 = num2.getNumero(); // meto los datos de los objetos en variables para poder operar con ellas 
		int res = usoNum1 + usoNum2;
		System.out.println(res);
		
		num1.setNumero(res); //meto el res en el objeto
		num1.calculacubo();
		System.out.println(num1.toString()); 
		System.out.println(num1.equals(num2)); //comparo si num1(12) == num2(10)
	}
}
