import java.lang.Math;
import java.util.Scanner;

public class Area{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Introuzca una forma: ");
		System.out.println("1. Tringulo");
		System.out.println("2. Rectangulo");
		System.out.println("3. Circulo");
		int num = input.nextInt();
		switch(num){
			case 1:
				System.out.println("Introduzca el valor de los lados:");
				System.out.print("a = ");
				int a = input.nextInt();
				System.out.print("b = ");
				int b = input.nextInt();
				System.out.print("c = ");
				int c = input.nextInt();
				System.out.println(triangle(a, b, c));
				break;
				
			case 2:
				System.out.println("Introduzca el valor de los lados:");
				System.out.print("a = ");
				int d = input.nextInt();
				System.out.print("b = ");
				int e = input.nextInt();
				System.out.println(rectangle(d, e));
				break;

			case 3:
				System.out.println("Introduzca el valor del radio:");
				System.out.print("r = ");
				int r = input.nextInt();
				System.out.println(circle(r));
				break;
		
			default:
				System.out.println("Numero invalido");
				break;
		}
		
	}
	
	public static double triangle(int a, int b, int c){
		double P = ((a + b + c)/2);
		double A = P*(P-a)*(P-b)*(P-c);
		double area = Math.sqrt(A);
		return area;

	}

	public static double rectangle(int a, int b){
		double area = a * b;
		return area;
	}

	public static double circle(int r){
		double n = Math.pow(r, 2);
		double area = (Math.PI * n);
		return area;
		
	}

}