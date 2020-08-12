import java.util.Scanner;
import java.util.Random;

public class Measurer{
  public static void main(String[] args) {
    int[] array = {-1, 0, 1};
    int repair = 0;
    int delete = 0;
    int valid = 0;

    Scanner input = new Scanner(System.in);
    System.out.println("Ingrese la cantidad de partes:");
    int n = input.nextInt();

    for(int i = 0; i < n; i++){
	int num = input.nextInt();
	if (num == -1){
		delete = delete + 1;
	} else if(num == 0){
		valid = valid +1;
	} else if(num == 1){
		repair = repair +1;
	}
     }
	System.out.println("Repair: " + repair + " Valid:" + valid + " Delete: " + delete);
  }
}
