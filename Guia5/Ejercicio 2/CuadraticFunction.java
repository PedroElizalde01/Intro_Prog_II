public class CuadraticFunction implements Function{
	private int a;
	private int b;
	private int c;
	
	public CuadraticFunction(int a, int b, int c){
		this.a = a;
		this.b = b;
		this.c = c;
	}

	@Override
	public double evaluate(double value){
		return (a*Math.pow(value, 2) + b*value + c);
	}
}