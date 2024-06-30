import java.util.*;

public class SumOfNumbers{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1 = ");
        int m = sc.nextInt();
        System.out.println("Enter number 1 = ");
        int n = sc.nextInt();
        int sum = 0;
        if(m > n){
            m = m + n;
            n = m - n;
            m = m - n;
        }

        for(int i = m ; i <= n ; i++){
            sum = sum + i;
        }
        System.out.println("sum is = "+sum);
    }
}