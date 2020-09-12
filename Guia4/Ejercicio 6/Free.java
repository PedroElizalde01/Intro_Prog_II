public class Free extends Particle{
	private double mass;
	private double velocity;
	
	public Free(double mass, double velocity){
		this.mass = mass;
		this.velocity = velocity;
	}
	
	@Override
	public double energy(){
		return (mass * Math.pow(velocity, 2)) / 2;
	}
}