import java.util.Scanner;

public class ContainsDuplicate{
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int len = sc.nextInt();
            int arr[] = new int[len];

            for(int i = 0 ; i < len ; i++){
                arr[i] = sc.nextInt();
            }

            int count = 0;

            for(int i = 0 ; i < len ; i++){
                for(int j = 0 ; j < arr[i]; j++){
                    if(arr[i] == arr[j]){
                        count++;
                    }
                    if(i == j){
                        count--;
                    }
                }
            }
            if(count > 0){
                System.out.println("Contais duplicate element");
            }
            else{
                System.out.println("Doesn't contain duplicate element");
            }
        }
}