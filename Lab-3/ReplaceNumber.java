import java.util.Scanner;

public class ReplaceNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array = ");
        int len = sc.nextInt();
        int [] arr = new int[len];

        System.out.println("Enter the number which you want to replace: ");
        int oldNum = sc.nextInt();

        System.out.println("Enter the new number: ");
        int newNum = sc.nextInt();

        for(int i = 0 ; i < len ; i++){
            arr[i] = sc.nextInt();
        }

        for(int i = 0 ; i < len ; i++){
            if(arr[i] == oldNum){
                arr[i] = newNum;
                System.out.println("Index of the new number is = "+i);
            }
        }

        for(int i = 0 ; i < len ; i++){
            System.out.print(arr[i]+" ");
        }

    }
}
