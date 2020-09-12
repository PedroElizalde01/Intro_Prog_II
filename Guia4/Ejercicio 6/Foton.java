public class Foton extends Particle{
	private double lambda;
	final static double h = 6.6268693e-34;
	final static double c = 299792458;
	
	public Foton(double lambda){
		this.lambda = lambda;
	}
	
	@Override
	public double energy(){
		return (h * c) / lambda;
	}
}