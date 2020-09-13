public class Standard extends Room{
	private int price = 2000;
	private int people = 2;

	public Standard(){
		this.price = price;
		this.people = people;
	}

	@Override
	public int getPrice(){
		return this.price;
	}
	@Override
	public int getPeople(){
		return this.people;
	}
	@Override
	public String type(){
		return "Estándar";
	}
}
