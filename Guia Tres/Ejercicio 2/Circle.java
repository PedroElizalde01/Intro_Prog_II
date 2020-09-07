public class Circle{
	private double r;
	
	public Circle(double r){
		this.r = r;
	}
	public double area(){	
		double area = (Math.PI*Math.pow(r,2));
		return area;
	}
}