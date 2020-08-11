public class BankAccount{
  private String cbu;
  private float balance;

  public BankAccount(String cbu, float balance){
    this.cbu = cbu;
    this.balance = balance;
  }

  public static float deposit(float amount){
    if (amount > 0){
      balance = balance + amount;
    } else{
      // NO HACE NADA ESPECIAL -Pedro
    }
    return balance;
  }
  public static float withdraw(float amount){
    if(amount < 0 && amount < balance){
      balance = balance + amount;
    } else {
      System.out.println("Invalid amount, your balance is: " + balance);
    }
  }
  public static void getBalance(){
    return balance;
  }
  public static void getCBU(){
    return cbu;
  }
}
