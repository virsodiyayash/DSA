public class CircularList{

    public void addNumbers(int val){
         Node newNode = new Node(val);

        Node head = null;

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

    public static void main(String[] args){

        Node newNode = new Node();
        

    }
}
