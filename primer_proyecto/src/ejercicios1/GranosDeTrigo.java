package ejercicios1;

import java.math.BigInteger;

public class GranosDeTrigo {
	
	public static void main(String[] args) {
		BigInteger grano=new BigInteger("0");
		BigInteger n=new BigInteger("2");
		BigInteger m=new BigInteger("0");
		
		for (int i=0; i<64;i++) {
			m=n.pow(i);
			grano=m.add(grano);
			System.out.println(grano);
			//prueba para gitHub
		}	
	}
}
