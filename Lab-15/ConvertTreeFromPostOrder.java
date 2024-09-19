import java.util.Scanner;

class Node{
    int data;
    Node leftNode;
    Node rightNode;

    public Node(int data){
        this.data = data;
        leftNode = null;
        rightNode = null;
    }
}

class constructInOrder{
    int preIndex;
    int postIndex;

    public constructInOrder(){
        preIndex = 0;
        postIndex = 0;
    }

    public Node convertFromPrePost(int [] pre , int [] post){

        if (preIndex >= pre.length || postIndex >= post.length) {
            return null;
        }
        
        Node root = new Node(pre[preIndex++]);

        if(root.data != post[postIndex]){
            root.leftNode = convertFromPrePost(pre, post);
        }

        if(root.data != post[postIndex]){
            root.rightNode = convertFromPrePost(pre, post);
        }

        postIndex++;

        return root;
    }

    public void printInOrder(Node root){
        if(root == null){
            return;
        }

        printInOrder(root.leftNode);
        System.out.println(root.data + " ");
        printInOrder(root.rightNode);
    }
}


public class ConvertTreeFromPostOrder{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of the array = ");
        int length = sc.nextInt();


        System.out.println("Enter the element of the array for preOrder: ");
        int [] pre = new int[length];
        
        for(int i = 0 ; i < length ; i++){
            pre[i] = sc.nextInt();
        }

        System.out.println("Enter the element of the array for PostOrder :");
        int [] post = new int[length];
        
        for(int i = 0 ; i < length ; i++){
            post[i] = sc.nextInt();
        }
        
        constructInOrder ct = new constructInOrder();
        Node root = ct.convertFromPrePost(pre , post);
        
        System.out.println("inorder");
        ct.printInOrder(root);
    }
}