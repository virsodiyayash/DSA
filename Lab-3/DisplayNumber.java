import java.util.*;

public class DisplayNumber{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number = ");
        int n = sc.nextInt();
        int [] arr = new int[n];

        for(int i = 0 ; i < n ; i++){
            System.out.print("Enter number = "+(i+1)+"  ");
            arr[i] = sc.nextInt();
        }
        for(int i = 0 ; i < n ; i++){
            System.out.print(arr[i] + " ");
        }
    }
}