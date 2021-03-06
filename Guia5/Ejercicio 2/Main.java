public class Main{
	public static void main(String[] args){
		LinealFunction lineal = new LinealFunction(3, -7);
		System.out.println(lineal.evaluate(5));

		CuadraticFunction cuadra = new CuadraticFunction(-1, 6, -3);
		System.out.println(cuadra.evaluate(3));

		int[] array = {-1, 6, -3};
		Polinomio poli = new Polinomio(2, array);
		System.out.println(poli.evaluate(3));
	}

}