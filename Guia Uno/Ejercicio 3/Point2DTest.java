public class Point2DTest {
  public static void main(String[] args) {
    double a = 2;
    double b = 2;

    Point2D point = new Point2D(a, b);

    System.out.println(Point2D.getDistance(point));
    System.out.println(Point2D.getDistanceToOrigin(point));
  }
}
