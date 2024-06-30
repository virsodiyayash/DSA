import java.util.Scanner;

class Employee{
    int employee_ID;
    String name , designation;
    double salary;

    Employee(){
       Scanner sc = new Scanner(System.in);
       
       System.out.println("Enter your id no = ");
        employee_ID = sc.nextInt(); 

        System.out.println("Enter your name = ");
         name = sc.next();

        System.out.println("Enter your designation = ");
         designation = sc.next();

        System.out.println("Enter your salary = ");
         salary = sc.nextDouble();
    }

    void printDeatils(){
        System.out.println("Employee_ID = "+employee_ID);
        System.out.println("Employee Name = "+name);
        System.out.println("Employee designation = "+designation);
        System.out.println("Employee salary = "+salary);
    }
}


public class Employee_Details{
    public static void main(String[] args){
        Employee e1 = new Employee();
        e1.printDeatils();
    }
}