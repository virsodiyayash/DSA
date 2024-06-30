import java.util.Scanner;
public class BankAccDemo {
    public static void main(String[] args) {
        BankAcc[] b1 = new BankAcc[4];
        for(int i=0;i<5;i++){
            b1[i].deposite();
        }
    }
}

class BankAcc{
    int accNumber;
    int balance;
    public BankAcc(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your acc number :");
        this.accNumber = sc.nextInt();
        System.out.println("eneter your balance :");
        this.balance = sc.nextInt();
    }
    public void deposite(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your amount :");
        int deposite = sc.nextInt();
        balance += deposite;
        System.out.println("your balance is :"+balance);
    }
    public void withdraw(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your amount :");
        int withdraw = sc.nextInt();
        balance -= withdraw;
        System.out.println("your balance is :"+balance);
    }
}
