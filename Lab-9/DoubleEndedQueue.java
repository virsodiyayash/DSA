class DouQueue{
    int [] queue;
    int r;
    int l;
    int n;

    DouQueue(int n){
        this.n = n;
        queue = new int[n];
        this.r = -1;
        this.l = -1;
    }

    public void addFirst(int data){
        if(l == -1){
            l = 0;
            r = 0;
        }

        else if(l == 0){
            System.out.println("Queue is overflow");
            return;
        }

        else{
            l = l - 1;
        }
    
        queue[l] = data;
    }

    public void addLast(int data){
        if(r >= n-1){
            System.out.println("Queue is overflow");
            return;
        }

        if(r == -1){
            l = 0;
            r = 0;
        }

        else{
            r = r + 1;
        }
        
        queue[r] = data;
    }

    public int deleteLast(){
        if(r == -1 || r < l){
            System.out.println("Queue is underflow");
            return -1;
        }

        int temp = queue[r];
        queue[r] = 0;

        if(l == r){
            l = -1;
            r = -1;
        }

        else{
            r--;
        }

        return temp;
    }

    public int deleteFirst(){
    
        if(l == -1 || l > r){
            System.out.println("Queue Underflow");
            return -1;
        }

       int temp = queue[l];
        queue[l] = 0;

       if(l == r){
        l = -1;
        r = -1;
       }

       else{
        l++;    
       }

       return temp;
    }

    public void print(){

        if(l == -1){
            System.out.println("Queue is underflow");
        }

        else{
            for(int i = l ; i <= r ; i++){
                System.out.print(queue[i] + " ");
            }
            System.out.println();
        }
       
    }
}

public class DoubleEndedQueue {
    public static void main(String[] args){
        DouQueue dq = new DouQueue(5);

        dq.addLast(5);
        dq.addLast(9);
        dq.addLast(12);
        dq.addLast(15);
        dq.addLast(20);

        dq.print();

       dq.deleteFirst();
       dq.deleteFirst();

       dq.addFirst(29);
       dq.addFirst(0);

       dq.deleteLast();
       dq.deleteLast();

       dq.addLast(88);
       dq.addLast(99);

       dq.print();
        
    }
}
