public class Gerente extends Empleado{

	public Gerente(double sueldo, double legajo){
		sueldo = 1000;
		legajo = 1000;
	}

	@Override
	public double getSueldo(int n){
		if(n != 0){
			return sueldo;
		} else {
			double x = n * 1.01;
			return sueldo * x;
		}
	}
}
