public class Triangle extends Figure{
	private final Point2D base1;
	private final Point2D base2;
	private final Point2D height;
	
	public Triangle(Point2D base1, Point2D base2, Point2D height){
		this.base1 = base1;
		this.base2 = base2;
		this.height = height;
	}

	@Override
	boolean includePoint(Point2D point){
		return false;
	}
	//REVISAR tester.java TIENE EL CODIGO PARA ESTO
}