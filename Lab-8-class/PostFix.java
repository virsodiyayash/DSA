import java.util.Scanner;
import java.util.Stack;


public class PostFix{
    public static int InputPrecedence(char ch){
        if(ch == ' '){
            return 0;
        }

        if(ch == '+' || ch == '-'){
            return 1;
        }

        if(ch == '*' || ch == '/'){
            return 3;
        }

        if(ch == '^'){
            return 6;
        }

        if(ch == '('){
            return 9;
        }

        if(ch == ')'){
            return 0;
        }

            return 7;
       

    }

    public static int stackPrecedence(char ch){

        if(ch == '+' || ch == '-'){
            return 2;
        }

        if(ch == '*' || ch == '/'){
            return 4;
        }

        if(ch == '^'){
            return 5;
        }

        if(ch == '('){
            return 0;
        }

            return 8;
        

    }

    public static int rank(char ch){
        if(InputPrecedence(ch) == 7){
            return 1;
        }
        return -1;
    }

    public static String isCheck(String str){
        Stack<Character> stack = new Stack<>();
        String polish = "";
        int rank = 0;
        
        stack.push('(');
        str += ')';
        
        for(int i = 0 ; i < str.length() ; i++){
            char next = str.charAt(i);

                while(stackPrecedence(stack.peek()) > InputPrecedence(next)){

                    char top = stack.pop();
                    polish = polish + top;
                    rank = rank + rank(top);

                    if(rank < 1){
                        System.out.println("Invalid");
                        return "Invalid";
                    }
            }

            if(stackPrecedence(stack.peek()) != InputPrecedence(str.charAt(i))){
                stack.push(str.charAt(i));
            }
            else{
                stack.pop();
            }
        }
        System.out.println("Your rank is = "+rank);
        return polish;
    }



    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your String value = ");
        String str = sc.next();

        String ans = isCheck(str);
        System.out.println("Answer of Your String is = "+ans);
    }
}