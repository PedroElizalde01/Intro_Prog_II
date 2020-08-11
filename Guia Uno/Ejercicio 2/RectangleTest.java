import java.util.Scanner;

public class RectangleTest{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Ingrese la base del rectangulo: ");
    int base = input.nextInt();
    System.out.println("Ingrese la altura del rectangulo: ");
    int height = input.nextInt();

    Rectangle Rectantle1 = new Rectangle(base, height);

    int area = Rectantle1.calculateArea();

    System.out.println("Base del rectangulo: " + base);
    System.out.println("Altura de rectangulo: " + height);
    System.out.println("Área del rectangulo: " + area);
  }
}
