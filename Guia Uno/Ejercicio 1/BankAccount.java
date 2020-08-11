public class BankAccount{
  private String cbu;
  private float balance;

  public BankAccount(String cbu, float balance){
    this.cbu = cbu;
    this.balance = balance;
  }

  public float deposit(float amount){
    if (amount > 0){
      balance = balance + amount;
    } else{
      System.out.println("Invalid amount, your balance is: " + balance);
      return -1;
    }
    return balance;
  }

  public float withdraw(float amount){
    if(amount > 0 && amount < balance){
      balance = balance - amount;
      return balance;
    } else {
      System.out.println("Invalid amount, your balance is: " + balance);
      return -1;
    }
  }

  public float getBalance(){
    return balance;
  }
  public String getCBU(){
    return cbu;
  }

}
