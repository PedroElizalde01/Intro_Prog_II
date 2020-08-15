import java.util.Scanner;

public class Hotel {
  public static void main(String[] args) {
    int n = 0;
    Scanner input = new Scanner(System.in);
    while (true){
      System.out.println("¿Desea registrar un cliente?");
      String answer = input.nextLine();
      if(answer == "no"){
        System.out.println("Gracias por contar con nosotros");
        break;
      } else {
        createUser();
        n = n+1;

      }

    }
  }
  public static Register createUser(){
    Scanner input = new Scanner(System.in);
    System.out.println("Nombre:");
    String name = input.nextLine();
    System.out.println("Apellido:");
    String lastname = input.nextLine();
    System.out.println("DNI:");
    String dni = input.nextLine();
    System.out.println("Fecha y hora:");
    String date = input.nextLine();
    System.out.println("Rol:");
    String rol = input.nextLine();

    Register client = new Register(name, lastname, dni, date, rol);
    return client;
  }
}
