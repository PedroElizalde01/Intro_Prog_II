import java.util.Scanner;

public class Main{
	public static void main(String[] args){
	int employes = 0;
	Empleado empleado = new Empleado(2000, 500);
	System.out.println(empleado.getSueldo());
	System.out.println(empleado.getLegajo());
	
	Gerente gerente = new Gerente(3500, 500);
	System.out.println(gerente.getSueldo());
	System.out.println(gerente.getLegajo());
	
	}
	public int empleados(){
		Scanner input = new Scanner(System.in);
		System.out.println("Ingrese cantidad de empleados");
		return 1;
	}

}