class ListDemo{
    Node head = null;

    public void insertAtLastCircular(int val){
        Node newNode = new Node(val);

        if(head == null){
            head = newNode;
            newNode.next = head;
            return;
        }

        Node temp = head;

        while(temp.next != head){
            temp = temp.next;
        }

        temp.next = newNode;
        newNode.next = head;
    }

    public int countNode(){
        int count = 1;

        if(head == null){
            return 0;
        }
       
        Node temp = head.next;

        while(temp != head){
            count++;
            temp = temp.next;
        }
        return count;
    }
}

public class CountNodesInCircularList {
    public static void main(String[] args){
        ListDemo ld = new ListDemo();

        ld.insertAtLastCircular(2);
        ld.insertAtLastCircular(7);
        ld.insertAtLastCircular(11);
        ld.insertAtLastCircular(90);
        ld.insertAtLastCircular(54);

        System.out.println("Total number of counts are = " + ld.countNode());

    }
}
