import java.util.Scanner;

public class Point2DTest {
  public static void main(String[] args) {
    System.out.println(" Punto nº1:");
    Point2D point1 = createPoint();
    System.out.println(" Punto nº2:");
    Point2D point2 = createPoint();
    System.out.println(" Punto nº3:");
    Point2D point3 = createPoint();

    System.out.println("\n"+point1.getDistance(point1));
    System.out.println(point1.getDistanceToOrigin(point1));
    System.out.println(point2.getDistance(point2));
    System.out.println(point2.getDistanceToOrigin(point2));
    System.out.println(point3.getDistance(point3));
    System.out.println(point3.getDistanceToOrigin(point3));

    System.out.println("\n Orden de distancia de mayor a menor:");
  }
  public static Point2D createPoint() {
    Scanner input = new Scanner(System.in);
    System.out.println("Ingrese punto en coordenada x: ");
    double a = input.nextDouble();
    System.out.println("Ingrese punto en coordenada y: ");
    double b = input.nextDouble();

    Point2D point = new Point2D(a, b);
    return point;
  }
  //public void swap(double a, double b, double c){
    //if(a)
  //}
}
