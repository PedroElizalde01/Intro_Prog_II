public class Presidential extends Room{
	private int price = 4000;
	private int people = 2;

	public Presidential(){
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
		return "Presidencial";
	}
}
