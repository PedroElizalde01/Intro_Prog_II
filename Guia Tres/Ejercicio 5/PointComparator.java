public class PointComparator {

	public static double compareToX(Point2D point, Point2D otherPoint){
		return point.getX() - otherPoint.getX();
	}

	public static double compareToY(Point2D point, Point2D otherPoint){
		return point.getY() - otherPoint.getY();
	}
	
	public static boolean isContainedX(Point2D point, Point2D first, Point2D second){
		return compareToX(point, first) * compareToX(point, second) >= 0;
	}

	public static boolean isContainedY(Point2D point, Point2D first, Point2D second){
		return compareToY(point, first) * compareToY(point, second) >= 0;
	}
	
	public static double distance(Point2D point, Point2D otherPoint){
		return Math.sqrt(Math.pow((point.getX() - otherPoint.getX()), 2) + Math.pow((point.getY() - otherPoint.getY()), 2));	
	}
}