import java.util.Scanner;

public class StackMethods{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of an array = ");
        int n = sc.nextInt();

        Stack stack = new Stack(n);

        int c = 1;
        while(c > 6){
            System.out.println("Enter 1 for push");
            System.out.println("Enter 2 for pop");
            System.out.println("Enter 3 for peep");
            System.out.println("Enter 4 for change");
            System.out.println("Enter 5 for display");
            System.out.println("Enter 6 for break");

            System.out.println("Enter your number");
            c = sc.nextInt();

            switch(c){
                case 1:
                    System.out.println("Enter a number = ");
                    int num = sc.nextInt();
                    stack.push(num);
                    break;

                case 2:
                    int ret = stack.pop();
                    if(ret > -1){
                        System.out.println("Element given by method is = "+ret);
                    }
                    break;

                case 3:
                    System.out.println("Enter index = ");
                    int i = sc.nextInt();
                    int del = stack.peep(i);
                    if(del != -1){
                        System.out.println("Number is = "+del);
                    }
                    
                    break;

                case 4:
                    System.out.println("Enter Index = ");
                    int j = sc.nextInt();
                    System.out.println("Enter number = ");
                    int m = sc.nextInt();
                    stack.change(j , m);
                    break;

                case 5:
                    stack.display();
                    break;

                default :
                    break;
            }
         }
    }
}
class Stack{
    int arr[];
    int top;

    public Stack(int n){
        arr = new int[n];
        top = -1;
    }

    public void push(int num){
        if(top >= arr.length - 1){
            System.out.println("Stack Overflow");
            return;
        }
        else{
            top = top + 1;
            arr[top] = num;
        }
    }

    public int pop(){
        if(top <= -1){
            System.out.println("Stack Underflow");
            return -1;
        }
        else{
            top = top - 1;
            return arr[top + 1];
        }
    }

    public int peep(int p){
        int temp = top - p + 1;

        if(temp <= -1){
            System.out.println("Invalid Number");
        }
        else{
            return arr[temp];
        }
        return 0;
    }

    public void change(int p , int num){
        int temp = top - p + 1;

        if(temp <= -1){
            System.out.println("Invalid Number");
        }

        arr[temp] = num;
        System.out.println("Changed array is = ");
        
        for(int i = 0 ; i < arr.length ; i++){
            System.out.println(arr[i] + " ");
        }
    }

    public void display(){
        if(top == -1){
            System.out.println("Stack Underflow");
        }
        else{
            for(int i = 0 ; i < arr.length ; i++){
                System.out.println(arr[i] + " ");
            }
        }
    }

}
