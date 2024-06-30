import java.util.Scanner;

class Student_Details{
    int Enrollment_No;
    String Name;
    int Semester;
    double cpi;

    Student_Details(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your enrollment no = ");
        Enrollment_No = sc.nextInt();

        System.out.println("Enter your name = ");
        Name = sc.next();

        System.out.println("Enter your Semester no = ");
        Semester = sc.nextInt();

        System.out.println("Enter your cpi no = ");
        cpi = sc.nextDouble();
    }

    void printDetails(){
        System.out.println("your enrollment no = "+Enrollment_No);
        System.out.println("your name = "+Name);
        System.out.println("Your semester = "+Semester);
        System.out.println("Your cpi = "+cpi);
    }
}

public class Student{
    public static void main(String[] args){
        Student_Details [] stu = new Student_Details[5];

        for(int i = 0 ; i < 5 ; i++){
            stu[i] = new Student_Details();
            stu[i].printDetails();
        }
    }
}