class LinkedList{
    Node head = null;

    public void insertAtFirst(int val){
        Node newNode = new Node(val);

        if(head == null){
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    public void insertAtLast(int val){
        Node newNode = new Node(val);

        if(head == null){
            head = newNode;
            return;
        }

        Node temp = head;

        while(temp.next != null){
            temp = temp.next;
        }

        temp.next = newNode;

    }

    public void deleteFirst(){
        if(head == null){
            System.out.println("There is no node available");
            return;
        }

        head = head.next;
    }

    public void deleteLast(){
        if(head == null){
            System.out.println("There is no node available");
        }
        Node temp = head;

        while(temp.next.next != null){
            temp = temp.next;
        }
        temp.next = null;
    }

    public void deleteAtPerfect(int val){

        if(head == null){
            System.out.println("There is no node available");
            return;
        }

        if(head.data == val){
            head = head.next;
            return;
        }

        Node temp = head;

        while(temp.next != null && temp.next.data != val){
            temp = temp.next;
        }

        if(temp.next == null){
            System.out.println("There is no element available");
            return;
        }

            temp.next = temp.next.next;
        
    }

    public void display(){
       
        Node temp = head;

        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
       System.out.println();
    }
}

public class ImplementMenuDriven {
    public static void main(String[] args){
        LinkedList ll = new LinkedList();

        ll.insertAtLast(12);
        ll.insertAtLast(54);
        ll.insertAtLast(72);
        ll.insertAtLast(24);
        ll.insertAtLast(69);

        System.out.println("Display after insert last");
        ll.display();

        ll.insertAtFirst(2);
        ll.insertAtFirst(5);
        ll.insertAtFirst(8);
        ll.insertAtFirst(3);
        ll.insertAtFirst(7);

        System.out.println("Display after insert first");
        ll.display();

        System.out.println("Display after delete first Node");
        ll.deleteFirst();
        ll.display();

        System.out.println("Display after delete last Node");
        ll.deleteLast();
        ll.display();

        System.out.println("Delete specific number");
        ll.deleteAtPerfect(5);
        ll.display();


    }
}
