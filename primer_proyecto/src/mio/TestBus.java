package mio;

public class TestBus {
	public static void main(String[] args) {
		Bus b1 = new Bus("\u001B[32m");
		Bus b2 = new Bus("\u001B[33m");
		double dado = 0;
		
		for (int i = 0; i < 12; i++) {
		    System.out.println();
		}
		for (int j=0; j < 70; j++) {
		try {
		    Thread.sleep(200);
		} catch (InterruptedException e) {
		    e.printStackTrace();
		}
		for (int i = 0; i < 8; i++) {
		    System.out.println();
		}
		dado = Math.random();
		if (dado < 0.5) {
		b1.alanteBus();
		} else if (dado > 0.5) {
			b2.alanteBus();
		}
		System.out.println(b1);
		System.out.println(b2);
		
		//Condicion de victoria
		if (b1.getL1().length() == 50) {
			System.out.println("GANA LA COLECTIVERA 1");
			break;
		}else if (b2.getL1().length() == 50) {
			System.out.println("GANA LA COLECTIVERA 2");
			break;
		}
		
		
		}
		
	}
}
