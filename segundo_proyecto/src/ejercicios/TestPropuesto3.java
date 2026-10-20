package ejercicios;

public class TestPropuesto3 {
	public static void main(String[] args) {
		Propuesto3 num1 = new Propuesto3();
		num1.setNumero(2);   
		Propuesto3 num2 = new Propuesto3(10);
		System.out.println(num1.toString());
		System.out.println(num2.toString());
		
		num1.calculacubo();
		num1.añade(3);
		num2.calcCuadrubple();
		num2.resta(3);
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
