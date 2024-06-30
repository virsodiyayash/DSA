import java.util.*;

public class DisplayNumber{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number = ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        boolean flag = false;

        for(int i = 0 ; i < n ; i++){
            System.out.print("Enter number = "+(i+1)+"  ");
            arr[i] = sc.nextInt();
        }
        for(int i = 0 ; i < n ; i++){
            for(int j = 1 ; j < n -1 ; j++){
                if(arr[i] == arr[j]){
                    flag = true;
                    break;
                }
            }
        }
        if(flag == true){
            System.out.println("Duplicate is available");
        }
        else{
            System.out.println("Duplicate is available");
        }
    }
}