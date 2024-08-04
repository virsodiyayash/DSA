class PriorityQueue{
    int[] arr; 
    int front; 
    int rear;   
    int size;   

    
    public PriorityQueue(int size) {
        this.size = size;
        this.arr = new int[size];
        this.rear = this.front = -1; 
    }

    
    public void insert(int element) {
        if (rear - front >= size - 1) { 
            System.out.println("Queue Overflow");
            return;
        }
        if (front == -1) { 
            front = rear = 0;
            arr[front] = element;
            return;
        }
        int j = rear;
       
        while (j >= 0 && arr[j] > element) {
            arr[j + 1] = arr[j];
            j--;
        }
        arr[j + 1] = element; 
        rear++;
        display(); 
    }

  
    public int delete() {
        if (front == -1) { 
            System.out.println("Queue Underflow");
            return -1;
        }
        
        int j = front;
        int element = arr[front]; 
        while (j < rear) {
            arr[j] = arr[j + 1];
            j++;
        }
        arr[j] = 0;
        if (front == rear) { 
            front = rear = -1;
        } else {
            rear--;
        }
        display();
        return element; 
    }

   
    public void display() {
        if (front == -1) { 
            System.out.println("Empty Queue");
            return;
        }
        for (int i = front; i <= rear; i++) {
            System.out.print(arr[i] + " "); 
        }
        System.out.println();
    }
}


public class PriorityQueueDemo {
    public static void main(String[] args){
        PriorityQueue pq = new PriorityQueue(10);
        pq.insert(5);
        pq.insert(3);
        pq.insert(8);
        pq.insert(1);

        pq.display();

        System.out.println("Deleted element is = " + pq.delete());
        pq.display();

        System.out.println("Deleted element is = " + pq.delete());
        pq.display();
    }
}
