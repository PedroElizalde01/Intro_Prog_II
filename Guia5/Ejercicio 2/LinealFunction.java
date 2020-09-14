public class LinealFunction implements Function{
	private int a;
	private int b;
	
	public LinealFunction(int a, int b){
		this.a = a;
		this.b = b;
	}

	@Override
	public double evaluate(double value){
		return (a*value)+b;
	}
}