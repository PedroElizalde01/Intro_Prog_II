public class Main{
	public static void main(String[] args){
		Standard estandar = new Standard(1000, 4);
		Suite suite = new Suite(2000, 2);
		Presidential presi = new Presidential(4000, 2);

		System.out.println("Estandar:");
		System.out.println("Precio: " + estandar.getPrice());
		System.out.println("Suite:");
		System.out.println("Precio: " + suite.getPrice());
		System.out.println("Presidencial:");
		System.out.println("Precio: " + presi.getPrice());
	}
}
