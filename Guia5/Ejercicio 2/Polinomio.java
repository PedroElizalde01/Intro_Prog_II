public class Polinomio implements Function{
	private int grado;
	private int[] coef;
	
	public Polinomio(int grado, int[] coef){
		this.grado = grado;
		this.coef = coef;
	}
	
	@Override
  public double evaluate(double x) {
    double valor = 0;
    for (int i = 0; i <= this.grado; i++){
    	valor = this.coef[i] + (x * valor);
    }
    return valor;
  }
}

