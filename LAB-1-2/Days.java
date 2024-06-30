import java.util.Scanner;

public class Days {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of days = ");
        int days = sc.nextInt();

        int weeks = days / 7; // Calculate total weeks
        int remainingDays = days % 7; // Calculate remaining days

        int years = weeks / 52; // Calculate total years
        int remainingWeeks = weeks % 52; // Calculate remaining weeks


        System.out.println(years+" year "+remainingWeeks + " Weeks " + remainingDays + " Days");
    }
}
