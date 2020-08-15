import java.util.Scanner;

public class Hotel {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("¿Cuántos clientes desea registrar?");
    int n = input.nextInt();
    String[] clients;
    for(int i = 0; i < n; i++){
      Register user = createUser();
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
