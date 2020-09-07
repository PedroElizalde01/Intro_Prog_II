public class Standard extends Room{
	private int price;
	private int people;

	public Standard(int price, int people){
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
}
