import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Ingrese la fecha de llegada:");
		int dd1 = input.nextInt();
		int mm1 = input.nextInt();
		System.out.println("Ingrese la fecha de salida:");
		int dd2 = input.nextInt();
		int mm2 = input.nextInt();
		Date date1 = new Date(dd1, mm1);
		Date date2 = new Date(dd2, mm2);
		Suite room = new Suite();
		Reserva reserva = new Reserva(room, date1, date2);

		System.out.println(reserva.roomType());
		System.out.println(reserva.firstDate());
		System.out.println(reserva.lastDate());
	}
}
