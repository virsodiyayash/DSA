public class SwapNumber{

    static void  swap(int arr[] , int a , int b){
        arr[a] = arr[a] + arr[b];
        arr[b] = arr[a] - arr[b];
        arr[a] = arr[a] - arr[b];
    }

    static void  print(int arr[]){
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args){
        int [] arr = {10 , 20 , 30 , 40 , 50};
        print(arr);
        swap(arr , 2 , 3);
        print(arr);
    }
}