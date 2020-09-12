import java.util.Scanner;

public class Administrator {
    public static void main(String[] args) {
        CardiacMonitor cardiacMonitor = new CardiacMonitor();
        System.out.println("Enter cardiac measurement");
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        Measurement measurement = new IntMeasurement(i);
        System.out.println(isOkay(cardiacMonitor, measurement));
    }

    public static String isOkay(Monitor monitor, Measurement measurement){
        if(monitor.isOkay(measurement)) return "OKAY!";
        return "NOT OKAY";
    }
}
