import java.util.Scanner;

// NO HAY BUENA INTERACCION ENTRE LAS CLASES -Pedro

public class BankAccountTest{
  public static void main(String[] args) {
    String cbu = "A123DR456AS";
    float balance = 10000;

    BankAccount account = new BankAccount(cbu, balance);

    Scanner input = new Scanner(System.in);
    System.out.println("Informacion de tu BankAccount:");
    System.out.println("1. CBU");
    System.out.println("2. Balance");
    System.out.println("3. Depositar");
    System.out.println("4. Retirar");
    System.out.println("5. Salir");
    int num = input.nextInt();
      switch(num){
        case 1:
          BankAccount.getCBU();
          break;
        case 2:
          BankAccount.getBalance();
          break;
        case 3:
          System.out.println("Ingrese la cantidad a depositar: ");
          float a = input.nextFloat();
          BankAccount.deposit(a);
          break;
        case 4:
          System.out.println("Ingrese la cantidad a retirar: ");
          float b = input.nextFloat();
          BankAccount.withdraw(b);
          break;
        case 5:
          System.out.println("Adios, vuelva pronto!");
          break;
        default:
          System.out.println("Invalid option");
          break;
    }
  }
}
