public class Cylinder{
	private double height;
	private double r;
	
	public Cylinder(double height, double r){
		this.height = height;
		this.r = r;
	}
	
	public double volumen(){
		return ((Math.PI*Math.pow(r,2)) * height);
	}
}