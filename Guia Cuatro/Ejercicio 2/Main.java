public class Main{
	public static void main(String[] args){
		Standard estandar = new Standard();
		Suite suite = new Suite();
		Presidential presi = new Presidential();

		System.out.println("Estandar:");
		System.out.println("	Precio: " + estandar.getPrice());
		System.out.println("Suite:");
		System.out.println("	Precio: " + suite.getPrice());
		System.out.println("Presidencial:");
		System.out.println("	Precio: " + presi.getPrice());
	}
}
