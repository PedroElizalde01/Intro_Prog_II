public abstract class BankAccount{
	private String cbu;
	private float balance;

	public BankAccount(String cbu, float balance){
		this.cbu = cbu;
		this.balance = balance;
	}

	public void deposit(float amount){
		if(amount > 0){
			setBalance(getBalance() + amount);
		} else {
			System.out.println("Invalid amount, your balance is : " + balance);
		}
	}


	public void withdraw(float amount){
		if(amount > 0 && amount <= balance){
			setBalance(getBalance() - amount);
		} else {
			System.out.println("Invalid amount, your balance is : " + balance);
		}
	} 

	public float getBalance(){
		return balance;
	}

	public void setBalance(float balance){
		this.balance = balance;
	}

	public String getCbu(){
		return cbu;
	}

	public void setCbu(String cbu){
		this.cbu = cbu;
	}
}