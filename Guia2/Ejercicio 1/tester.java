import java.util.Scanner;

public class tester{
  public static void main(String[] args) {
    Triangle tri = createTriangle();
    System.out.println(tri.perimeter());
    System.out.println(tri.area());

  }
  public static Triangle createTriangle(){
    Scanner input = new Scanner(System.in);
    System.out.println("primero punto");
    System.out.println("Ingrese X: ");
    double x1 = input.nextDouble();
    System.out.println("Ingrese Y: ");
    double y1 = input.nextDouble();
    Point2D point1 = new Point2D(x1, y1);
    System.out.println("segundo punto");
    System.out.println("Ingrese otra X: ");
    double x2 = input.nextDouble();
    System.out.println("Ingrese otra Y: ");
    double y2 = input.nextDouble();
    Point2D point2 = new Point2D(x2, y2);
    Recta recta1 = new Recta(point1, point2);

    System.out.println("tercer punto");
    System.out.println("Ingrese X: ");
    double x3 = input.nextDouble();
    System.out.println("Ingrese Y: ");
    double y3 = input.nextDouble();
    Point2D point3 = new Point2D(x3, y3);
    System.out.println("cuarto punto");
    System.out.println("Ingrese otra X: ");
    double x4 = input.nextDouble();
    System.out.println("Ingrese otra Y: ");
    double y4 = input.nextDouble();
    Point2D point4 = new Point2D(x4, y4);
    Recta recta2 = new Recta(point3, point4);

    System.out.println("quinto punto");
    System.out.println("Ingrese X: ");
    double x5 = input.nextDouble();
    System.out.println("Ingrese Y: ");
    double y5 = input.nextDouble();
    Point2D point5 = new Point2D(x5, y5);
    System.out.println("sexto punto");
    System.out.println("Ingrese otra X: ");
    double x6 = input.nextDouble();
    System.out.println("Ingrese otra Y: ");
    double y6 = input.nextDouble();
    Point2D point6 = new Point2D(x6, y6);
    Recta recta3 = new Recta(point5, point6);

    Triangle tri = new Triangle(recta1, recta2, recta3);
    return tri;
  }
}
