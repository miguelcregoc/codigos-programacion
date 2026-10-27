
public class Terrestres extends MedioTransporte{
	public int numRuedas;
	public String combustible;

	public Terrestres(double velocidad, double vIN,int numRuedas, String combustible) {
		super(velocidad, vIN);
		this.numRuedas=numRuedas;
		this.combustible=combustible;
		
	}

}
