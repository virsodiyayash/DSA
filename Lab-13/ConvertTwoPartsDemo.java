class TwoParts{
    Node head = null;

    public void insertAtEnd(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            head.next = head;
            return;
        }

        Node temp = head;

        while(temp.next != head){
            temp = temp.next;
        }

        temp.next = newNode;
        newNode.next = head;
    }

    public void display(Node head){

        if(head == null){
            System.out.println("List is empty");
            return;
        }

        Node temp = head;

       do{
        System.out.print(temp.data + " ");
        temp = temp.next;
       }while(temp != head);
       
       System.out.println();

    }

    public void divide(){
        if(head == null && head.next == null){
            return;
        }

        Node slow = head;
        Node fast = head;

        while(fast.next != head && fast.next.next != head){
            slow = slow.next;
            fast = fast.next.next;
        }

        Node head1 = head;
        Node head2 = slow.next;

        slow.next = head1;

        if(fast.next == head){
            fast.next = head2;
        }
        else{
            fast.next.next = head2;
        }

        display(head1);
        display(head2);
    }
}

public class ConvertTwoPartsDemo {
    public static void main(String[] args){
        TwoParts tw = new TwoParts();
        tw.insertAtEnd(1);
        tw.insertAtEnd(2);
        tw.insertAtEnd(3);
        tw.insertAtEnd(4);
        tw.insertAtEnd(5);
        tw.insertAtEnd(6);
        tw.insertAtEnd(7);
        tw.insertAtEnd(8);
        tw.insertAtEnd(9);
        tw.insertAtEnd(10);

        tw.divide();
    }
}
