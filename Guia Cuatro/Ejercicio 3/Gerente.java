public class Gerente extends Empleado{

	@Override
	public double getSueldo(int n){
		if(n != 0){
			return this.sueldo;
		} else {
			double x = n*1.01;
			return this.sueldo*x;
		}
	}

	@Override
	public double getLegajo(){
		return this.legajo;
	}

}