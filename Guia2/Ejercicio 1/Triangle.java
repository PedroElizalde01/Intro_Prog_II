public class Triangle{
	private Recta sideA;
	private Recta sideB;
	private Recta sideC;

	public Triangle(Recta sideA, Recta sideB, Recta sideC){
		this.sideA = sideA;
		this.sideB = sideB;
		this.sideC = sideC;
	}
	public double area(){ // No puedo darle la vuelta al metodo de Herón, REVISAR -Pedro
		double semip = (perimeter()/2);
		double x = semip*(semip-sideA.distance())*(semip-sideB.distance())*(semip-sideC.distance());
		double total = Math.sqrt(x);
		return total;
	}

	public double perimeter(){
		return (sideA.distance() + sideB.distance()+ sideC.distance());
	}

}
