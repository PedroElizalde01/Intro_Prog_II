import java.util.Scanner;

public class Sum{
	public static void main(String[] args){

		Scanner input = new Scanner(System.in);
		int num  = 0;

		while (true){
			int n = input.nextInt();
			if(n == 0){
				break;
			} else {
				num = num + n;
			}
		}
		System.out.println(num);

	}
}