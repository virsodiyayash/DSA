import java.util.Scanner;

public class Seconds {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of seconds");
        int seconds = sc.nextInt();

        int minutes = seconds / 60;
        int remainingSeconds = seconds % 60;

        int hour = minutes / 60;
        int remainingMinutes = minutes % 60;

        System.out.println(hour + ":" + remainingMinutes + ":" + remainingSeconds);
    }
}
