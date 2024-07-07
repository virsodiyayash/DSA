import java.util.Scanner;

class Node {
    int data;  
    Node next; 

    public Node(int data) {
        this.data = data; 
    }

    public Node() {
        //TODO Auto-generated constructor stub
    }

    public void display() {
        System.out.println("Data = " + this.data);
    }
}

public class ReadAndDisplay{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Node node = new Node(5);

        node.display();
    }
}