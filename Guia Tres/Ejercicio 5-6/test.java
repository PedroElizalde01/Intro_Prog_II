public class test{
	public static void main(String[] args){
		Point2D p1 = new Point2D(1,2);
		Point2D p2 = new Point2D(2,1);
		Point2D p3 = new Point2D(2,3);
		Point2D point = new Point2D(1.5,2.8);
		
		double d1 = sign(point, p1, p2);
		System.out.println(d1);
		double d2 = sign(point, p2, p3);
		System.out.println(d2);
		double d3 = sign(point, p3, p1);
		System.out.println(d3);
	
		boolean hasNeg = (d1 < 0) || (d2 < 0) || (d3 < 0);
		boolean hasPos = (d1 > 0) || (d2 > 0) || (d3 > 0);
		
		System.out.println(!(hasNeg && hasPos));
		
	}
	
	public static double sign(Point2D p1, Point2D p2, Point2D p3){
		return (p1.getX() - p3.getX())*(p2.getY() - p3.getY())-(p2.getX() - p3.getX())*(p1.getY() - p3.getY());
	}


}