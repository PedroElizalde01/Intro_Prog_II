public class Suite extends Room{
	private int price = 1000;
	private int people = 4;

	public Suite(){
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
		return "Suite";
	}
}
