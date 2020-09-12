public class Recta{
	private Point2D a;
	private Point2D b;

	public Recta(Point2D a, Point2D b){
		this.a = a;
		this.b = b;
	}
	public double distance(){
		double xcord = Math.pow((b.getX() - a.getX()),2);
		double ycord = Math.pow((b.getY() - a.getY()),2);
		double total = Math.sqrt(xcord + ycord);
		return total;
	}
}