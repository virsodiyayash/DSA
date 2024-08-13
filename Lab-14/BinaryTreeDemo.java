public class BinaryTreeDemo{
    public static void main(String[] args){
        int [] arr = {1 , 2 , 3 , 4 , 5 , 6};
        BinaryTree b = new BinaryTree();
        int index = 0;
        Node root = b.buildBinaryTree(arr , index);
        System.out.println("The root node is = "+root.data);
    }
}

class Node{
    int data;
    Node left;
    Node right;

    public Node(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

class BinaryTree{
    
    public Node buildBinaryTree(int [] arr , int idx){

        if(idx >= arr.length){
            return null;
        }

        Node newNode = new Node(arr[idx]);
        newNode.left = buildBinaryTree(arr , (2 * idx) + 1);
        newNode.right = buildBinaryTree(arr, (2 * idx) + 2);
         
        return newNode;


    }
}