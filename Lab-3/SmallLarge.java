import java.util.*;

public class SmallLarge{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number = ");
        int n = sc.nextInt();
        int [] arr = new int[n];

        for(int i = 0 ; i < n ; i++){
            System.out.print("Enter number = "+(i+1)+"  ");
            arr[i] = sc.nextInt();
        }

        int pmax = 0;
        int pmin = 0;

        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] > arr[pmax]){
                pmax = i;
            }
            else if(arr[i] < arr[pmin]){
                pmin = i;
            }
        }

        System.out.println("Min number index is = "+pmin);
        System.out.println("max number index is = "+pmax);
       
    }
}