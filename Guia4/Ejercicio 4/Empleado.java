public abstract class Empleado{
	private double sueldo;
	private double legajo;

	public Empleado(double sueldo, double legajo){
		this.sueldo = sueldo;
		this.legajo = legajo;
	}

	public double getSueldo(){
		return this.sueldo;
	}

	public double getLegajo(){
		return this.legajo;
	}


	//public abstract double getSueldo();
	//public abstract double getLegajo();

}
