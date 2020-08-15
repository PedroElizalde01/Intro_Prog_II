import java.util.Scanner;

public class CircleTest {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Ingrese punto en coordenada x: ");
    double a = input.nextDouble();
    System.out.println("Ingrese punto en coordenada y: ");
    double b = input.nextDouble();
    Point2D point = new Point2D(a, b);

    System.out.println("Ingrese el radio del circulo: ");
    double r = input.nextDouble();

    Circle circle = new Circle(r, point);

    System.out.println(circle.center());
    System.out.println(circle.area());
    System.out.println(circle.perimenter());

    System.out.println("Ingrese otro punto en coordenada x: ");
    double x = input.nextDouble();
    System.out.println("Ingrese otro punto en coordenada y: ");
    double y = input.nextDouble();
    Point2D point2 = new Point2D(x, y);

    System.out.println(circle.contains(point2));

  }
}
