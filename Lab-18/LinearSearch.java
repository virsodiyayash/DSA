import java.util.Scanner;

public class LinearSearch{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the key you want to find in an array");
        int key = sc.nextInt();
        int flag = 0;

        int [] array = {1 , 2 , 3 , 5 , 6 , 8 , 9 , 15};

        for(int i = 0 ; i < array.length ; i++){
            if(array[i] == key){
                flag = 1;
                System.out.println("Your element is at index = "+i);
                return;
            }
        }
        if(flag == 1){
            System.out.println("Your element is in array");
        }
        else{
            System.out.println("Your element is not in an array");
        }
    }
}