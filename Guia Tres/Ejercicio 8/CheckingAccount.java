public class CheckingAccount extends BankAccount{

	private double overdraft;
	
	public Check issueCheck(double amount){
		if(amount >= getBalance() && amount - getBalance() <= 100){
			return new Check(amount);
		}
		return
	}
	
}