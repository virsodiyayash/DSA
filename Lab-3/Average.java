import java.util.*;

public class Average{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number = ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        int sum = 0;

        for(int i = 0 ; i < n ; i++){
            System.out.print("Enter number = "+(i+1)+" : ");
            arr[i] = sc.nextInt();
        }
        
        for(int i = 0 ; i < n ; i++){
            sum = sum + arr[i];
        }

        System.out.println("Average of an array is = "+(double)sum/n);
        
    }
}