public class SpecialAccount extends CheckingAccount{
	private int points;
	
	public SpecialAccount(Interger cbu, double overdraft){
		super(cbu, overdraft);
	}
	
	public void deposit(double money){
		if(money > 0){
			balance += money;
			points = points + 5;
		}
	}

	public void depositCheck(Check check){
		if(check.amount() > 0){
			balance += check.amount();
			points = points + 5;
		}
	}
}
